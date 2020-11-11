package at.dcv.w08.ZooErweiterung;

import java.util.Vector;

public class Mitarbeiter {

    private String name;
    private String beruf;
    private int Arbeitszeit;


    public Mitarbeiter(String name, String beruf) {
        this.name = name;
        this.beruf = beruf;
    }

    public String getName() {
        return name;
    }

    public String getBeruf() {
        return beruf;
    }

    @Override
    public String toString() {
        return "Mitarbeiter: " + name;
    }
}
