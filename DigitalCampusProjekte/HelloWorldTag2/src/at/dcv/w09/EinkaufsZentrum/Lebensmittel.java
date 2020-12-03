package at.dcv.w09.EinkaufsZentrum;

public class Lebensmittel extends Produkt{

    public static final String DESCRIPTION = "Lebensmittel";

    private String name;
    private int preis;

    public Lebensmittel(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String toString() {
        return name;
    }
}
