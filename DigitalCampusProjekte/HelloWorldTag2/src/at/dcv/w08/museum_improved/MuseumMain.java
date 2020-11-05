package at.dcv.w08.museum_improved;

import java.io.IOException;
import java.util.Vector;

public class MuseumMain {
    public static void main(String[] args) {
        try {
            Vector<String[]> data = ReadInput.readCSV(",", "C:\\Users\\DCV\\Downloads\\museum.csv");
            Vector<Museum> museen = new Vector<>();
            parseInput(data, museen);
        } catch (IOException exc) {
            System.out.println("Datei konnte nicht gelesen werden...");
            System.exit(1);
        }
    }

    private static void parseInput(Vector<String[]> data, Vector<Museum> museen) {
        boolean firstLineRead = false;
        for (String[] line : data) {
//            if (line.length == 8) {
//                if(firstLineRead) {
//                    Museum museum = new Museum(line[0]);
//                    museum.print();
//                } else {
//                    firstLineRead = true;
//                }
//            }

            if (line.length != 8) {
                continue;
            }
            if (!firstLineRead) {
                firstLineRead = true;
                continue;
            }

            Museum museum = findOrAdd(new Museum(line[0]), museen);

            Etage etage = (Etage) museum.findOrAdd(new Etage(line[1]));

            Raum raum = (Raum) etage.findOrAdd(new Raum(line[2]));

            Kunstobjekt kunstObjekt = null;
            String kunstTyp = line[3];
            String[] farben = line[4].split(";");
            String[] materialien = line[5].split(";");
            String titel = line[7];
            if (kunstTyp.equals("Gemälde")) {
                kunstObjekt = new Gemaelde(titel, farben, materialien);
            } else if (kunstTyp.equals("Skulptur")) {
                kunstObjekt = new Skulptur(titel, farben, materialien);
            }
            if (kunstObjekt != null) {
                raum.findOrAdd(kunstObjekt);
            }
        }

        for (Museum museum : museen) {
            museum.print(" ");
        }
    }

    private static Museum findOrAdd(Museum museum, Vector<Museum> museen) {
        int index = museen.indexOf(museum);
        if (index >= 0) {
            return museen.get(index);
        } else {
            museen.add(museum);
            return museum;
        }
    }
}
