package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Objects;
import java.util.Vector;

public class Etage {
    private String etage;
    private Vector<Raum> raeume = new Vector<>();

    public Etage(String etage) {
        this.etage = etage;
    }

    public String getEtage() {
        return etage;
    }

    public Vector<Raum> getRaeume() {
        return raeume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etage etage1 = (Etage) o;
        return Objects.equals(etage, etage1.etage);
    }

    @Override
    public String toString() {
        return "Etage: " + etage;
    }

    public Raum searchAndCreateRaum(String neuerRaum) {
        for (Raum r : raeume) {
            if (r.getNamen().equals(neuerRaum)) {
                return r;
            }
        }
        Raum r = new Raum(neuerRaum);
        raeume.add(r);
        return r;
    }

    public Vector<KunstObjekt> getAllKunstObjekte (){
        Vector<KunstObjekt> alleKunstObjekte = new Vector<>();
        for (Raum r : raeume){
            alleKunstObjekte.addAll(r.getKunstObjekte());
        }
        return alleKunstObjekte;
    }

}
