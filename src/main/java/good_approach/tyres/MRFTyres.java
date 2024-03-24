package good_approach.tyres;

public class MRFTyres implements ITyres {
    private final String brandName;

    public MRFTyres() {
        this.brandName = "MRF Tyres";
    }

    @Override
    public void letsRoll() {
        System.out.println(brandName + "are rolling .........");
    }

    @Override
    public String toString() {
        return "MRFTyres{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
