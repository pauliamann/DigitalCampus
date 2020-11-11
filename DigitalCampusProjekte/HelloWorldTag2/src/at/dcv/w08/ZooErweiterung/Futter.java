package at.dcv.w08.ZooErweiterung;

public class Futter {


    private String name;
    private double bedarf = 0;


    public Futter(String name)
    {
        this.name = name;

    }

    public String getName()
    {
        return name;
    }
    public void futterAusgabe(double menge)
    {
        bedarf += menge;
    }

    public double getBedarf()
    {
        return bedarf;
    }
}
