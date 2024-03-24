package good_approach.tyres;

public class MichelinTyres implements ITyres {
    private final String brandName;

    public MichelinTyres() {
        this.brandName = "Michelin Tyres";
    }

    @Override
    public void letsRoll() {
        System.out.println(brandName + "are rolling .........");
    }

    @Override
    public String toString() {
        return "MichelinTyres{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
