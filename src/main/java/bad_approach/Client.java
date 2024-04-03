package bad_approach;

import bad_approach.engines.FordEngine;
import bad_approach.soundsystems.BoschSoundSystems;
import bad_approach.tyres.MichelinTyres;

public class Client {
    public static void main(String[] args) {
        MichelinTyres michelinTyres=new MichelinTyres();
        FordEngine fordEngine=new FordEngine();
        BoschSoundSystems soundSystems=new BoschSoundSystems();
        Ferrari ferrari = new Ferrari(michelinTyres,fordEngine,soundSystems);
        System.out.println(ferrari);
    }
}
