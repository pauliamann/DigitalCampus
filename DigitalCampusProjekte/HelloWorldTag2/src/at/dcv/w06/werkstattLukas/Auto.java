package at.dcv.w06.werkstattLukas;

import java.util.Vector;

public class Auto {

    public static final float KM_BIS_SERVICE = 3000; // static weil dieses Ding auf alle Autos bezogen ist
    public static final float REIFENPROFIL_NEU = 7;
    public static final float REIFENVERSCHLEIS_PRO_KM = 0.009f;

    private String marke;
    private String bezeichnung;
    private float kmStand;
    private float kmBisService;
    private float tankGroesse;
    private float tankStand;
    private float verbrauch; // pro 100 Kilometer
    private float reifenProfil;
    private String treibstoff;
    private Fahrer fahrer;
    private Tankstelle tankstelle;
    private Werkstatt werkstatt;
    private Reifen[] reifen;
    public int anzahlTanken;
    public float summeEuroTanken;

    public Auto(String marke, String bezeichnung, float tankGroesse, float verbrauch, String treibstoff, Reifen[] reifen) {
        this.marke = marke;
        this.bezeichnung = bezeichnung;
        this.kmStand = 0;
        this.kmBisService = KM_BIS_SERVICE;
        this.tankGroesse = tankGroesse;
        this.tankStand = tankGroesse;
        this.verbrauch = verbrauch;
        this.reifenProfil = REIFENPROFIL_NEU;
        this.treibstoff = treibstoff;
        this.fahrer = fahrer;
        this.reifen = reifen;
    }

    public void fahren(int kilometer) {
        float verbrauchProKilometer = verbrauch / 100;

        for (int i = 0; i < kilometer; i++) {
            // nachdem 1 Kilometer gefahren wurde
            float neuerTankstand = tankStand - verbrauchProKilometer;

            if (neuerTankstand <= 0) {
                System.out.println("");
                // Hier tanken Funktion einfügen
                tankstelle.tanken(this); // Die Funktion tanke verlangt nach einem Auto. Da die Fahren Funktion im auto erstellt ist, kann man hier tanken eintragen.

            } else {
                tankStand = neuerTankstand;
            }

            for (Reifen r : reifen) {
                float neuesReifenProfil = r.reifenAbnuetzung(this, kilometer);
                if (neuesReifenProfil <= 1.4) {
                    System.out.println("Bei Reifen: " + r.getName() + " ist das Profil zu klein: " + neuesReifenProfil);
                    werkstatt.reifenwechsel(r, this);
                    System.out.println("");
                }
            }

            float neuKilometerBisService = kmBisService - 1;
            if (neuKilometerBisService < 0) {

                werkstatt.service(this);
            } else {
                kmBisService = neuKilometerBisService;
            }

            kmStand++;

            if (i % 100 == 0) {
                System.out.println("--- --- ---");
                System.out.printf("Gefahren: %skm \nReifenprofil: %.2fmm \nKM bis Service: %skm \n", (i + 1), reifenProfil, kmBisService);
                System.out.println("");
            }
        }
    }


    public void statistik () {

        System.out.println("---  S T A T I S T I K  ---");
        System.out.printf("Gefahren: %s km \n" , kmStand);
        System.out.printf("Anzahl Tanken: %s \n", anzahlTanken);
        System.out.printf("Summe Tanken: %.2f € \n", summeEuroTanken);

    }

    public void checkReifenprofil(Reifen[] reifen) {

        for (Reifen r : reifen) {
            System.out.println(r.getReifenProfil());
        }

    }

    public void setAnzahlTanken(int anzahlTanken) {
        this.anzahlTanken = anzahlTanken;
    }

    public float getSummeEuroTanken() {
        return summeEuroTanken;
    }

    public void setSummeEuroTanken(float summeEuroTanken) {
        this.summeEuroTanken = summeEuroTanken;
    }

    public Reifen[] getReifen() {
        return reifen;
    }


    public void setWerkstatt(Werkstatt werkstatt) {
        this.werkstatt = werkstatt;
    }

    public void setReifenProfil(float reifenProfil) {
        this.reifenProfil = reifenProfil;
    }

    public void setKmBisService(float kmBisService) {
        this.kmBisService = kmBisService;
    }

    public void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    public void setTankstelle(Tankstelle tankstelle) {
        this.tankstelle = tankstelle;
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public float getTankStand() {
        return tankStand;
    }

    public float getTankGroesse() {
        return tankGroesse;
    }

    public String getTreibstoff() {
        return treibstoff;
    }

    public void setTankStand(float tankStand) {
        this.tankStand = tankStand;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "marke: " + marke + '\'' +
                "bezeichnung='" + bezeichnung + '\'' +
                ", kmStand=" + kmStand +
                ", kmBisService=" + kmBisService +
                ", tankGroesse=" + tankGroesse +
                ", tankStand=" + tankStand +
                ", verbrauch=" + verbrauch +
                ", reifenProfil=" + reifenProfil +
                ", treibstoff='" + treibstoff + '\'' +
                ", fahrer=" + fahrer +
                '}';
    }


}



