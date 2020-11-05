package at.dcv.w08.landSimulation;

import at.dcv.w08.codingcampus.Course;

import java.util.Vector;

public class Land {
    private String name;
    private Vector<Stadt> stadtVector;

    public Land(String name) {
        this.name = name;
        this.stadtVector = new Vector<Stadt>();
    }

    public Stadt addStadt(String neueStadt) {
        for (Stadt s: stadtVector) {
            if (s.getName().equals(neueStadt)) {
                return s;
            }
        }
        Stadt s = new Stadt(neueStadt);
        stadtVector.add(s);
        return s;
    }

    public float getSummeBewohnerLand () {
        float summeBewohnerLand = 0;
        for (Stadt s: stadtVector) {
            summeBewohnerLand += s.getAnzahlStadtBewohner();
        }
        return summeBewohnerLand ;
    }

    public float getSummeAlterProLand () {
        float summeAlterProLand = 0;

        for (Stadt s: stadtVector)  {
            summeAlterProLand += s.getSummeAlterStadtbewohner();
        }

        return summeAlterProLand;
    }

    public float getDurschnittAlterLand() {
        float durschnittAlterLand = 0;

        durschnittAlterLand = getSummeAlterProLand() / getSummeBewohnerLand();

        return durschnittAlterLand;
    }

    public void printLandStrukture(String prefix) {
        System.out.println("Land: " +name);
        System.out.println("Anzahl Städte: " + stadtVector.size() );
        System.out.println();
        for (Stadt s: stadtVector) {
            System.out.print(ANSI_YELLOW + prefix + "Stadt: "+ s.getName() + " "+ ANSI_RESET);
            s.printGebaeude(prefix);

        }
    }

    public void printLandAltersStatistik () {
        System.out.println("--- --- Statistik Alter --- ---");
        System.out.printf("Land %s: %.2f Jahre\n", name, getDurschnittAlterLand());
        for (Stadt s: stadtVector) {
            System.out.printf("  Altersdurchschnitt in %s ist: %.2f Jahre. \n" ,s.getName() , s.getDurchschnittsalterStadtbewohner());

            s.printGebaeudeAlterStatistik();
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Land{" +
                "name='" + name + '\'' +
                ", stadtVector=" + stadtVector +
                '}';
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
