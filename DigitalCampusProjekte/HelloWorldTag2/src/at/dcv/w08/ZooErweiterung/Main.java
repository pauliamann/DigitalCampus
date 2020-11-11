package at.dcv.w08.ZooErweiterung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        Zoo zoo = new Zoo("Bekos Zoo");
        Zoo zoo = Zoo.getZoo();
        Futter futterHeu = zoo.searchAndCreateFutter("Heu");
        Futter futterSand = zoo.searchAndCreateFutter("Sand");

        Gehege gehegeSavanna = zoo.searchAndCreateGehege("Savanna");
        Tier tierZebra = gehegeSavanna.searchAndCreateTiere("Käfer", "Aladin", futterHeu, 10, 100);

        Pfleger pflegerAnton = zoo.searchAndCreatePfleger("Anton" , "Zebra", "Pfleger");
        pflegerAnton.addGehege(gehegeSavanna);


/*        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Ernstl");
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Gustav");
        zoo.addMitarbeiter(mitarbeiter1);
        zoo.addMitarbeiter(mitarbeiter2);*/

        zoo.searchAndCreateTierArzt("Dr.Doolttle", "Tierarzt");

        SaeugeTier saeugeTier1 = new SaeugeTier("Giraffe", "Gustav", futterHeu, 15, 100);
        Insekt insekt1 = new Insekt("Mistkäfer" , "KHG", futterSand, 20, 100 );
        Giraffe giraffe1 = new Giraffe("Theresa", 25.0, 100);
        gehegeSavanna.addTier(saeugeTier1);
        gehegeSavanna.addTier(insekt1);
        gehegeSavanna.addTier(giraffe1);


//        readTiereCSV("C:\\Users\\DCV\\Desktop\\Tiere.csv", zoo);
//        readPersonalCSV("C:\\Users\\DCV\\Desktop\\Personal.csv", zoo);

        zoo.printZooStruktur();

       /* for (int i = 0; i < 10; i++) {
            zoo.simulateOneDay(i);
        }
        zoo.printFutterBedarf();*/

    }

  /*  public static void readTiereCSV(String fileName, Zoo zoo) {
        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(fileName));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 6) {
                            Gehege g = zoo.searchAndCreateGehege(spalte[5]);
                            Futter f = zoo.searchAndCreateFutter(spalte[2]);
                            g.searchAndCreateTiere(spalte[0], spalte[1], f, Double.valueOf(spalte[3]), Integer.valueOf(spalte[4]));
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

    public static void readPersonalCSV(String fileName, Zoo zoo) {
        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(fileName));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(",");
                        if (spalte.length == 4) {
                            if (spalte[1].equals("Tierartz")) {
                                zoo.searchAndCreateTierArzt(spalte[0]);
                            } else {
                                Gehege g = zoo.searchAndCreateGehege(spalte[2]);
                                Pfleger p = zoo.searchAndCreatePfleger(spalte[0], spalte[3]);
                                p.addGehege(g);
                            }
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
    }*/
}
