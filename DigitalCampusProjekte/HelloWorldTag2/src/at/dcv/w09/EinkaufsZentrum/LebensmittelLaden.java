package at.dcv.w09.EinkaufsZentrum;

public class LebensmittelLaden extends Fachladen{

    private static String typ = "Lebensmittel";

    public LebensmittelLaden() {
        super();
    }

    @Override
    public String getDescription() {
        return Lebensmittel.DESCRIPTION;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
