package at.dcv.w08.landSimulation;

import java.util.Vector;

public class Gebaude {

    private String adresse;
    private String hausNummer;
    private Vector<Wohnungen> wohnungenListe;

    public Gebaude(String adresse, String hausNummer) {
        this.adresse = adresse;
        this.hausNummer = hausNummer;
        this.wohnungenListe = new Vector<Wohnungen>();
    }

    public Wohnungen addWohnungen(String neueWohnung) {
        for( Wohnungen w: wohnungenListe ){
            if (w.getTuerNummer().equals(neueWohnung)) {
                return w;
            }
        }
        Wohnungen s = new Wohnungen(neueWohnung);
        wohnungenListe.add(s);
        return s;
    }

    public void printWohnungen(String prefix) {
        System.out.println();
        System.out.println(prefix + "Darin sind " + wohnungenListe.size() + " Wohnungen.");
        for (Wohnungen w : wohnungenListe) {
            System.out.print(prefix + prefix + "Wohnung mit Nr.: " + w.getTuerNummer() + " hat " + w.getAnzahlBewohner() + " Bewohner. \n");
//            w.printMensch(prefix);

        }
        System.out.println();
    }

    public void printWohnungAlterStatistik() {
        for (Wohnungen w : wohnungenListe) {
            System.out.printf("      In Wohnung %s ist %.2f Jahre das Durchschnittsalter.\n" , w.getTuerNummer(), w.getDurchschnittAlterProWohnung());
        }
    }

    public float getDurchschnittsAlterProGebaeude() {
        float alterSummeGebaude = 0f;
        float anzahlBewohnerGebaude = 0f;
        for (Wohnungen w : wohnungenListe) {
            alterSummeGebaude += w.summeAlterProWohnung();
            anzahlBewohnerGebaude += w.getAnzahlBewohner();
        }

        return alterSummeGebaude / anzahlBewohnerGebaude;

    }

    //    Summe des Bewohner alters:
    public double getSummeAlterBewohnerProGebaeude() {
        double summeAlterBewohnerProGebaeuude = 0;

        for (Wohnungen w : wohnungenListe) {
            summeAlterBewohnerProGebaeuude += w.summeAlterProWohnung();
        }

        return summeAlterBewohnerProGebaeuude;
    }


    public int getAnzahlBewohnerProGebaeude() {
        int anzahlBewohnerProGebaeude = 0;

        for (Wohnungen w : wohnungenListe) {
            anzahlBewohnerProGebaeude += w.getAnzahlBewohner();
        }
        return anzahlBewohnerProGebaeude;
    }

    public int getAnzahlWohnungen() {
        int anzahlWohnungen = wohnungenListe.size();


        return anzahlWohnungen;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getHausNummer() {
        return hausNummer;
    }

    @Override
    public String toString() {
        return "Haus: " +
                "adresse='" + adresse + '\'' +
                ", hausNummer=" + hausNummer +
                ", wohnungenListe=" + wohnungenListe +
                '}';
    }
}
