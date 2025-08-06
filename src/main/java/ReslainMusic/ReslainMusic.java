package ReslainMusic;

import basemod.BaseMod;
import basemod.interfaces.*;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//completely unused lol
@SuppressWarnings({"unused", "WeakerAccess"})
@SpireInitializer
public class ReslainMusic implements PostInitializeSubscriber {

    public static final String modID = "reslainmusic";
    public static final Logger logger = LogManager.getLogger(ReslainMusic.class.getName());

    public static String makeID(String idText) {
        return modID + ":" + idText;
    }

    public ReslainMusic() {
        BaseMod.subscribe(this);
    }

    public static String makePath(String resourcePath) {
        return modID + "Resources/" + resourcePath;
    }

    public static String makeImagePath(String resourcePath) {
        return modID + "Resources/images/" + resourcePath;
    }

    public static void initialize() {
        ReslainMusic thismod = new ReslainMusic();
    }

    @Override
    public void receivePostInitialize() {

    }
}
