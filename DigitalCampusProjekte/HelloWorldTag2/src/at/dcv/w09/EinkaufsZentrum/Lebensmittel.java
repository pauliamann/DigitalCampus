package at.dcv.w09.EinkaufsZentrum;

public class Lebensmittel extends Produkt{

    public static final String DESCRIPTION = "Lebensmittel";

    private String name;

    public Lebensmittel(String name) {
        this.name = name;
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