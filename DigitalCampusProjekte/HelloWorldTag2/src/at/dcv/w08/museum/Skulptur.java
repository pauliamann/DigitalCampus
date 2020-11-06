package at.dcv.w08.museum;

public class Skulptur extends Kunstobjekt {

    private String material;

    public Skulptur(String kuenstler, String titel, String material) {
        super(kuenstler, titel);
        this.material = material;
    }
}
