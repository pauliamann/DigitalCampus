package at.dcv.w05.zoo;

import java.util.Random;

public class Tiere {


    private String name;
    private String gattung;
    private String futter;
    private int tagesbedarf;
    private int gesundheit;
    private String gehege; // für die Gehegezuordnung

    /* --- Constructor --- */

    public Tiere(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        if (gattung == "Affe") {
            this.futter = "Banane";
        } else if (gattung == "Raubtier") {
            this.futter = "Maus";
        }

        if (gattung == "Affe") {
            this.tagesbedarf = 2;
        } else if (gattung == "Raubtier") {
            this.tagesbedarf = 4;
        }
        this.gesundheit = 100;
        this.gehege = gehege;
    }

    /* --- Methoden --- */

    @Override
    public String toString() {
        return "   Gattung: " + gattung + ", Name: " + name;
    }

    // Beissen:


    public String beissen() {

        Random ra = new Random();
        int low = 1;
        int high = 50;
        int verletzung = ra.nextInt(high - low) + low;
        String totesTier = "";
        // solange gesundheit > 0 ; sonst aus Vektor entfernen

        if (gesundheit > 0) {
            if (gesundheit - verletzung > 0) {
                gesundheit = gesundheit - verletzung;
                System.out.println("Tier: " + name + ", hat Gesundheit: " + gesundheit);
            } else if (gesundheit - verletzung <= 0) {
                System.out.println("Tier: " + name + " ist tot.");
                totesTier = name;


            }  //Todo: Hier möchte ich das tote Tier aus dem Vektor entfernen.
            // Todo: Wie kann ich auf den Vektor zugreifen
        }
        return totesTier;
    }

    public String printTotesTier() {
        return beissen();
    }


    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public String getFutter() {
        if (getGattung() == "Affe") {
            futter = "Banane";
        }
        if (getGattung() == "Raubkatze") {
            futter = "Maus";
        }

        return futter;
    }

    public int getTagesbedarf() {
        return tagesbedarf;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public String getGehege() {
        return gehege;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }

    public void setFutter(String futter) {
        this.futter = futter;
    }

    public void setTagesbedarf(int tagesbedarf) {
        this.tagesbedarf = tagesbedarf;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public void setGehege(String gehege) {
        this.gehege = gehege;
    }
}
