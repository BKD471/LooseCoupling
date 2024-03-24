package good_approach.soundsystems;

public class JBLSoundSystems implements ISoundSystems {
    private final String brandName;

    public JBLSoundSystems() {
        this.brandName = "JBL Sound System";
    }

    @Override
    public void blowIt() {
        System.out.println("Blow " + brandName);
    }

    @Override
    public String toString() {
        return "JBLSoundSystems{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
