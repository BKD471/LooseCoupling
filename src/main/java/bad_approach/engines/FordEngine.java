package bad_approach.engines;

public class FordEngine {
    private final String brandName;

    public FordEngine() {
        this.brandName = "Ford Engine";
    }

    @Override
    public String toString() {
        return "FordEngine{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
