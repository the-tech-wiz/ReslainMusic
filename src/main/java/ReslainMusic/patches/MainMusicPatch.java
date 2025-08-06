package ReslainMusic.patches;

import ReslainMusic.ReslainMusic;
import com.badlogic.gdx.audio.Music;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.audio.MainMusic;

@SpirePatch(
        clz = MainMusic.class,
        method="getSong")
public class MainMusicPatch {
    @SpirePrefixPatch
    public static SpireReturn<Music> Prefix(MainMusic __instance, String key){
        ReslainMusic.logger.info("Changing BGM...");
        switch (key) {
            case "Exordium":
                return SpireReturn.Return(MainMusic.newMusic("reslainmusicResources/music/Reslain_02_ActI_(Exordium).ogg"));
            case "TheBeyond":
                return SpireReturn.Return(MainMusic.newMusic("reslainmusicResources/music/Reslain_04_ActIII_(The_Beyond).ogg"));
            case "MENU":
                return SpireReturn.Return(MainMusic.newMusic("reslainmusicResources/music/Reslain_01_Upwards_(Slay_the_Spire).ogg"));
        }
        ReslainMusic.logger.info("Uhhhh what music is this? ...Defaulting: " + key);
        return SpireReturn.Continue();
    }

}
