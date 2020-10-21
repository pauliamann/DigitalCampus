package at.dcv.w06.restaurant;

public class Speise {

    private String name;
    private float preis;
    private float selbstkosten;


    public Speise(String name, float preis, float selbstkosten) {
        this.name = name;
        this.preis = preis;
        this.selbstkosten = selbstkosten;
    }


    public String toString() {
        return name + ": € " + preis;
    }

    public String getName() {
        return name;
    }

    public float getPreis() {
        return preis;
    }

    public float getSelbstkosten() {
        return selbstkosten;
    }
}
