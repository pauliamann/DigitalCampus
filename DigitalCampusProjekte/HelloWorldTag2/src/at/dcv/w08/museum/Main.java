package at.dcv.w08.museum;


import at.dcv.w08.interfaceInnerClassAbstract.CSVReader;
import at.dcv.w08.interfaceInnerClassAbstract.ICSVProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

public class Main {
    private static class MuseumReader implements ICSVProcessor {
        private Vector<Museum> museumVector;

        public MuseumReader(Vector<Museum> museumVector) {
            this.museumVector = museumVector;
        }

        @Override
        public boolean isLineValid(int columnCount) {
            if (columnCount == 8) return true;
            return false;
        }

        @Override
        public void process(String[] columns) {
            Museum museum = searchAndCreateMuseum(columns[0], museumVector);
            Etage etage = museum.searchAndCreate(columns[1]);
            Raum raum = etage.searchAndCreateRaum(columns[2]);
            raum.searchAndCreate(columns[6], columns[7]);
        }
    }


    public static void main(String[] args) {
        Vector<Museum> museumVector = new Vector<>();

        MuseumReader mr = new MuseumReader(museumVector);
        CSVReader csvReader = new CSVReader(mr);
        csvReader.readCSV("C:\\Users\\DCV\\Desktop\\museum.csv", ",");



//        --- A U S G A B E ---


        int time = 4;


        for (Museum m : museumVector) {
            m.runSimulation(time);
        }


/*//        Print museumsstruktur
        for (Museum museum: museumVector) {
            System.out.println(museumVector.size());
            museum.printStruktur(" ");
        }*/

    }


    public static Museum findOrAdd(Museum neuesMuseum, Vector<Museum> museumVector) {
        int index = museumVector.indexOf(neuesMuseum);
        if (index >= 0) {
            return museumVector.get(index);
        } else {
            museumVector.add(neuesMuseum);
            return neuesMuseum;
        }
    }

    public static Museum searchAndCreateMuseum(String neuesMuseum, Vector<Museum> museumVector) {
        for (Museum m : museumVector) {
            if (m.getName().equals(neuesMuseum)) {
                return m;
            }
        }
        Museum m = new Museum(neuesMuseum);
        museumVector.add(m);
        return m;
    }


    public static Vector<String[]> readCSV(String filename, String delimiter, Vector<Museum> museumVector) throws IOException {
        BufferedReader br = null;
        Vector<String[]> lines = new Vector<>();
        boolean firstLineRead = false;

        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                if (!firstLineRead) {
                    firstLineRead = true;
                    continue;
                }

                String[] spalte = line.split(delimiter);
                // hier werden die Daten den Vektoren zugeordnet
                if (spalte.length == 8) {

                    Museum museum = searchAndCreateMuseum(spalte[0], museumVector);
                    Etage etage = museum.searchAndCreate((spalte[1]));
                    Raum raum = etage.searchAndCreateRaum((spalte[2]));
                    Kunstobjekt kunstobjekt = raum.searchAndCreate(spalte[6], spalte[7]);
                }
            }
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ioe) {
                }
            }
        }
        return lines;
    }

}

