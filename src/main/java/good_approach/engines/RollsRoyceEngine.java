package good_approach.engines;

public class RollsRoyceEngine implements IEngines{
    private final String brandName;
    public RollsRoyceEngine(){
        this.brandName="Rolls Royce";
    }
    @Override
    public void startMyEngine() {System.out.println("Starting the "+brandName);}

    @Override
    public String toString() {
        return "RollsRoyceEngine{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
