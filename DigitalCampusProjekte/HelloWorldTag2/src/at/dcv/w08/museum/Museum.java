package at.dcv.w08.museum;

import java.util.Objects;
import java.util.Vector;

public class Museum {

    private String name;
    private Vector<Etage> etageVector;
    private Vector<String> farbeVector;
    private Vector<String> materiaVector;

    public Museum(String name) {
        this.name = name;
        this.farbeVector = new Vector<String>();
        this.materiaVector = new Vector<String>();
        this.etageVector = new Vector<Etage>();
    }

    public Etage addEtage(Etage neueEtage) {
        for (Etage e : etageVector) {
            if (e.getName().equals(neueEtage)) {
                System.out.println("schon vorhanden");
                return e;
            }
        }
        etageVector.add(neueEtage);
        return neueEtage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void printStruktur(String prefix) {
        System.out.println("Museum:" + name);
        for (Etage e : etageVector) {
            e.printStruktur(prefix+"    ");

        }
    }

    public Etage findOrAdd(Etage etage) {
        int index = etageVector.indexOf(etage);
        if (index>= 0) {
            return etageVector.get(index);
        } else {
            etageVector.add(etage);
            return etage;
        }
    }


}
