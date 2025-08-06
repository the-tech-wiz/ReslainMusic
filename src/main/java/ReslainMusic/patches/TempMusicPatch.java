package ReslainMusic.patches;

import ReslainMusic.ReslainMusic;
import com.badlogic.gdx.audio.Music;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.audio.MainMusic;
import com.megacrit.cardcrawl.audio.TempMusic;


@SpirePatch(
        clz = TempMusic.class,
        method="getSong"
)
public class TempMusicPatch {
    @SpirePrefixPatch
    public static SpireReturn<Music> Prefix(TempMusic __instance, String key){
        ReslainMusic.logger.info("Changing boss music (not accounting for Hexaghost)");

        if (key.equals("BOSS_BOTTOM")) {
            ReslainMusic.logger.info("Why do I hear boss music?");
            return SpireReturn.Return(MainMusic.newMusic("reslainmusicResources/music/Reslain_03_End_of_the_Map_(The_Guardian_Emerges).ogg"));
        }

        ReslainMusic.logger.info("Uhhhh what music is this? ...Defaulting: " + key);
        return SpireReturn.Continue();
    }
}
