package at.dcv.w08.landSimulation;

import java.util.Vector;

public class Wohnungen {

    private String tuerNummer;
    public Vector<Mensch> menschenVector;

    public Wohnungen(String tuerNummer) {
        this.tuerNummer = tuerNummer;
        this.menschenVector = new Vector<Mensch>();
    }

    public Mensch addMensch(String neuerMensch, String gender, int age) {
        for( Mensch w: menschenVector ){
            if (w.getName().equals(neuerMensch)) {
                return w;
            }
        }
        Mensch s = new Mensch(neuerMensch, age, gender);
        menschenVector.add(s);
        return s;
    }

    public void printMensch(String prefix) {
        System.out.print(prefix + prefix + "Bewohner: ");
//        for (Mensch m : menschenVector) {
//            System.out.print(m.getName() + " ");
//        }
        System.out.println();
    }

    public int getAnzahlBewohner() {

        int anzahlBewohner = menschenVector.size();
        return anzahlBewohner;
    }

    public String getTuerNummer() {
        return tuerNummer;
    }

    public int summeAlterProWohnung () {
        int summeAlterProWohnung = 0;

        for (Mensch m : menschenVector) {
            summeAlterProWohnung += m.getAge();
        }
        return summeAlterProWohnung;
    }

    public float getDurchschnittAlterProWohnung() {

        float DurchschnittAlterProWohnung = summeAlterProWohnung() / getAnzahlBewohner();

        return DurchschnittAlterProWohnung;
    }

    @Override
    public String toString() {
        return "Türnumemr: " + tuerNummer + " Bewohner: " + menschenVector;
    }


}
