package good_approach.tyres;

public class BridgeStoneTyres implements ITyres{
    private final String brandName;
    public BridgeStoneTyres(){
        this.brandName="Bridge Stone Tyres";
    }
    @Override
    public void letsRoll() {
        System.out.println(brandName+"are rolling .........");
    }
    @Override
    public String toString() {
        return "BridgeStoneTyres{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
