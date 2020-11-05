package at.dcv.w08.landSimulation;

import java.util.Vector;

public class Welt {

private String name;
private Vector<Land> landVector;

    public Welt(String name) {
        this.name = name;
        this.landVector = new Vector<Land>();
    }

    public Land addLand(String newLand) {
        for (Land s: landVector) {
            if (s.getName().equals(newLand)) {
                return s;
            }
        }
        Land s = new Land(newLand);
        landVector.add(s);
        return s;
    }

    public void printWeltStruktur() {
        System.out.println("Anzahl Länder: " + landVector.size());
        for (Land l: landVector) {
            System.out.println(l.getName());
            l.printLandStrukture("   ");
        }
    }

    public void printWeltAltersStatistik () {
        System.out.println("--- --- Statistik Alter --- ---");
        for (Land s: landVector) {
            System.out.printf("In %s sind sie im Schnitt %.2f alt. \n", s.getName() , s.getDurschnittAlterLand());
        }
        for (Land s: landVector) {
            s.printLandAltersStatistik();
        }

    }

    public Land searchAndCreateLand (String LandName, String LandKode, String StadtName, String StadtPLZ, String GebaeudeAdresse, String WohnungsEtage, int WohnungNr, String MenschName, int MenschAlter, String MenschGeschlecht) {
        for (Land l: landVector) {
            if (l.getName().equals(name)) {
                System.out.println("name ist schon vorhanden.");
                return l;
            }
        }
        Land l = new Land(name);
        landVector.add(l);
        return l;
    }


}
