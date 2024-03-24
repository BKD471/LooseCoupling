package good_approach.engines;

public class FordEngine implements IEngines{
    private final String brandName;
    public FordEngine(){this.brandName="Ford Engine";}

    @Override
    public void startMyEngine() {System.out.println("Starting the "+brandName);}

    @Override
    public String toString() {
        return "FordEngine{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
