package good_approach;

import good_approach.engines.IEngines;
import good_approach.soundsystems.ISoundSystems;
import good_approach.tyres.ITyres;

public class Ferrari {
    private final IEngines engines;
    private final ISoundSystems soundSystems;
    private final ITyres tyres;

    public Ferrari(IEngines engines, ISoundSystems soundSystems, ITyres tyres) {
        this.engines = engines;
        this.soundSystems = soundSystems;
        this.tyres = tyres;
    }

    public void startMyEngine() {
        engines.startMyEngine();
    }

    public void startMusic() {
        soundSystems.blowIt();
    }

    public void letsRoll() {
        tyres.letsRoll();
    }

    @Override
    public String toString() {
        return "Ferrai{" +
                "engines=" + engines +
                ", soundSystems=" + soundSystems +
                ", tyres=" + tyres +
                '}';
    }
}
