package good_approach.factory;

import good_approach.engines.FordEngine;
import good_approach.engines.IEngines;
import good_approach.engines.RollsRoyceEngine;
import good_approach.types.EngineTypes;

public class EngineFactory {
    public static IEngines getMyEngine(final EngineTypes engineTypes) {
        switch (engineTypes) {
            case FORD -> {
                return new FordEngine();
            }
            case ROLL_ROYCE -> {
                return new RollsRoyceEngine();
            }
            default -> throw new RuntimeException("Invalid Vendor for Engines");
        }
    }
}
