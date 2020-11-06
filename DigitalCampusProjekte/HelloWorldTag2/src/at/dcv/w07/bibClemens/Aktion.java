package at.dcv.w07.bibClemens;

import java.util.Date;
import java.util.Vector;


public class Aktion extends Object {
    private Date datum;
    private String aktion;
    private String name;
    private String bvNr;


    @Override
    public String toString() {
        return "{ typ = " + aktion + ", datum = " + datum + ", name = " + name + "}\n";
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;

    }


    public void execute(Bibliothek bibliothek) {


        System.out.printf("Ausführen:  %s\n", getAktion());
        System.out.println();

        if (getAktion().equals("SUCHE")) {
            performSuche(bibliothek);
            System.out.println("************************************************");
            System.out.println();
        }

        if (getAktion().equals("AUSLEIHEN")) {


            performAusleihen(bibliothek);
            System.out.println("************************************************");
            System.out.println();
        }


        if (getAktion().equals("ZURUECK")) {
            Buch b = bibliothek.getAusgeliehenesBuch(getBvNr());

            bibliothek.zurueckbringen(b);

            //bibliothek.ausleihen(b, getName(), getDatum());

            System.out.printf("%s wurde von %s am %s zurückgebracht.\n", b.getTitel(), getName(), getDatum());
            System.out.println("************************************************");
            System.out.println();

        }

    }

    private void performAusleihen(Bibliothek bibliothek) {
        Buch b = bibliothek.getBuch(getBvNr());
        if (b == null) {
            bibliothek.getAusgeliehenesBuch(getBvNr()).anfrage();
            // Fragt das Buch im Vector ausgeliehene Bücher ab
            System.out.printf("%s wollte Das Buch mit der BvNr.: %s ausleihen. Es ist jedoch im Moment nicht verfügbar.\n", getName(), getBvNr());
        } else {
            bibliothek.ausleihen(b, getName(), getDatum());

            System.out.printf("%s wurde von %s am %s ausgeliehen.\n", b.getTitel(), getName(), getDatum());
            bibliothek.getAusgelieheneBuecher();

            System.out.println("Ausgeliehen sind im Moment:");
            System.out.println();


            Vector<Buch> ausgelieheneBuecher = bibliothek.getAusgelieheneBuecher();
            for (int i = 0; i < ausgelieheneBuecher.size(); i++) {
                ausgelieheneBuecher.get(i);
                System.out.println("   " + ausgelieheneBuecher.get(i).getTitel());
            }

        }
    }

    private void performSuche(Bibliothek bibliothek) {
        Vector<Buch> suchResultat = bibliothek.search(suchTxt);
        System.out.printf("%s sucht nach dem Stichwort '%s', seine Ergenbisse:\n", getName(), getSuchTxt());
        System.out.println();
        for (int i = 0; i < suchResultat.size(); i++) {
            System.out.printf("    %s\n", suchResultat.get(i).getTitel());
        }
    }


    public String getAktion() {
        return aktion;
    }

    public void setAktion(String aktion) {
        this.aktion = aktion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBvNr() {
        return bvNr;
    }

    public void setBvNr(String bvNr) {
        this.bvNr = bvNr;
    }

    public String getSuchTxt() {
        return suchTxt;
    }

    public void setSuchTxt(String suchTxt) {
        this.suchTxt = suchTxt;
    }

    private String suchTxt;
}


