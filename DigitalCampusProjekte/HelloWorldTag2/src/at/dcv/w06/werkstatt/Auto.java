package at.dcv.w06.werkstatt;

public class Auto {

//    public static final float KILOMETER_BIS_SERVICE =

    private String marke;
    private float kmStand;
    private float kmBisService;
    private String treibstoff;

    private int kmGefahren;
    private float tankStatus;
    private int tankVolumen;
    private float verbrauchProKm;
    private int anzahlTanken;
    private Tankstelle tankstelle;
    private Werkstatt werkstatt;
    private float summeTanken;
    private float literZuTanken;


    public Auto(String marke, int kmStand, float tankStatus, int tankVolumen, String kraftstoff) {
        this.marke = marke;
        this.kmStand = kmStand;
        this.tankStatus = tankStatus;
        this.tankVolumen = tankVolumen;
        this.kmGefahren = 0;
        this.anzahlTanken = 0;
        this.verbrauchProKm = 1.5f;
    }

    public void fahren(int kilometer) {
        for (int i = 0; i < kilometer; i++) {

            if (tankStatus <= 0) {
                tankstelle.tanken(this);
            }
                kmGefahren++;
                kmStand++;

            float newTankStatus = tankStatus - verbrauchProKm;
                setTankStatus(newTankStatus);

            if (i % 10 == 0) {
                System.out.printf("Du bist %s Kilometer gefahren\n" , kmGefahren);
                System.out.println("");
            }
        }

    }



    public int getTankVolumen() {
        return tankVolumen;
    }

    public void setAnzahlTanken(int anzahlTanken) {
        this.anzahlTanken = anzahlTanken;
    }

    public int getAnzahlTanken() {
        return anzahlTanken;
    }

    public void setTankStatus(float tankStatus) {
        this.tankStatus = tankStatus;
    }

    public float getTankStatus() {
        return tankStatus;
    }

    public void setWerkstatt(Werkstatt werkstatt) {
        this.werkstatt = werkstatt;
    }

    public void setTankstelle(Tankstelle tankstelle) {
        this.tankstelle = tankstelle;
    }

    public void setSummeTanken(float summeTanken) {
        this.summeTanken = summeTanken;
    }

    public float getSummeTanken() {
        return summeTanken;
    }

    public float getLiterZuTanken() {
        return literZuTanken;
    }

    public void setLiterZuTanken(float literZuTanken) {
        this.literZuTanken = literZuTanken;
    }

    public void printStatistik() {
        System.out.println("--- --- STATISTIK --- ---");
        System.out.printf("Tachostand: %skm.\nDu bist %skm gefahren." , kmStand , kmGefahren);
        System.out.printf("\nDu warst %sx tanken und hast %.2f€ für %sL Treibstoff ausgegeben.", anzahlTanken, summeTanken, literZuTanken);
        System.out.println();

    }
}
