package at.dcv.w08.museum;

import java.util.Vector;

public class Kunstobjekt {

    private String kuenstler;
    private String titel;
    private Vector<Gemaelde> gemaeldeVector;
    private Vector<Skulptur> skulpturVector;

    public Kunstobjekt(String kuenstler, String titel) {
        this.kuenstler = kuenstler;
        this.titel = titel;
        this.skulpturVector = new Vector<Skulptur>();
        this.gemaeldeVector = new Vector<Gemaelde>();
    }

    public String getTitel() {
        return titel;
    }

    public String getKuenstler() {
        return kuenstler;
    }


}
