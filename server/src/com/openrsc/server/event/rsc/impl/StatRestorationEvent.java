package com.openrsc.server.event.rsc.impl;

import com.openrsc.server.constants.SkillsEnum;
import com.openrsc.server.event.rsc.GameTickEvent;
import com.openrsc.server.model.entity.Mob;
import com.openrsc.server.model.entity.player.Player;
import com.openrsc.server.model.entity.player.Prayers;
import com.openrsc.server.model.entity.update.HpUpdate;
import com.openrsc.server.model.world.World;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

import static com.openrsc.server.util.SkillSolver.getSkillId;

/**
 * Hit restoration event is independent of the other stats
 * The restoration tick may be re-synced if player has no stats to restore and new
 * trigger occurs such as drinking a potion
 */
public class StatRestorationEvent extends GameTickEvent {

	private HashMap<Integer, Integer> restoringStats = new HashMap<Integer, Integer>();
	private AtomicReference<Boolean> restoringHits = new AtomicReference<Boolean>(false);
	private long lastStatRestoration = System.currentTimeMillis();
	private long lastHitRestoration = System.currentTimeMillis();
	private long numberSkills;

	public StatRestorationEvent(World world, Mob mob) {
		super(world, mob, 1, "Stat Restoration Event");
		numberSkills = mob.isPlayer() ? world.getServer().getConstants().getSkills().getSkillsCount() : 4;
	}

	@Override
	public void run() {
		boolean isPlayerAbsent = getOwner().isPlayer() && (getPlayerOwner() == null || getPlayerOwner().isRemoved());
		boolean isNpcAbsent = getOwner().isNpc() && (getNpcOwner() == null || (getNpcOwner().isRemoved() && getNpcOwner().isUnregistering()));
		if (getOwner() == null || isPlayerAbsent || isNpcAbsent) {
			running = false;
			return;
		}

		boolean restoredStats = false;
		boolean restoredHits = false;
		long deltaCycles;

		// Add new skills to the restoration cycle
		for (int skillIndex = 0; skillIndex < numberSkills; skillIndex++) {
			if (skillIndex != getSkillId(getWorld(), SkillsEnum.PRAYER)) {
				checkAndStartRestoration(skillIndex);
			}
		}

		// Check for Hits
		if (restoringHits.get()) {
			long delay = 100 * getWorld().getServer().getConfig().GAME_TICK; // 64 seconds in authentic rate
			if (getOwner().isPlayer()) {
				Player player = (Player) getOwner();
				if (player.getPrayers().isPrayerActivated(Prayers.RAPID_HEAL)) {
					delay = 50 * getWorld().getServer().getConfig().GAME_TICK;
				}
			}
			deltaCycles = (System.currentTimeMillis() - this.lastHitRestoration) / delay;
			if (System.currentTimeMillis() - this.lastHitRestoration > delay && getOwner().isPlayer()) {
				normalizeLevel(getSkillId(getWorld(), SkillsEnum.HITS));
				restoredHits = true;
				if (((Player) getOwner()).getParty() != null) {
					getOwner().getUpdateFlags().setHpUpdate(new HpUpdate(getOwner(), 0));
					if (getWorld().getServer().getConfig().WANT_PARTIES) {
						if (((Player) getOwner()).getParty() != null) {
							((Player) getOwner()).getParty().sendParty();
						}
					}
				}
			} else if (!getOwner().isPlayer() &&
				(System.currentTimeMillis() - (this.lastHitRestoration + deltaCycles * delay)) / (delay / 100) == 1) {
				// npc only gets heal cycle sync on (re)spawn
				normalizeLevel(getSkillId(getWorld(), SkillsEnum.HITS));
			}
		}

		// Every other skill
		Iterator<Entry<Integer, Integer>> it = restoringStats.entrySet().iterator();
		while (it.hasNext()) {

			Entry<Integer, Integer> set = it.next();
			int stat = set.getKey();

			long delay = 100 * getWorld().getServer().getConfig().GAME_TICK; // 64 seconds in authentic rate
			if (getOwner().isPlayer()) {
				Player player = (Player) getOwner();
				if (player.getPrayers().isPrayerActivated(Prayers.RAPID_RESTORE)) {
					delay = 50 * getWorld().getServer().getConfig().GAME_TICK;
				}
			}
			if (System.currentTimeMillis() - this.lastStatRestoration > delay) {
				normalizeLevel(stat);
				restoredStats = true;
				if (restoringStats.get(stat) == 0) {
					it.remove();
					if (getOwner().isPlayer()) {
						Player player = (Player) getOwner();
						player.message("Your " + getOwner().getWorld().getServer().getConstants().getSkills().getSkillName(stat).toLowerCase()
							+ " ability has returned to normal.");
					}
				}
			}
		}
		if (restoredHits) {
			this.lastHitRestoration = System.currentTimeMillis();
		}
		if (restoredStats) {
			this.lastStatRestoration = System.currentTimeMillis();
		}
	}

	/**
	 * Normalises level to max level by 1.
	 *
	 * @param skill
	 * @return true if action done, false if skill is already normal
	 */
	private void normalizeLevel(int skill) {
		int cur = getOwner().getSkills().getLevel(skill);
		int norm = getOwner().getSkills().getMaxStat(skill);
		int diff = 0;

		if (cur > norm) {
			getOwner().getSkills().setLevel(skill, cur - 1, true);
			diff = -1;
		} else if (cur < norm) {
			getOwner().getSkills().setLevel(skill, cur + 1, true);
			diff = 1;
		}

		cur += diff;
		if (cur == norm) {
			if (skill == getSkillId(getWorld(), SkillsEnum.HITS)) {
				restoringHits.set(false);
			} else {
				restoringStats.put(skill, 0);
			}
		}
	}

	private boolean needsRestore(int id) {
		int curStat = getOwner().getSkills().getLevel(id);
		int maxStat = getOwner().getSkills().getMaxStat(id);
		return curStat > maxStat || curStat < maxStat;
	}

	private void checkAndStartRestoration(int id) {
		boolean toRestore = needsRestore(id);

		if (id == getSkillId(getWorld(), SkillsEnum.HITS)) {
			if (restoringHits.get()) {
				return;
			}
			if (toRestore) {
				restoringHits.set(true);
			}
		} else {
			if (restoringStats.containsKey(id)) {
				return;
			}
			if (toRestore) {
				restoringStats.put(id, 1);
			}
		}
	}

	public void tryResyncStat() {
		if (restoringStats.size() == 0) {
			this.lastStatRestoration = System.currentTimeMillis();
		}
	}

	public void tryResyncHit() {
		boolean toRestore = needsRestore(getSkillId(getWorld(), SkillsEnum.HITS));

		if (!toRestore) {
			this.lastHitRestoration = System.currentTimeMillis();
			restoringHits.set(false);
		}
	}
}
