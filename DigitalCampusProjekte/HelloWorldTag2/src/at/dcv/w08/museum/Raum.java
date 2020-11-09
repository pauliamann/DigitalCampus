package at.dcv.w08.museum;

import java.util.Random;
import java.util.Vector;

public class Raum {

    private String name;
    private Vector<Kunstobjekt> kunstobjektVector = new Vector<>();
    private Vector<Besucher> besucherImRaum = new Vector<>();

    public Raum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Kunstobjekt searchAndCreate(String neuerKuenstler, String neuerTitel) {
        for (Kunstobjekt k : kunstobjektVector) {
            if (k.getKuenstler().equals(neuerKuenstler) && k.getTitel().equals(neuerTitel)) {
                System.out.println("titel oder Künstler schon vorhanden");
                return k;
            }
        }
        Kunstobjekt k = new Kunstobjekt(neuerKuenstler, neuerTitel);
        kunstobjektVector.add(k);
        return k;
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + "Anzahl Objekte: " + kunstobjektVector.size());
        for (Kunstobjekt k : kunstobjektVector) {
            System.out.println(prefix + k.getTitel() + " von: " + k.getKuenstler());
        }

    }

    @Override
    public String toString() {
        return name ;
    }
}
