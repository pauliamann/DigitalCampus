package at.dcv.w08.landSimulation;

import at.dcv.w07.bibliotheksDaten.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Welt welt = new Welt("Erde");

        readCountryCSV("C:\\Users\\DCV\\Desktop\\datenStadt.csv", welt);


        // --- Ausgabe ---

//        l1.printLandStrukture("  ");
//        welt.printWeltStruktur();
        welt.printWeltAltersStatistik();


        // --- ausgabe Ende

    }

    public static void readCountryCSV(String filename, Welt welt) {

        BufferedReader br = null;
        int idxLine = 0;

        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 10) {
                            Land land = welt.addLand(spalte[0]);
                            Stadt stadt = land.addStadt(spalte[2]);
                            Gebaude gebaude = stadt.addGebaude(spalte[4], spalte[6]);
                            Wohnungen wohnungen = gebaude.addWohnungen(spalte[6]);
                            Mensch mensch = wohnungen.addMensch(spalte[7], spalte[9], Integer.parseInt(spalte[8]));

                            //Land l =  welt.searchAndCreateLand(spalte[0], spalte[1], spalte[2], spalte[3], spalte[4], spalte[5], Integer.valueOf(spalte[6]), spalte[7], Integer.valueOf(spalte[8]), spalte[9]);
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




}
