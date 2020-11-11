package at.dcv.w07.bibliotheksDaten;

import java.text.DateFormat;
import java.util.Date;
import java.util.Vector;

public class Aktion {

    private Vector<Aktion> aktionen;
    private String datum;
    private String aktion;
    private String name;
    private String BvNr;
    private String suchTxt;

    public Aktion(String datum, String aktion, String name, String BvNr) {
        this.datum = datum;
        this.aktion = aktion;
        this.name = name;
        this.BvNr = BvNr;
        this.suchTxt = suchTxt;
    }

    public void printAktionen (Vector<Aktion> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setAktion(String aktion) {
        this.aktion = aktion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBvNr(String bvNr) {
        BvNr = bvNr;
    }

    public void setSuchTxt(String suchTxt) {
        this.suchTxt = suchTxt;
    }
}
