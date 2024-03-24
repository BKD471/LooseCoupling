package bad_approach.tyres;

public class MichelinTyres {
    private final String brandName;
    public MichelinTyres(){
        this.brandName="Michelin Tyres";
    }

    @Override
    public String toString() {
        return "MichelinTyres{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
