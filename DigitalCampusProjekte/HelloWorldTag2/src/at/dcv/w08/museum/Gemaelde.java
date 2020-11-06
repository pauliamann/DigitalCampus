package at.dcv.w08.museum;

public class Gemaelde extends Kunstobjekt{

    private String farbe;

    public Gemaelde(String kuenstler, String titel, String farbe) {
        super(kuenstler, titel);
        this.farbe = farbe;
    }


}
