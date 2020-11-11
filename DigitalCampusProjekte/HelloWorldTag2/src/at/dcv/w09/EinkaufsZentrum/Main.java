package at.dcv.w09.EinkaufsZentrum;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        EinkaufsZentrum ekz1 = new EinkaufsZentrum("EKZ Simmering");

        Buchladen b1 = new Buchladen();
        LebensmittelLaden l1 = new LebensmittelLaden();
        KleidungsLaden k1 = new KleidungsLaden();


        Buch bu1 = new Buch("Krieg und Frieden");
        Buch bu2 = new Buch("Trisolaris");
        b1.addProdukt(bu1);
        b1.addProdukt(bu2);

        Kleid kl1 = new Kleid("Susi");
        Kleid kl2 = new Kleid("Elisabeth Green");
        k1.addProdukt(kl1);
        k1.addProdukt(kl2);
        k1.addProdukt(bu1);

        Lebensmittel le1 = new Lebensmittel("Banana");
        l1.addProdukt(le1);

        // Übersicht Printen:
        System.out.println();
        b1.printÜbersicht();
        l1.printÜbersicht();
        k1.printÜbersicht();

    }
}
