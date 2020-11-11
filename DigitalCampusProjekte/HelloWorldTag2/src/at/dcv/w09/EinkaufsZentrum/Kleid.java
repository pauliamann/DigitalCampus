package at.dcv.w09.EinkaufsZentrum;

public class Kleid extends Produkt{
    public static final String DESCRIPTION = "Kleidung";
    public String name;

    public Kleid(String name) {
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
