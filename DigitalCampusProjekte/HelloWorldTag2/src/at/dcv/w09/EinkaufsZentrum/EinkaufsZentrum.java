package at.dcv.w09.EinkaufsZentrum;

import java.util.Vector;

public class EinkaufsZentrum {
    private String name;
    Vector<Fachladen> fachladenVector = new Vector<>();

    public EinkaufsZentrum(String name) {
        this.name = name;
    }

    public void addFachladen (Fachladen fachladen) {
        fachladenVector.add(fachladen);

    }
    public void printÜbersicht() {
        System.out.println("--- Statistik ---");
        for (Fachladen f: fachladenVector) {
            System.out.println("Fachladen: " +f);
            f.printÜbersicht();
        }


    }

}
