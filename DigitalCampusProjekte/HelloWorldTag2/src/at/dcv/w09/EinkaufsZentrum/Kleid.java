package at.dcv.w09.EinkaufsZentrum;

public class Kleid extends Produkt{
    public static final String DESCRIPTION = "Kleidung";
    public String name;
    private int preis;

    public Kleid(String name, int preis) {
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
