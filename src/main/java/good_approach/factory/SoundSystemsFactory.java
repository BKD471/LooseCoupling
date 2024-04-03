package good_approach.factory;

import good_approach.soundsystems.BoschSoundSystems;
import good_approach.soundsystems.ISoundSystems;
import good_approach.soundsystems.JBLSoundSystems;
import good_approach.soundsystems.SonySoundSystems;
import good_approach.types.SoundTypes;

public class SoundSystemsFactory {
    public static ISoundSystems getMySoundSystems(final SoundTypes soundTypes) {
        switch (soundTypes) {
            case JBL -> {
                return new JBLSoundSystems();
            }
            case SONY -> {
                return new SonySoundSystems();
            }
            case BOSCH -> {
                return new BoschSoundSystems();
            }
            default -> throw new RuntimeException("Invalid Vendor for Sound Systems");
        }
    }
}
