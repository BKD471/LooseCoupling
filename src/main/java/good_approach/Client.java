package good_approach;

import good_approach.engines.IEngines;
import good_approach.factory.EngineFactory;
import good_approach.factory.SoundSystemsFactory;
import good_approach.factory.TyreFactory;
import good_approach.soundsystems.ISoundSystems;
import good_approach.tyres.ITyres;

import static good_approach.types.EngineTypes.ROLL_ROYCE;
import static good_approach.types.SoundTypes.SONY;
import static good_approach.types.TyreTypes.BRIDGE_STONE;

public class Client {
    public static void main(String[] args) {
        IEngines engines = EngineFactory.getMyEngine(ROLL_ROYCE);
        ITyres tyres = TyreFactory.getMyTyres(BRIDGE_STONE);
        ISoundSystems soundSystems = SoundSystemsFactory.getMySoundSystems(SONY);

        Ferrai ferrai = new Ferrai(engines, soundSystems, tyres);
        ferrai.startMyEngine();
        ferrai.letsRoll();
        ferrai.startMusic();

        System.out.println(ferrai);
    }
}
