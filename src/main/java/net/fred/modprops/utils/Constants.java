package net.fred.modprops.utils;

import net.fabricmc.loader.api.FabricLoader;

import java.io.File;

/**
 * Constants.
 * @author fred
 *
 */
public final class Constants {

    public static String MODID;

    /**
     * Private ctor.
     * @param modid
     */
    private Constants(final String modid) {
        this.MODID = modid;
    }

    /**
     * Init the constants.
     * @param modid
     */
    public static void init(final String modid) {
        new Constants(modid);
    }

    /**
     * Encoding.
     */
    public static final String ENCODING = "UTF-8";

    /**
     * Application directory location.
     */
    public static final String GAME_DIR = FabricLoader.getInstance().getGameDirectory()
                    + File.separator;

    /**
     * Application Properties file name.
     */
    public static final String PROPERTY_FILE_NAME = Constants.GAME_DIR
            + File.separator + MODID + ".properties";

    public static final int TICKS_PER_SEC = 20;

    /**
     * Returns the number of ticks per second.
     * @param seconds the number of desired seconds to get ticks for
     * @return
     *      the number of ticks per second
     */
    public static final int getTicksPerSec(int seconds) {
        if (seconds >= 0 && seconds <= Integer.MAX_VALUE) {
            return seconds * TICKS_PER_SEC;
        } else {
            throw new RuntimeException("Error, ticks per second conversion out of bounds.");
        }
    }

    public static final int getTicksPerMin(int minutes) {
        if (minutes >= 0 && minutes <= Integer.MAX_VALUE) {
            return minutes * getTicksPerSec(60);
        } else {
            throw new RuntimeException("Error, ticks per second conversion out of bounds.");
        }
    }
}
