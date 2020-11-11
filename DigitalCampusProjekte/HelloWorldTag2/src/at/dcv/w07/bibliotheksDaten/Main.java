package at.dcv.w07.bibliotheksDaten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        Library lib1 = new Library("Büchereien Wien");

        readBucherCSV("C:\\Users\\DCV\\Desktop\\Bibliothek\\Bucher.csv", lib1);

        lib1.searchAndCreateUser("2020-10-12","AUSLEIHEN", "Besat", "13-409920", null);
        lib1.searchAndCreateUser("2020-11-12","ZURUECK", "Besat", "13-409920", null);


//        readAktionenCSV("C:\\Users\\DCV\\Desktop\\Bibliothek\\BibliothekAktion.csv", lib1, aktionen);

        /* --- . --- . ---  A U S G A B E --- . --- . --- */

        lib1.printBibliothekStruktur(lib1.bookList);



    }

    private static void readBucherCSV(String filename, Library lib1) {

        BufferedReader br = null;
        int idxLine = 0;

        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(";");
                        if (spalte.length == 6) {
                            Book b =  lib1.searchAndCreateBook(spalte[0], spalte[1], spalte[2], spalte[3], spalte[4], Integer.valueOf(spalte[5]));
//                            System.out.printf("Zeile mit idxLine %s wurde eingelesen. \n", idxLine);
                        } else {
                            System.out.println("Zeile konnte nicht gelesen werden: \n" + line);
                        }
                    }
                    ++idxLine;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

//read Aktionen CSV
/*

    private static void readAktionenCSV(String filename, Library lib1, Vector<Aktion> akt) throws Exception {

        BufferedReader br = null;
        int idxLine = 0;

        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(";");
                        if (spalte.length > 1) {
                            Aktion ak =  new Aktion(spalte[0], spalte[1], spalte[2],spalte[3] );
                            // if spalte (switch Funktion)


                            System.out.printf("Zeile mit idxLine %s wurde eingelesen. \n", idxLine);
                        }
                    }
                    ++idxLine;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

*/


}
