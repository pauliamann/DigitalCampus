package at.dcv.w09.EinkaufsZentrum;

import java.util.Random;
import java.util.Vector;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {


        EinkaufsZentrum ekz1 = new EinkaufsZentrum("EKZ Simmering");
// Läden:
        Buchladen b1 = new Buchladen();
        LebensmittelLaden l1 = new LebensmittelLaden();
        KleidungsLaden k1 = new KleidungsLaden();
        ekz1.addFachladen(b1);
        ekz1.addFachladen(l1);
        ekz1.addFachladen(k1);

// Produkte:
        Buch bu1 = new Buch("Krieg und Frieden", 16);
        Buch bu2 = new Buch("Trisolaris", 19);
        Buch bu3 = new Buch("Grün ist die Hoffnung", 12);

        Kleid kl1 = new Kleid("Grüne Jacke", 120);
        Kleid kl2 = new Kleid("Blaue Hose", 70);
        Kleid kl3 = new Kleid("Rotes Leiberl", 15);

        Lebensmittel le1 = new Lebensmittel("Banana", 2);
        Lebensmittel le2 = new Lebensmittel("Apfel", 3);
        Lebensmittel le3 = new Lebensmittel("Semmel",1);

// Kunden:
        Käufer kunde1 = new Käufer("Karli");
        Käufer kunde2 = new Käufer("Heinzi");

// Produkte den Läden zufügen
        b1.addProdukt(bu1);
        b1.addProdukt(bu2);
        k1.addProdukt(kl1);
        k1.addProdukt(kl2);
        k1.addProdukt(bu1);
        l1.addProdukt(le1);

// Kunden dem EKZ zufügen
        ekz1.addKunden(kunde1);
        ekz1.addKunden(kunde2);

        kunde1.setEinkaufsListe(generateEinkaufsListe(ekz1));
        kunde2.setEinkaufsListe(generateEinkaufsListe(ekz1));





/* --- --- Übersicht Printen: --- --- */
        System.out.println();
        System.out.println("--- Einkaufslisten ---");
        ekz1.printÜbersicht();
        System.out.println("--- Übersicht: ---");
        b1.printÜbersicht();
        l1.printÜbersicht();
        k1.printÜbersicht();
        System.out.println("--- Status nach einkaufen ---");


    }


    /* Einkaufen  */
    public void einkaufen (Käufer k, EinkaufsZentrum e) {

        // Prüfen ob Produkt der Einkaufsliste in Ekz vorhanden ist.
        // Wenn ja
        // -- in Vector gekauft legen und von einkaufsliste streichen.
        // Wenn nein
        // -- sout "Produkt nicht vorhanden.

        EinkaufsListe eL = k.getEinkaufsListe();
        System.out.println("Jemand geht einkaufen in ");




    }



    /* Choose random Produkts & add to Vektor EinkaufsListeVektor*/
    public static EinkaufsListe generateEinkaufsListe(EinkaufsZentrum ekz) {
        int maxProdukteAufEinkaufsliste = 5;
        int randomFachladen = 0;
        Fachladen f = null;
        int randomProdukt = 0;
        Produkt p = null;

        EinkaufsListe liste = new EinkaufsListe();
        for (int i = 0; i < maxProdukteAufEinkaufsliste; i++) {

            if (ekz.getFachladenVector().size() > 0) {                      // Prüfen ob im Läden enthalten sind.
                randomFachladen = random.nextInt(ekz.getFachladenVector().size());
                f = ekz.getFachladenVector().get(randomFachladen);

                if (f.getProduktVector().size() > 0) {                      // Prüfen ob Produkte enthalten sind.
                    randomProdukt = random.nextInt(f.getProduktVector().size());
                    p = f.getProduktVector().get(randomProdukt);
                    liste.addProdukt(p);
                }
            }
        }
        return liste;
    }



}
