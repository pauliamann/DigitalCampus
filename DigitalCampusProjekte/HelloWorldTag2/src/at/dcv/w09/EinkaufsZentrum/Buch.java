package at.dcv.w09.EinkaufsZentrum;

public class Buch extends Produkt {

    public static final String DESCRIPTION = "Buch";

    private String name;
    private int preis;

    public Buch(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String toString() {
        return name ;
    }
}
