package at.dcv.w08.museum;

import java.util.Vector;

public class Raum {

    private String name;
    private Vector<Kunstobjekt> kunstobjektVector;

    public Raum(String name) {
        this.name = name;
        this.kunstobjektVector = new Vector<Kunstobjekt>();
    }

    public String getName() {
        return name;
    }

    public Kunstobjekt searchAndCreate (Kunstobjekt neuesKunstobjekt) {
        for (Kunstobjekt e : kunstobjektVector) {
            if (e.getKuenstler().equals(neuesKunstobjekt)) {
                System.out.println("schon vorhanden");
                return e;
            }
        }
        kunstobjektVector.add(neuesKunstobjekt);
        return neuesKunstobjekt;
    }

    public void printStruktur (String prefix) {
        System.out.println(prefix + "Anzahl Objekte: " +kunstobjektVector.size());
        for (Kunstobjekt k: kunstobjektVector) {
            System.out.println(prefix + k.getTitel() + " von: " + k.getKuenstler());
        }

    }


}
