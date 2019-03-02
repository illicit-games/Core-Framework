package com.openrsc.server.external;

import java.util.HashMap;
import java.util.Map;

public enum NpcId {
	/**
	 * 794 NPCs, but some need to be refactored and are commented at the moment.
	 * Others are attackable monsters and don't have particular behavior
	 */
	
	NOTHING(-1),
	UNICORN(0),
	BOB(1),
	SHEEP(2),
	//CHICKEN(3),
	//GOBLIN(4),
	HANS(5),
	//COW(6),
	COOK(7),
	//BEAR(8),
	PRIEST(9),
	URHNEY(10),
	//MAN(11),
	BARTENDER_VARROCK(12),
	CAMEL(13),
	GYPSY(14),
	GHOST_RESTLESS(15),
	SIR_PRYSIN(16),
	TRAIBORN_THE_WIZARD(17),
	CAPTAIN_ROVIN(18),
	RAT(19),
	RELDO(20),
	MUGGER(21),
	LESSER_DEMON(22),
	//GIANT_SPIDER(23),
	STRAVEN(24),
	JONNY_THE_BEARD(25),
	BARAEK(26),
	KATRINE(27),
	TRAMP(28),
	RAT_WITCHES_POTION(29),
	ROMEO(30),
	JULIET(31),
	FATHER_LAWRENCE(32),
	APOTHECARY(33),
	SPIDER(34),
	DELRITH(35),
	VERONICA(36),
	WEAPONSMASTER(37),
	PROFESSOR_ODDENSTEIN(38),
	CURATOR(39),
	//SKELETON(40),
	//ZOMBIE(41),
	KING(42),
	GIANT_BAT(43),
	BARTENDER_OUTSIDE_VARROCK(44),
	//SKELETON(45),
	//SKELETON(46),
	//RAT(47),
	HORVIK_THE_ARMOURER(48),
	//BEAR(49),
	SKELETON_RESTLESS(50),
	SHOPKEEPER_VARROCK(51),
	//ZOMBIE(52),
	//GHOST(53),
	AUBURY(54),
	SHOPKEEPER_LUMBRIDGE(55),
	SHOPKEEPER_VARROCK_SWORD(56),
	//DARKWIZARD(57),
	LOWE(58),
	THESSALIA(59),
	//DARKWIZARD(60),
	GIANT(61),
	//GOBLIN(62),
	//FARMER(63),
	//THIEF(64),
	//GUARD(65),
	BLACK_KNIGHT(66),
	//HOBGOBLIN(67),
	//ZOMBIE(68),
	ZAFF(69),
	//SCORPION(70),
	SILK_TRADER(71),
	//MAN(72),
	GUIDE_UNRELEASED1(73),
	GIANT_SPIDER(74),
	PEKSA(75),
	BARBARIAN(76),
	FRED_THE_FARMER(77),
	GUNTHOR_THE_BRAVE(78),
	//WITCH(79),
	//GHOST(80),
	//WIZARD(81),
	SHOP_ASSISTANT_VARROCK(82),
	SHOP_ASSISTANT_LUMBRIDGE(83),
	ZEKE(84),
	LOUIE_LEGS(85),
	ALKHARID_WARRIOR(86),
	SHOPKEEPER_ALKHARID(87),
	SHOP_ASSISTANT_ALKHARID(88),
	HIGHWAYMAN(89),
	KEBAB_SELLER(90),
	ERNEST_CHICKEN(91),
	ERNEST(92),
	MONK(93),
	//DWARF(94),
	BANKER_GEN1(95),
	COUNT_DRAYNOR(96),
	MORGAN(97),
	DR_HARLOW(98),
	DEADLY_RED_SPIDER(99),
	GUARD_FORTRESS(100),
	CASSIE(101),
	WHITE_KNIGHT(102),
	RANAEL(103),
	//MOSS_GIANT(104),
	SHOPKEEPER_FALADOR(105),
	SHOP_ASSISTANT_FALADOR(106),
	WITCH_FORTRESS(107),
	BLACK_KNIGHT_FORTRESS(108),
	GRELDO(109),
	SIR_AMIK_VARZE(110),
	GUILDMASTER(111),
	VALAINE(112),
	DROGO(113),
	IMP(114),
	FLYNN(115),
	WYSON_THE_GARDENER(116),
	WIZARD_MIZGOG(117),
	PRINCE_ALI(118),
	HASSAN(119),
	OSMAN(120),
	JOE(121),
	LEELA(122),
	LADY_KELI(123),
	NED(124),
	AGGIE(125),
	PRINCE_ALI_DISGUISE(126),
	JAILGUARD(127),
	REDBEARD_FRANK(128),
	WYDIN(129),
	SHOP_ASSISTANT_VARROCK_SWORD(130),
	BRIAN(131),
	SQUIRE(132),
	HEAD_CHEF(133),
	THURGO(134),
	ICE_GIANT(135),
	KING_SCORPION(136),
	//PIRATE(137),
	SIR_VYVIN(138),
	//MONK_OF_ZAMORAK(139),
	//MONK_OF_ZAMORAK(140),
	WAYNE(141),
	BARMAID(142),
	DWARVEN_SHOPKEEPER(143),
	DORIC(144),
	SHOPKEEPER_RIMMINGTON(145),
	SHOP_ASSISTANT_RIMMINGTON(146),
	GUIDE_UNRELEASED2(147),
	HETTY(148),
	BETTY(149),
	BARTENDER_PORTSARIM(150),
	GENERAL_WARTFACE(151),
	GENERAL_BENTNOZE(152),
	//GOBLIN(153),
	//GOBLIN(154),
	HERQUIN(155),
	ROMMIK(156),
	GRUM(157),
	ICE_WARRIOR(158),
	WARRIOR_VARROCK(159),
	THRANDER(160),
	BORDER_GUARD_LUMBRIDGE(161),
	BORDER_GUARD_ALKHARID(162),
	CUSTOMS_OFFICER(163),
	LUTHAS(164),
	ZAMBO(165),
	CAPTAIN_TOBIAS(166),
	GERRANT(167),
	SHOPKEEPER_KARAMJA(168),
	SHOP_ASSISTANT_KARAMJA(169),
	SEAMAN_LORRIS(170),
	SEAMAN_THRESNOR(171),
	TANNER(172),
	DOMMIK(173),
	ABBOT_LANGLEY(174),
	THORDUR(175),
	BROTHER_JERED(176),
	RAT_WMAZEKEY(177),
	GHOST_WMAZEKEY(178),
	SKELETON_WMAZEKEY(179),
	ZOMBIE_WMAZEKEY(180),
	LESSER_DEMON_WMAZEKEY(181),
	MELZAR_THE_MAD(182),
	SCAVVO(183),
	GREATER_DEMON(184),
	SHOPKEEPER_EDGEVILLE(185),
	SHOP_ASSISTANT_EDGEVILLE(186),
	OZIACH(187),
	//BEAR(188),
	BLACK_KNIGHT_AGGRESSIVE(189),
	CHAOS_DWARF(190),
	//DWARF(191),
	WORMBRAIN(192),
	KLARENSE(193),
	NED_BOAT(194),
	//SKELETON(195),
	DRAGON(196),
	ORACLE(197),
	DUKE_OF_LUMBRIDGE(198),
	DARK_WARRIOR(199),
	DRUID(200),
	RED_DRAGON(201),
	BLUE_DRAGON(202),
	BABY_BLUE_DRAGON(203),
	KAQEMEEX(204),
	SANFEW(205),
	SUIT_OF_ARMOUR(206),
	ADVENTURER_CLERIC(207),
	ADVENTURER_WIZARD(208),
	ADVENTURER_WARRIOR(209),
	ADVENTURER_ARCHER(210),
	LEPRECHAUN(211),
	MONK_OF_ENTRANA_PORTSARIM(212),
	MONK_OF_ENTRANA_ENTRANA(213),
	//ZOMBIE(214),
	MONK_OF_ENTRANA_UNRELEASED(215),
	TREE_SPIRIT(216),
	//COW(217),
	IRKSOL(218),
	FAIRY_LUNDERWIN(219),
	JAKUT(220),
	DOORMAN(221),
	FAIRY_SHOPKEEPER(222),
	FAIRY_SHOP_ASSISTANT(223),
	FAIRY_BANKER(224),
	GILES(225),
	MILES(226),
	NILES(227),
	GAIUS(228),
	FAIRY_LADDER_ATTENDANT(229),
	JATIX(230),
	MASTER_CRAFTER(231),
	BANDIT_AGGRESSIVE(232),
	NOTERAZZO(233),
	BANDIT_PACIFIST(234),
	FAT_TONY(235),
	DONNY_THE_LAD(236),
	BLACK_HEATHER(237),
	SPEEDY_KEITH(238),
	WHITE_WOLF_SENTRY(239),
	BOY(240),
	RAT_WITCHES_HOUSE(241),
	NORA_T_HAG(242),
	GREY_WOLF(243),
	SHAPESHIFTER_HUMAN(244),
	SHAPESHIFTER_SPIDER(245),
	SHAPESHIFTER_BEAR(246),
	SHAPESHIFTER_WOLF(247),
	WHITE_WOLF(248),
	PACK_LEADER(249),
	HARRY(250),
	THUG(251),
	FIREBIRD(252),
	ACHETTIES(253),
	ICE_QUEEN(254),
	GRUBOR(255),
	TROBERT(256),
	GARV(257),
	GUARD_PIRATE(258),
	GRIP(259),
	ALFONSE_THE_WAITER(260),
	CHARLIE_THE_COOK(261),
	GUARD_DOG(262),
	ICE_SPIDER(263),
	PIRATE(264),
	JAILER(265),
	LORD_DARQUARIUS(266),
	SETH(267),
	BANKER_GEN2(268),
	HELEMOS(269),
	CHAOS_DRUID(270),
	POISON_SCORPION(271),
	VELRAK_THE_EXPLORER(272),
	SIR_LANCELOT(273),
	SIR_GAWAIN(274),
	KING_ARTHUR(275),
	SIR_MORDRED(276),
	RENEGADE_KNIGHT(277),
	DAVON(278),
	BARTENDER_BRIMHAVEN(279),
	ARHEIN(280),
	MORGAN_LE_FAYE(281),
	CANDLEMAKER(282),
	LADY_LAKE(283),
	LADY_GROUND(284),
	LADY_UPSTAIRS(285),
	BEGGAR(286),
	MERLIN_CRYSTAL(287),
	THRANTAX(288),
	HICKTON(289),
	BLACK_DEMON(290),
	BLACK_DRAGON(291),
	POISON_SPIDER(292),
	//MONK_OF_ZAMORAK(293),
	HELLHOUND(294),
	ANIMATED_AXE(295),
	BLACK_UNICORN(296),
	FRINCOS(297),
	OTHERWORLDLY_BEING(298),
	OWEN(299),
	THORMAC_THE_SORCEROR(300),
	SEER(301),
	KHARID_SCORPION_TAVERLEY(302),
	KHARID_SCORPION_BARBARIAN(303),
	KHARID_SCORPION_MONASTERY(304),
	BARBARIAN_GUARD(305),
	BARTENDER_SEERS(306),
	AVAN(307),
	GEM_TRADER(308),
	DIMINTHEIS(309),
	CHEF(310),
	//HOBGOBLIN(311),
	//OGRE(312),
	BOOT_THE_DWARF(313),
	JOHNATHON(314),
	CHRONOZON(315),
	CAPTAIN_BARNABY(316),
	CUSTOMS_OFFICIAL(317),
	//MAN(318),
	//FARMER(319),
	WARRIOR_ARDOUGNE(320),
	//GUARD(321),
	KNIGHT(322),
	PALADIN(323),
	HERO(324),
	BAKER(325),
	SILK_MERCHANT(326),
	FUR_TRADER(327),
	SILVER_MERCHANT(328),
	SPICE_MERCHANT(329),
	GEM_MERCHANT(330),
	ZENESHA(331),
	KANGAI_MAU(332),
	WIZARD_CROMPERTY(333),
	RPDT_EMPLOYEE(334),
	HORACIO(335),
	AEMAD(336),
	KORTAN(337),
	ZOO_KEEPER(338),
	MAKE_OVER_MAGE(339),
	BARTENDER_ARDOUGNE(340),
	CHUCK(341),
	ROGUE(342),
	SHADOW_SPIDER(343),
	FIRE_GIANT(344),
	GRANDPA_JACK(345),
	SINISTER_STRANGER(346),
	BONZO(347),
	FORESTER(348),
	MORRIS(349),
	BROTHER_OMAD(350),
	THIEF(351),
	HEAD_THIEF(352),
	BIG_DAVE(353),
	JOSHUA(354),
	MOUNTAIN_DWARF(355),
	MOUNTAIN_DWARF_UNDERGROUND(356),
	BROTHER_CEDRIC(357),
	NECROMANCER(358),
	ZOMBIE(359),
	LUCIEN(360),
	THE_FIRE_WARRIOR_OF_LESARKUS(361),
	GUARDIAN_OF_ARMADYL_MALE(362),
	GUARDIAN_OF_ARMADYL_FEMALE(363),
	LUCIEN_EDGE(364),
	WINELDA(365),
	BROTHER_KOJO(366),
	DUNGEON_RAT(367),
	MASTER_FISHER(368),
	ORVEN(369),
	PADIK(370),
	SHOPKEEPER_FISHING_GUILD(371),
	LADY_SERVIL(372),
	GUARD_KHAZARD_BYPRISONER(373),
	GUARD_KHAZARD_BRIBABLE(374),
	GUARD_KHAZARD(375),
	GUARD_KHAZARD_MACE(376),
	JEREMY_SERVIL(377),
	JUSTIN_SERVIL(378),
	FIGHTSLAVE_JOE(379),
	FIGHTSLAVE_KELVIN(380),
	LOCAL(381),
	KHAZARD_BARTENDER(382),
	GENERAL_KHAZARD(383),
	KHAZARD_OGRE(384),
	GUARD_KHAZARD_ARENA_ENTRANCE(385),
	KHAZARD_SCORPION(386),
	HENGRAD(387),
	BOUNCER(388),
	STANKERS(389),
	DOCKY(390),
	SHOPKEEPER_PORTKHAZARD(391),
	FAIRY_QUEEN(392),
	MERLIN_LIBRARY(393),
	CRONE(394),
	HIGH_PRIEST_OF_ENTRANA(395),
	ELKOY(396),
	REMSAI(397),
	BOLKOY(398),
	LOCAL_GNOME(399),
	BOLREN(400),
	BLACK_KNIGHT_TITAN(401),
	KALRON(402),
	BROTHER_GALAHAD(403),
	TRACKER_1(404),
	TRACKER_2(405),
	TRACKER_3(406),
	KHAZARD_TROOP(407),
	COMMANDER_MONTAI(408),
	GNOME_TROOP(409),
	KHAZARD_WARLORD(410),
	SIR_PERCIVAL(411),
	FISHER_KING(412),
	MAIDEN(413),
	FISHERMAN(414),
	KING_PERCIVAL(415),
	UNHAPPY_PEASANT(416),
	HAPPY_PEASANT(417),
	CERIL(418),
	BUTLER(419),
	CARNILLEAN_GUARD(420),
	TRIBESMAN(421),
	HENRYETA(422),
	PHILIPE(423),
	CLIVET(424),
	CULT_MEMBER(425),
	LORD_HAZEEL(426),
	ALOMONE(427),
	KHAZARD_COMMANDER(428),
	CLAUS(429),
	FIRST_PLAGUE_SHEEP(430),
	SECOND_PLAGUE_SHEEP(431),
	THIRD_PLAGUE_SHEEP(432),
	FOURTH_PLAGUE_SHEEP(433),
	FARMER_BRUMTY(434),
	DOCTOR_ORBON(435),
	COUNCILLOR_HALGRIVE(436),
	EDMOND(437),
	CITIZEN_TIRED(438),
	CITIZEN_FRIGHTENED(439),
	CITIZEN_FRUSTRATED(440),
	CITIZEN_ANGRY(441),
	CITIZEN_DISILLUSIONED(442),
	JETHICK(443),
	MOURNER_BYALRENA(444),
	MOURNER_WESTARDOUGNE(445),
	TED_REHNISON(446),
	MARTHA_REHNISON(447),
	BILLY_REHNISON(448),
	MILLI_REHNISON(449),
	ALRENA(450),
	MOURNER_BYENTRANCE(451),
	CLERK(452),
	CARLA(453),
	BRAVEK(454),
	CAROLINE(455),
	HOLGART_LAND(456),
	HOLGART_PLATFORM(457),
	HOLGART_ISLAND(458),
	KENT(459),
	BAILEY(460),
	KENNITH(461),
	PLATFORM_FISHERMAN_GOLDEN(462),
	PLATFORM_FISHERMAN_PURPLE(463),
	PLATFORM_FISHERMAN_GRAY(464),
	ELENA(465),
	JINNO(466),
	WATTO(467),
	RECRUITER(468),
	HEAD_MOURNER(469),
	ALMERA(470),
	HUDON(471),
	HADLEY(472),
	RAT_TUTORIAL(473),
	COMBAT_INSTRUCTOR(474),
	GOLRIE(475),
	GUIDE_STARTING(476),
	KING_BLACK_DRAGON(477),
	COOKING_INSTRUCTOR(478),
	FISHING_INSTRUCTOR(479),
	FINANCIAL_ADVISOR(480),
	GERALD(481),
	MINING_INSTRUCTOR(482),
	ELENA_HOUSE(483),
	OMART(484),
	BANK_ASSISTANT(485),
	JERICO(486),
	KILRON(487),
	GUIDORS_WIFE(488),
	QUEST_ADVISOR(489),
	CHEMIST_UNRELEASED(490),
	MOURNER_BYENTRANCE2(491),
	MOURNER_DOOR(492),
	WILDERNESS_GUIDE(493),
	MAGIC_INSTRUCTOR(494),
	MOURNER_ILL(495),
	COMMUNITY_INSTRUCTOR(496),
	BOATMAN(497),
	SKELETON_MAGE(498),
	CONTROLS_GUIDE(499),
	NURSE_SARAH(500),
	TAILOR(501),
	MOURNER_ATTACK(502),
	GUARD_VARROCKGATE(503),
	CHEMIST(504),
	CHANCY(505),
	HOPS(506),
	DEVINCI(507),
	GUIDOR(508),
	CHANCY_BAR(509),
	HOPS_BAR(510),
	DEVINCI_BAR(511),
	KING_LATHAS(512),
	HEAD_WIZARD(513),
	MAGIC_STORE_OWNER(514),
	WIZARD_FRUMSCONE(515),
	TARGET_PRACTICE_ZOMBIE(516),
	TRUFITUS(517),
	COLONEL_RADICK(518),
	SOLDIER(519),
	BARTENDER_EAST_VARROCK(520),
	JUNGLE_SPIDER(521),
	JIMINUA(522),
	JOGRE(523),
	//GUARD(524),
	//OGRE(525),
	//GUARD(526),
	//GUARD(527),
	//SHOP_KEEPER(528),
	BARTENDER_YANILLE(529),
	FRENITA(530),
	OGRE_CHIEFTAN(531),
	ROMETTI(532),
	RASHILIYIA(533),
	BLURBERRY(534),
	HECKEL_FUNCH(535),
	ALUFT_GIANNE(536),
	HUDO_GLENFAD(537),
	IRENA(538),
	MOSOL(539),
	GNOME_BANKER(540),
	KING_NARNODE_SHAREEN(541),
	UNDEADONE(542),
	DRUCAS(543),
	TOURIST(544),
	KING_NARNODE_SHAREEN_UNDERGROUND(545),
	HAZELMERE(546),
	GLOUGH(547),
	SHAR(548),
	SHANTAY(549),
	CHARLIE(550),
	GNOME_GUARD_PRISON(551),
	GNOME_PILOT_GRANDTREE(552),
	MEHMAN(553),
	ANA(554),
	CHAOS_DRUID_WARRIOR(555),
	GNOME_PILOT_KARAMJA_BROKEN(556),
	SHIPYARD_WORKER_ENTRANCE(557),
	SHIPYARD_WORKER_WHITE(558),
	SHIPYARD_WORKER_BLACK(559),
	SHIPYARD_FOREMAN(560),
	SHIPYARD_FOREMAN_HUT(561),
	GNOME_GUARD(562),
	FEMI(563),
	FEMI_STRONGHOLD(564),
	ANITA(565),
	GLOUGH_UNDERGROUND(566),
	SALARIN_THE_TWISTED(567),
	BLACK_DEMON_GRANDTREE(568),
	GNOME_PILOT_KARAMJA(569),
	GNOME_PILOT_VARROCK(570),
	GNOME_PILOT_ALKHARID(571),
	GNOME_PILOT_WHITEMOUNTAIN(572),
	SIGBERT_THE_ADVENTURER(573),
	YANILLE_WATCHMAN(574),
	TOWER_GUARD(575),
	GNOME_TRAINER_ENTRANCE(576),
	GNOME_TRAINER_STARTINGNET(577),
	GNOME_TRAINER_PLATFORM(578),
	GNOME_TRAINER_ENDINGNET(579),
	BLURBERRY_BARMAN(580),
	GNOME_WAITER(581),
	GNOME_GUARD_GRANDTREE(582),
	//GNOME_CHILD(583),
	EARTH_WARRIOR(584),
	//GNOME_CHILD(585),
	//GNOME_CHILD(586),
	GULLUCK(587),
	GUNNJORN(588),
	ZADIMUS(589),
	BRIMSTAIL(590),
	//GNOME_CHILD(591),
	//GNOME_LOCAL(592),
	//GNOME_LOCAL(593),
	//MOSS_GIANT(594),
	GNOME_BALLER_2XP_OUTER1(595),
	GOALIE(596),
	GNOME_BALLER_1XP_INNER1(597),
	GNOME_BALLER_1XP_INNER2(598),
	GNOME_BALLER_1XP_INNER3(599),
	GNOME_BALLER_2XP_OUTER2(600),
	REFEREE(601),
	GNOME_BALLER_2XP_OUTER3(602),
	GNOME_BALLER_1XP_OUTER1(603),
	GNOME_BALLER_1XP_OUTER2(604),
	GNOME_BALLER_PASS1(605),
	GNOME_BALLER_PASS2(606),
	GNOME_BALLER_PASS3(607),
	GNOME_BALLER_PASS4(608),
	GNOME_BALLER_TEAMNORTH(609),
	GNOME_BALLER_TEAMSOUTH(610),
	CHEERLEADER(611),
	CHEERLEADER_UNRELEASED(612),
	NAZASTAROOL_ZOMBIE(613),
	NAZASTAROOL_SKELETON(614),
	NAZASTAROOL_GHOST(615),
	FERNAHEI(616),
	JUNGLE_BANKER(617),
	CART_DRIVER_BRIMHAVEN(618),
	CART_DRIVER_SHILO(619),
	OBLI(620),
	KALEB(621),
	YOHNUS(622),
	SEREVEL(623),
	YANNI(624),
	OFFICIAL(625),
	KOFTIK_ARDOUGNE(626),
	KOFTIK_CAVE1(627),
	KOFTIK_CAVE2(628),
	KOFTIK_CAVE3(629),
	BLESSED_VERMEN(630),
	BLESSED_SPIDER(631),
	PALADIN_UNDERGROUND_BEARD(632),
	PALADIN_UNDERGROUND(633),
	SLAVE_1(634),
	SLAVE_2(635),
	SLAVE_3(636),
	SLAVE_4(637),
	SLAVE_5(638),
	SLAVE_6(639),
	SLAVE_7(640),
	KALRAG(641),
	NILOOF(642),
	KARDIA_THE_WITCH(643),
	SOULESS_HUMAN(644),
	OTHAINIAN(645),
	DOOMION(646),
	HOLTHION(647),
	KLANK(648),
	IBAN(649),
	KOFTIK_CAVE4(650),
	GOBLIN_GUARD(651),
	OBSERVATORY_PROFESSOR(652),
	UGTHANKI(653),
	OBSERVATORY_ASSISTANT(654),
	SOULESS_UNDEAD(655),
	DUNGEON_SPIDER(656),
	KAMEN(657),
	IBAN_DISCIPLE(658),
	KOFTIK_RECOVERED(659),
	//GOBLIN(660),
	CHADWELL(661),
	PROFESSOR(662),
	SAN_TOJALON(663),
	GHOST_SCORPIUS(664),
	SPIRIT_OF_SCORPIUS(665),
	SCORPION(666),
	DARK_MAGE(667),
	MERCENARY(668),
	MERCENARY_CAPTAIN(669),
	MERCENARY_ESCAPEGATES(670),
	MINING_SLAVE(671),
	WATCHTOWER_WIZARD(672),
	OGRE_SHAMAN(673),
	SKAVID_UNRELEASED(674),
	OGRE_GUARD_EASTGATE(675),
	OGRE_GUARD_WESTGATE(676),
	OGRE_GUARD_BATTLEMENT(677),
	SKAVID_INITIAL(678),
	SKAVID_FINALQUIZ(679),
	OG(680),
	GREW(681),
	TOBAN(682),
	GORAD(683),
	OGRE_GUARD_CAVE_ENTRANCE(684),
	YANILLE_WATCHMAN_UNRELEASED(685),
	OGRE_MERCHANT(686),
	OGRE_TRADER_GENSTORE(687),
	OGRE_TRADER_ROCKCAKE(688),
	OGRE_TRADER_FOOD(689),
	MERCENARY_LIFTPLATFORM(690),
	CITY_GUARD(691),
	MERCENARY_JAILDOOR(692),
	LAWGOF(693),
	//DWARF(694),
	LOLLK(695),
	SKAVID_IG(696),
	OGRE_GUARD_BRIDGE(697),
	NULODION(698),
	//DWARF(699),
	AL_SHABIM(700),
	BEDABIN_NOMAD(701),
	CAPTAIN_SIAD(702),
	BEDABIN_NOMAD_GUARD(703),
	OGRE_CITIZEN(704),
	ROCK_OF_AGES(705),
	OGRE_GENERAL(706),
	SKAVID_AR(707),
	SKAVID_CUR(708),
	SKAVID_NOD(709),
	DRAFT_MERCENARY_GUARD(710),
	MINING_CART_DRIVER(711),
	KOLODION(712),
	KOLODION_HUMAN(713),
	GERTRUDE(714),
	SHILOP(715),
	ROWDY_GUARD(716),
	SHANTAY_PASS_GUARD_MOVING(717),
	ROWDY_SLAVE(718),
	SHANTAY_PASS_GUARD_STANDING(719),
	ASSISTANT(720),
	DESERT_WOLF(721),
	WORKMAN(722),
	EXAMINER(723),
	STUDENT_PURPLE(724),
	STUDENT_GREEN(725),
	DIGSITE_GUIDE(726),
	STUDENT_ORANGE(727),
	ARCHAEOLOGICAL_EXPERT(728),
	CIVILLIAN_ATTACKABLE(729),
	CIVILLIAN_UNRELEASED(730),
	CIVILLIAN_APRON(731),
	CIVILLIAN_PICKPOCKET(732),
	MURPHY_LAND(733),
	MURPHY_BOAT(734),
	SIR_RADIMUS_ERKLE_HOUSE(735),
	LEGENDS_GUILD_GUARD(736),
	ESCAPING_MINING_SLAVE(737),
	WORKMAN_UNDERGROUND(738),
	MURPHY_UNRELEASED(739),
	ECHNED_ZEKIN(740),
	DONOVAN_THE_HANDYMAN(741),
	PIERRE_THE_DOG_HANDLER(742),
	HOBBES_THE_BUTLER(743),
	LOUISA_THE_COOK(744),
	MARY_THE_MAID(745),
	STANFORD_THE_GARDENER(746),
	GUARD_SINCLAIR_MANSION(747),
	GUARD_DOG_SINCLAIR_MANSION(748),
	GUARD_UNRELEASED(749),
	MAN_SINCLAIR_MANSION(750),
	ANNA_SINCLAIR(751),
	BOB_SINCLAIR(752),
	CAROL_SINCLAIR(753),
	DAVID_SINCLAIR(754),
	ELIZABETH_SINCLAIR(755),
	FRANK_SINCLAIR(756),
	KOLODION_OGRE(757),
	KOLODION_SPIDER(758),
	KOLODION_SOULESS(759),
	KOLODION_DEMON(760),
	IRVIG_SENAY(761),
	RANALPH_DEVERE(762),
	POISON_SALESMAN(763),
	GUJUO(764),
	JUNGLE_FORESTER(765),
	UNGADULU(766),
	EVIL_UNGADULU(767),
	DEATH_WING(768),
	NEZIKCHENED(769),
	DWARF_CANNON_ENGINEER(770),
	DWARF_COMMANDER(771),
	VIYELDI(772),
	NURMOF(773),
	FATIGUE_EXPERT(774),
	KARAMJA_WOLF(775),
	JUNGLE_SAVAGE(776),
	OOMLIE_BIRD(777),
	SIDNEY_SMITH(778),
	SIEGFRIED_ERKLE(779),
	TEA_SELLER(780),
	WILOUGH(781),
	PHILOP(782),
	KANEL(783),
	CHAMBER_GUARDIAN(784),
	SIR_RADIMUS_ERKLE_GUILD(785),
	PIT_SCORPION(786),
	SHADOW_WARRIOR(787),
	FIONELLA(788),
	BATTLE_MAGE_GUTHIX(789),
	BATTLE_MAGE_ZAMAROK(790),
	BATTLE_MAGE_SARADOMIN(791),
	GUNDAI(792),
	LUNDAIL(793);
	private int npcId;

	private static final Map<Integer, NpcId> byId = new HashMap<Integer, NpcId>();
	static {
		for (NpcId npc : NpcId.values()) {
			if (byId.put(npc.id(), npc) != null) {
				throw new IllegalArgumentException("duplicate id: " + npc.id());
			}
		}
	}

	public static NpcId getById(Integer id) {
		return byId.getOrDefault(id, NpcId.NOTHING);
	}

	/**
	 * @param npcId The ID of the npc.
	 */
	NpcId(int npcId) {
		this.npcId = npcId;
	}

	/**
	 * @return The npcs ID
	 */
	public int id() {
		return npcId;
	}
}
