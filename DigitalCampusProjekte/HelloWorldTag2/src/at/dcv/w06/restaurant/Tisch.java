package at.dcv.w06.restaurant;

public class Tisch {

    private String name;
    private int sitzplaetze;
    private Gruppe gruppe;
    private float summeRechnung;

    public Tisch(String name, int sitzplaetze) {
        this.name = name;
        this.sitzplaetze = sitzplaetze;
        this.gruppe = null;
        this.summeRechnung = 0f;
    }

    public void speiseZuRechnung(Speise s) {
        // hier wird die Rechnungssummer erhöht um die Speisen.
        System.out.println(gruppe.getName() + " hat für " + name + " " + s.getName() + " bestellt.");
        summeRechnung += s.getPreis();
    }

    @Override
    public String toString() {
        return name + ", Sitzplaetze: " + sitzplaetze;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public String getName() {
        return name;
    }

    public Gruppe getGruppe() {
        return gruppe;
    }

    public void setGruppe(Gruppe gruppe) {
        this.gruppe = gruppe;
    }

    public float getSummeRechnung() {
        return summeRechnung;
    }

    public void setSummeRechnung(float summeRechnung) {
        this.summeRechnung = summeRechnung;
    }
}
