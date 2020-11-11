package at.dcv.w09.EinkaufsZentrum;

public class Buch extends Produkt {

    public static final String DESCRIPTION = "Buch";

    private String name;

    public Buch(String name) {
        this.name = name;
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
