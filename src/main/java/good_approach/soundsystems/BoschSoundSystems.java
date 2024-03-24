package good_approach.soundsystems;

public class BoschSoundSystems implements ISoundSystems{
    private final String brandName;
    public BoschSoundSystems(){this.brandName="Bosch Sound Systems";}
    @Override
    public void blowIt() {System.out.println("Blow "+brandName);}
    @Override
    public String toString() {
        return "BoschSoundSystems{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
