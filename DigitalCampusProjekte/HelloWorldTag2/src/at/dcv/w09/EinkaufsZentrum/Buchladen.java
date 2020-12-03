package at.dcv.w09.EinkaufsZentrum;

public class Buchladen extends Fachladen{

    private static String typ = "Buch";

    public Buchladen() {
        super();
    }

    @Override
    public String getDescription() {
        return Buch.DESCRIPTION;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }


}
