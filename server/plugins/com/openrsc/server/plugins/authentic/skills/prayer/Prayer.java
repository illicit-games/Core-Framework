package com.openrsc.server.plugins.authentic.skills.prayer;

import com.openrsc.server.constants.SkillsEnum;
import com.openrsc.server.model.entity.GameObject;
import com.openrsc.server.model.entity.player.Player;
import com.openrsc.server.plugins.triggers.OpLocTrigger;
import com.openrsc.server.util.rsc.MessageType;

import static com.openrsc.server.plugins.Functions.*;
import static com.openrsc.server.util.SkillSolver.getSkillId;

public class Prayer implements OpLocTrigger {

	@Override
	public void onOpLoc(Player player, final GameObject object, String command) {
		boolean wantsRecharge = command.equalsIgnoreCase("recharge at");
		boolean allowRecharge = !player.getConfig().LACKS_PRAYERS;
		if (wantsRecharge && !allowRecharge) {
			player.message("World does not feature prayers!");
		} else if (wantsRecharge && allowRecharge) {
			int maxPray = getMaxLevel(player, getSkillId(player.getWorld(), SkillsEnum.PRAYER)) + (object.getID() == 200 ? 2 : 0);
			if (getCurrentLevel(player, getSkillId(player.getWorld(), SkillsEnum.PRAYER)) == maxPray) {
				player.playerServerMessage(MessageType.QUEST, "You already have full prayer points");
				player.setPrayerStatePoints(maxPray * 120);
			} else {
				player.playerServerMessage(MessageType.QUEST, "You recharge your prayer points");
				player.playSound("recharge");
				if (getCurrentLevel(player, getSkillId(player.getWorld(), SkillsEnum.PRAYER)) < maxPray) {
					player.getSkills().setLevel(getSkillId(player.getWorld(), SkillsEnum.PRAYER), maxPray);
				}
			}
		}
		// chaos altar in Yanille dungeon is a trapdoor
		if (wantsRecharge && (object.getID() == 625 && object.getY() == 3573)) {
			delay();
			mes("Suddenly a trapdoor opens beneath you");
			delay(3);
			player.teleport(608, 3525);
		}
	}

	@Override
	public boolean blockOpLoc(Player player, GameObject obj, String command) {
		return command.equals("recharge at");
	}

}
