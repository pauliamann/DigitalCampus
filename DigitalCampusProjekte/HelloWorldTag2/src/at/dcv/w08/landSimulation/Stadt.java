package at.dcv.w08.landSimulation;

import java.util.Vector;

public class Stadt {

    private String name;
    private Vector<Gebaude> gebaudeVector;


    public Stadt(String name) {
        this.name = name;
        this.gebaudeVector = new Vector<Gebaude>();
    }

    public Gebaude addGebaude(String adresse, String hausnr) {
        for (Gebaude g: getGebaudeVector()) {
            if (g.getAdresse().equals(adresse)) {
                return g;
            }
        }
        Gebaude g = new Gebaude(adresse, hausnr);
        gebaudeVector.add(g);
        return g;
    }

    public Vector<Gebaude> getGebaudeVector() {
        return gebaudeVector;
    }

    public void printGebaeude(String prefix) {
        System.out.println();
        System.out.println(prefix + "Zürich hat " + getAnzahlStadtBewohner()+ " Einwohner." );
        System.out.printf(prefix + "Es gibt %s Gebäude in %s.\n", getGebaudeVector().size(), name);
        for(Gebaude g: getGebaudeVector()) {
            System.out.println(prefix +"Haus \"" + g.getAdresse() +"\" mit Nr.: "+ g.getHausNummer() + " sind "+ g.getAnzahlWohnungen() + " Wohnungen, mit insgesamt " + g.getAnzahlBewohnerProGebaeude() + " Bewohnern.");
            g.printWohnungen(prefix);
        }
        System.out.println();
    }

    public void printGebaeudeAlterStatistik () {
        for (Gebaude g: gebaudeVector) {
            System.out.printf("    Das Durchschnittsalter der Bewohner von %s %s ist: %.2f Jahre. \n" , g.getAdresse(), g.getHausNummer(), g.getDurchschnittsAlterProGebaeude());
            g.printWohnungAlterStatistik();
        }
    }

    public float getAnzahlStadtBewohner () {
        float anzahlStadtBewohner = 0;

        for (Gebaude g: gebaudeVector) {
            anzahlStadtBewohner += g.getAnzahlBewohnerProGebaeude();
        }
        return anzahlStadtBewohner;
    }

    public float getSummeAlterStadtbewohner () {
        float summeAlterStadtbewohner = 0;

        for (Gebaude g: gebaudeVector) {
            summeAlterStadtbewohner += g.getSummeAlterBewohnerProGebaeude();
        }
        return summeAlterStadtbewohner;
    }

    public float getDurchschnittsalterStadtbewohner () {

        float durchschnittsalterStadtbewohner = getSummeAlterStadtbewohner() / getAnzahlStadtBewohner();

        return durchschnittsalterStadtbewohner ;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stadt{" +
                "name='" + name + '\'' +
                ", gebaudeVector=" + gebaudeVector +
                '}';
    }
}
