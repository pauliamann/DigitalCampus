package at.dcv.w08.museum;

import java.util.Objects;
import java.util.Random;
import java.util.Vector;

public class Etage {
    private String name;
    private Vector<Raum> raumVector;

    public Etage(String name) {
        this.name = name;
        this.raumVector = new Vector<Raum>();
    }

    public String getName() {
        return name;
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + "Etage: " + name);
        System.out.println(prefix + raumVector.size() +" Räume:");
        for (Raum r: raumVector) {
            System.out.println(prefix + r.getName());
            r.printStruktur(prefix+"    ");
        }
    }

    public Raum findOrAdd(Raum neuerRaum) {
        int index = raumVector.indexOf(neuerRaum);
        if (index>= 0) {
            return raumVector.get(index);
        } else {
            raumVector.add(neuerRaum);
            return neuerRaum;
        }
    }

    public Raum searchAndCreateRaum (Raum neuerRaum) {
        for (Raum e : raumVector) {
            if (e.getName().equals(neuerRaum)) {
                System.out.println("schon vorhanden");
                return e;
            }
        }
        raumVector.add(neuerRaum);
        return neuerRaum;

    }


}
