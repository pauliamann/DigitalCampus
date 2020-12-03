package at.dcv.w09.EinkaufsZentrum;

import java.util.Vector;

public class EinkaufsZentrum {
    private String name;
    private Vector<Fachladen> fachladenVector = new Vector<>();
    private Vector<Käufer> käuferVector = new Vector<>();

    public EinkaufsZentrum(String name) {
        this.name = name;
    }

    public void addFachladen(Fachladen fachladen) {
        fachladenVector.add(fachladen);
    }

    public void addKunden(Käufer kunde) {
        käuferVector.add(kunde);
    }

    public void printÜbersicht() {
        System.out.println("--- Statistik ---");

        for (Käufer k : käuferVector) {

            System.out.println(k.getName() + "s Einkaufsliste:");
            if (k.getEinkaufsListe() != null) {
                k.getEinkaufsListe().printRestProdkte();
            }
            System.out.println();

        }
        System.out.println();


    }

    public Vector<Fachladen> getFachladenVector() {
        return fachladenVector;
    }

    @Override
    public String toString() {
        return name;
    }
}
