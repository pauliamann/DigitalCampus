package at.dcv.w07.bibClemens;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Bibliothek {

    private Vector<Buch> books = new Vector<>();
    private Vector<Ausleihung> ausleihungen = new Vector<>();


    public void importBooks(String csv) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(csv));
        lines.remove(0); //entferne die Titel-Zeile
        for (String line : lines) {
            String fields[] = line.split(";");


            Buch b = new Buch();

            b.setBvNr(fields[0]);
            b.setIsbn(fields[1]);
            b.setAutoren(fields[2]);
            b.setTitel(fields[3]);
            b.setVerlag(fields[4]);
            b.setLadenpreis(Integer.valueOf(fields[5]));

            books.add(b);
        }
    }

    public void zurueckbringen(Buch b) {
        Ausleihung tooRemove = null;
        for (Ausleihung ausleihung : ausleihungen) {
            if (ausleihung.getBuch().equals(b)) {
                tooRemove = ausleihung;
            }
        }
        ausleihungen.remove(tooRemove);
        books.add(tooRemove.getBuch());
    }

    public void printAllBooks() {
        int i = 1;
        for (Buch b : books) {
            System.out.printf("%5s %15s, %10s\n", i, b.getBvNr(), b.getTitel());
            i++;
        }
    }


    public Vector<Buch> search(String suchTxt) {
        Vector<Buch> suchResultate = new Vector<>();
        for (int i = 0; i < books.size(); i++) {
            Buch b = books.get(i);
            if (suchResultate.size() < 20) {
                if (
                        b.getTitel().contains(suchTxt)
                                || b.getVerlag().contains(suchTxt)
                                || b.getAutoren().contains(suchTxt)) {

                    suchResultate.add(b);

                }
            }
        }
        return suchResultate;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public Buch getAusgeliehenesBuch(String bvNr) {
        //suche das Buch bvNR in den ausgeliehenen büchern
        for (Ausleihung ausleihung : ausleihungen) {
            if (ausleihung.getBuch().getBvNr().equals(bvNr)) {
                return ausleihung.getBuch();
            }
        }
        return null;
    }

    public Buch getBuch(String bvNr) {
        for (Buch buch : books) {
            buch.getBvNr();

            if (buch.getBvNr().equals(bvNr)) {
                return buch;
            }
        }
        return null;

    }

    public void ausleihen(Buch b, String name, Date datum) {
        Ausleihung a = new Ausleihung();

        a.setBuch(b);
        a.setAusleiher(name);
        a.setAusleihDatum(datum);

        ausleihungen.add(a);
        b.anfrage();

        books.remove(b);
    }


    public Vector<Buch> getAusgelieheneBuecher() {
        Vector<Buch> ausgebucht = new Vector();


        for (int i = 0; i < ausleihungen.size(); i++) {
            ausgebucht.add(ausleihungen.get(i).getBuch());
        }
        return ausgebucht;
    }

    public void printStatistic() {

        //Neuer Vector in dem alle Bücher der beiden Vectoren ausgelieheneBücher und books sind
        Vector<Buch> allBooks = new Vector<>();
        allBooks.addAll(books);
        allBooks.addAll(getAusgelieheneBuecher());

        allBooks.sort(new BuchComparator());

        int counterAnfragen = 0;
        for (Buch buch : allBooks) {
            if (buch.getAnfragen() > 0 && counterAnfragen <= 4) {
                counterAnfragen++;
                System.out.printf("%s. %s wurde %dx angefragt.\n", counterAnfragen, buch.getTitel(), buch.getAnfragen());
            }

        }
        System.out.println();
        System.out.println("************************************************");
        System.out.println();

        counterAnfragen = 0;
        System.out.println("Die Top Autoren in absteigender Reihenfolge:");
        System.out.println();
        for (Buch buch : allBooks) {
            if (buch.getAnfragen() > 0 && counterAnfragen <= 4) {
                counterAnfragen++;
                System.out.printf("%s. %s mit %s Anfragen.\n", counterAnfragen, buch.getAutoren(), buch.getAnfragen());
            }
        }
    }


    public void mahnungen(Date heute) {
        //long x = 2592000000l;
        //            tage  h    m    s     ms
        long tage_30 = 30 * 24 * 60 * 60 * 1000l;
        for (Ausleihung ausleihung : ausleihungen) {

            long msHeute = heute.getTime();
            long msAusleihung = ausleihung.getAusleihDatum().getTime();

            long ausleihDauerInMs = msHeute - msAusleihung;
            long ueberzug = (msHeute - msAusleihung - tage_30) / (24 * 60 * 60 * 1000l);


            if (ausleihDauerInMs > tage_30) {
                System.out.printf("%s hat am %s, %s ausgeliehen. Die Maximale Ausleihdauer von 30 Tagen wurde dabei um %s Tage überzogen.\n", ausleihung.getAusleiher(), ausleihung.getAusleihDatum(), ausleihung.getBuch().getTitel(), ueberzug);
            }
        }
    }


//    public Vector<Buch> getZurueckgebrachteBuecher()
//    {
//        Vector<Buch> zurueckgebracht = new Vector();
//
//        for (int i = 0; i <; i++)
//        {
//
//        }
//    }
}



