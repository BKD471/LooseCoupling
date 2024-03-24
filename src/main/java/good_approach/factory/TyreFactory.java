package good_approach.factory;

import good_approach.types.TyreTypes;
import good_approach.tyres.BridgeStoneTyres;
import good_approach.tyres.ITyres;
import good_approach.tyres.MRFTyres;
import good_approach.tyres.MichelinTyres;

public class TyreFactory {
    public static ITyres getMyTyres(TyreTypes tyreTypes) {
        switch (tyreTypes) {
            case MRF -> {
                return new MRFTyres();
            }
            case MICHELIN -> {
                return new MichelinTyres();
            }
            case BRIDGE_STONE -> {
                return new BridgeStoneTyres();
            }
            default -> throw new RuntimeException("Invalid Vendor for Tyres");
        }
    }
}
