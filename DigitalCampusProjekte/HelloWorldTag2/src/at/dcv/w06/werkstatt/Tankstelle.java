package at.dcv.w06.werkstatt;

public class Tankstelle {

    private String name;
    private float preis;

    public Tankstelle(String name) {
        this.name = name;
        this.preis = 1.84f;
    }


    public void tanken (Auto auto) {
        float tankmenge = auto.getTankVolumen() - auto.getTankStatus();

        float newLiterZuTanken = auto.getLiterZuTanken() + tankmenge;
        auto.setLiterZuTanken(newLiterZuTanken);

        float tankPreis = tankmenge * preis;
        float newTankPreis = auto.getSummeTanken()+tankPreis;
        auto.setSummeTanken(newTankPreis);
        auto.setTankStatus(auto.getTankVolumen());

        int newAnzahlTanken = auto.getAnzahlTanken()+1;
        auto.setAnzahlTanken(newAnzahlTanken);

        System.out.printf("--- Willkommen bei der Tankstelle %s ---\n", name);
        System.out.printf("Dein Auto wurde um %.2f€ mit %.2fL betankt!\n", tankPreis, tankmenge);
        System.out.println("");
    }

    public float getPreis() {
       float preis = 2.0f;
       return preis;
    }
}
