package at.dcv.w06.restaurant;

import java.io.*;

public class main {

    public static void main(String[] args) {
        Restaurant rest1 = new Restaurant("Ostwind");

        /* --- . --- . ---  A U S G A B E --- . --- . --- */


        readTischCSV("C:\\Users\\DCV\\Desktop\\Restaurant\\tisch.csv", rest1);
        readSpeiseCSV("C:\\Users\\DCV\\Desktop\\Restaurant\\speise.csv", rest1);
        readGaeste("C:\\Users\\DCV\\Desktop\\Restaurant\\gasteGruppe.csv", rest1);
        readGruppeCSV("C:\\Users\\DCV\\Desktop\\Restaurant\\gasteGruppe.csv", rest1);
        rest1.printRestaurantStruktur();


//        rest1.alleGruppenzuweisen();
//        rest1.bestellungen();

    }

    public static void readTischCSV(String filename, Restaurant rest1) {

        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 2) {
                            Tisch t = rest1.searchAndCreateTisch(spalte[0], Integer.valueOf(spalte[1]));

                        } else {
                            System.out.println("Zeile konnte nicht gelesen werden: \n" + line);
                        }
                    }
                    ++idxLine;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static void readGruppeCSV(String filename, Restaurant rest1) {

        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 4) {
                            Gruppe g = rest1.searchAndCreateGruppe(spalte[0], Integer.valueOf(spalte[1]), spalte[2], spalte[3]);

                        } else {
                            System.out.println("Zeile konnte nicht gelesen werden: \n" + line);
                        }
                    }
                    ++idxLine;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static void readGaeste(String filename, Restaurant rest1) {

        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 4) {
                            rest1.doAktionen(spalte[0], Integer.valueOf(spalte[1]), spalte[2], spalte[3]);
                        } else {
                            System.out.println("Zeile konnte nicht gelesen werden: \n" + line);
                        }
                    }
                    ++idxLine;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void readSpeiseCSV(String filename, Restaurant rest1) {

        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(filename));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 3) {
                            Speise s = rest1.searchAndCreateSpeise(spalte[0], Float.valueOf(spalte[1]), Float.valueOf(spalte[2]));

                        } else {
                            System.out.println("Zeile konnte nicht gelesen werden: \n" + line);
                        }
                    }
                    ++idxLine;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}

