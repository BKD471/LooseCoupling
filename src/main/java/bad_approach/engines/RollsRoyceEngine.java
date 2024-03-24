package bad_approach.engines;

public class RollsRoyceEngine {
    private final String brandName;

    public RollsRoyceEngine() {
        this.brandName = "Rolls Royce";
    }

    @Override
    public String toString() {
        return "RollsRoyceEngine{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
