package zame.game.store;

import zame.game.R;
import zame.game.engine.Engine;
import zame.game.engine.State;
import zame.game.store.achievements.Achievement;

public final class Achievements {
    public static final int STAT_MONSTERS_KILLED = 0;
    public static final int STAT_DOORS_OPENED = 1;
    public static final int STAT_SECRETS_FOUND = 2;
    public static final int STAT_P100_KILLS_ROW = 3;
    public static final int STAT_P100_ITEMS_ROW = 4;
    public static final int STAT_P100_SECRETS_ROW = 5;
    public static final int STAT_LAST = 6;

    private static final int MONSTERS_KILLED_5 = 0; // hands in blood
    private static final int MONSTERS_KILLED_25 = 1;
    private static final int MONSTERS_KILLED_100 = 2;
    private static final int MONSTERS_KILLED_500 = 3;
    private static final int MONSTERS_KILLED_1000 = 4;
    private static final int DOORS_OPENED_5 = 5; // mastered doors
    private static final int DOORS_OPENED_25 = 6;
    private static final int DOORS_OPENED_100 = 7;
    private static final int DOORS_OPENED_500 = 8;
    private static final int DOORS_OPENED_1000 = 9;
    private static final int SECRETS_FOUND_5 = 10; // mastered secrets
    private static final int SECRETS_FOUND_10 = 11;
    private static final int SECRETS_FOUND_25 = 12;
    private static final int SECRETS_FOUND_50 = 13;
    private static final int SECRETS_FOUND_100 = 14;
    private static final int P100_KILLS_ROW_5 = 15;
    private static final int P100_ITEMS_ROW_5 = 16;
    private static final int P100_SECRETS_ROW_5 = 17;
    private static final int P100_KILLS_ROW_10 = 18;
    private static final int P100_ITEMS_ROW_10 = 19;
    private static final int P100_SECRETS_ROW_10 = 20;
    static final int LAST = 21;

    public static final Achievement[] LIST = { new Achievement(MONSTERS_KILLED_5,
            STAT_MONSTERS_KILLED,
            5,
            R.string.at_monsters_killed_5,
            R.string.ad_monsters_killed_5),
            new Achievement(DOORS_OPENED_5,
                    STAT_DOORS_OPENED,
                    5,
                    R.string.at_doors_opened_5,
                    R.string.ad_doors_opened_5),
            new Achievement(SECRETS_FOUND_5,
                    STAT_SECRETS_FOUND,
                    5,
                    R.string.at_secrets_found_5,
                    R.string.ad_secrets_found_5),
            new Achievement(P100_KILLS_ROW_5,
                    STAT_P100_KILLS_ROW,
                    5,
                    R.string.at_p100_kills_row_5,
                    R.string.ad_p100_kills_row_5),
            new Achievement(P100_ITEMS_ROW_5,
                    STAT_P100_ITEMS_ROW,
                    5,
                    R.string.at_p100_items_row_5,
                    R.string.ad_p100_items_row_5),
            new Achievement(P100_SECRETS_ROW_5,
                    STAT_P100_SECRETS_ROW,
                    5,
                    R.string.at_p100_secrets_row_5,
                    R.string.ad_p100_secrets_row_5),
            new Achievement(MONSTERS_KILLED_25,
                    STAT_MONSTERS_KILLED,
                    25,
                    R.string.at_monsters_killed_25,
                    R.string.ad_monsters_killed_25),
            new Achievement(DOORS_OPENED_25,
                    STAT_DOORS_OPENED,
                    25,
                    R.string.at_doors_opened_25,
                    R.string.ad_doors_opened_25),
            new Achievement(SECRETS_FOUND_10,
                    STAT_SECRETS_FOUND,
                    10,
                    R.string.at_secrets_found_10,
                    R.string.ad_secrets_found_10),
            new Achievement(P100_KILLS_ROW_10,
                    STAT_P100_KILLS_ROW,
                    10,
                    R.string.at_p100_kills_row_10,
                    R.string.ad_p100_kills_row_10),
            new Achievement(P100_ITEMS_ROW_10,
                    STAT_P100_ITEMS_ROW,
                    10,
                    R.string.at_p100_items_row_10,
                    R.string.ad_p100_items_row_10),
            new Achievement(P100_SECRETS_ROW_10,
                    STAT_P100_SECRETS_ROW,
                    10,
                    R.string.at_p100_secrets_row_10,
                    R.string.ad_p100_secrets_row_10),
            new Achievement(MONSTERS_KILLED_100,
                    STAT_MONSTERS_KILLED,
                    100,
                    R.string.at_monsters_killed_100,
                    R.string.ad_monsters_killed_100),
            new Achievement(DOORS_OPENED_100,
                    STAT_DOORS_OPENED,
                    100,
                    R.string.at_doors_opened_100,
                    R.string.ad_doors_opened_100),
            new Achievement(SECRETS_FOUND_25,
                    STAT_SECRETS_FOUND,
                    25,
                    R.string.at_secrets_found_25,
                    R.string.ad_secrets_found_25),
            new Achievement(MONSTERS_KILLED_500,
                    STAT_MONSTERS_KILLED,
                    500,
                    R.string.at_monsters_killed_500,
                    R.string.ad_monsters_killed_500),
            new Achievement(DOORS_OPENED_500,
                    STAT_DOORS_OPENED,
                    500,
                    R.string.at_doors_opened_500,
                    R.string.ad_doors_opened_500),
            new Achievement(SECRETS_FOUND_50,
                    STAT_SECRETS_FOUND,
                    50,
                    R.string.at_secrets_found_50,
                    R.string.ad_secrets_found_50),
            new Achievement(MONSTERS_KILLED_1000,
                    STAT_MONSTERS_KILLED,
                    1000,
                    R.string.at_monsters_killed_1000,
                    R.string.ad_monsters_killed_1000),
            new Achievement(DOORS_OPENED_1000,
                    STAT_DOORS_OPENED,
                    1000,
                    R.string.at_doors_opened_1000,
                    R.string.ad_doors_opened_1000),
            new Achievement(SECRETS_FOUND_100,
                    STAT_SECRETS_FOUND,
                    100,
                    R.string.at_secrets_found_100,
                    R.string.ad_secrets_found_100), };

    private Achievements() {}

    public static void resetStat(int statId, @SuppressWarnings("unused") Profile profile, Engine engine, State state) {
        if (!engine.inWallpaperMode) {
            state.stats[statId] = 0;
        }
    }

    public static void updateStat(int statId, Profile profile, Engine engine, State state) {
        if (engine.inWallpaperMode) {
            return;
        }

        state.stats[statId]++;

        for (Achievement achievement : LIST) {
            if (achievement.statId == statId) {
                achievement.update(profile, engine, state);
            }
        }

        profile.update();
    }

    public static String cleanupTitle(String achievementTitle) {
        return achievementTitle.replaceAll("<font.+?font>", "").trim();
    }
}
