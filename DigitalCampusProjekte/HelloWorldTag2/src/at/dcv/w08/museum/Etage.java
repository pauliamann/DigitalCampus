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


    public Vector<Raum> getRaumVector() {
        return raumVector;
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


    public Raum searchAndCreateRaum (String neuerRaum) {
        for (Raum e : raumVector) {
            if (e.getName().equals(neuerRaum)) {
//                System.out.println(e.getName() + " schon vorhanden");
                return e;
            }
        }
        Raum r = new Raum(neuerRaum);
        raumVector.add(r);
        return r;
    }

    @Override
    public String toString() {
        return "Etage{" +
                "name='" + name + '\'' +
                ", raumVector=" + raumVector +
                '}';
    }
}