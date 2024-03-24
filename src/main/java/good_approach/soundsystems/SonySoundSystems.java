package good_approach.soundsystems;

public class SonySoundSystems implements ISoundSystems{
    private final String brandName;
    public SonySoundSystems(){this.brandName="Sony Sound Systems";}
    @Override
    public void blowIt() {System.out.println("Blow "+brandName);}

    @Override
    public String toString() {
        return "SonySoundSystems{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
