package at.dcv.w06.restaurant;

public class Gruppe {

    private String name;
    private int anzahl;
    private String aktion;
    private String speise;


    public Gruppe(String name, int anzahl, String aktion, String speise) {
        this.name = name;
        this.anzahl = anzahl;
        this.aktion = aktion;
        this.speise = speise;
    }


    public String toString() {
        return "Gruppe: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public String getAktion() {
        return aktion;
    }

    public String getSpeise() {
        return speise;
    }
}
