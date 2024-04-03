package bad_approach;

import bad_approach.soundsystems.BoschSoundSystems;
import bad_approach.tyres.MichelinTyres;
import bad_approach.engines.FordEngine;

public class Ferrari {
    private final MichelinTyres tyres;
    private final FordEngine engines;
    private final BoschSoundSystems soundSystems;

    public Ferrari(MichelinTyres tyres,FordEngine engines,BoschSoundSystems soundSystems) {
        this.tyres = tyres;
        this.engines = engines;
        this.soundSystems = soundSystems;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "tyres=" + tyres +
                ", engines=" + engines +
                ", soundSystems=" + soundSystems +
                '}';
    }
}
