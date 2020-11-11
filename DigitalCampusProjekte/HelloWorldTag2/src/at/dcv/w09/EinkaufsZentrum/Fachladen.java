package at.dcv.w09.EinkaufsZentrum;

import java.util.Vector;

public abstract class Fachladen implements IProduktKategorie {

    private Vector<Produkt> produktVector = new Vector<>();

    public Fachladen() {
    }

    public void addProdukt(Produkt p) {
        if (p.getDescription() == getDescription()) {
            System.out.printf("Produkt \"%s\" kann zum %s zugefügt werden. \n", p.getDescription(), this.getClass().getSimpleName().toUpperCase());
            produktVector.add(p);

        } else {
            System.out.printf("Produkt \"%s\" passt nicht zum %s.\n", p.getDescription(), this.getClass().getSimpleName().toUpperCase());
        }
    }

    public Vector<Produkt> getProduktVector() {
        return produktVector;
    }

    public void printÜbersicht() {
        System.out.println("--- Statistik " + this.getClass().getSimpleName() + " ---");
        for (Produkt p: produktVector) {
            System.out.println(" " + p);
        }
        System.out.println();
    }


}
