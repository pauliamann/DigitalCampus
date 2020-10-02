package at.dcv.w01;

import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class tag04Arrays {
    public static void main(String[] args) {

/*        int variable = 5;
        int maxCount;
        int ergebnis;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        variable = scan.nextInt();

        System.out.println("Gib eine Maximale Multiplikations Anzahl ein:");
        maxCount = scan.nextInt();


        for (int count=1; count <= maxCount; ++count) {
            ergebnis = variable * count;
            System.out.println(variable + " * " + count + " = " + ergebnis);
        }*/

/*        int variableX;
        int variableY;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Zahl für X ein:");
        variableX = scan.nextInt();

        System.out.println("Gib eine Zahl für Y ein:");
        variableY = scan.nextInt();

        boolean xGreaterY = true;

        xGreaterY = variableX > variableY;
        System.out.println();

        if (xGreaterY){
            System.out.println( "X ist größer als Y");
        } else {
            System.out.println(" X ist nicht größer als Y");
        }*/

        /* ---
         * ----  Computer gibt eine Rechenaufgabe aus und verlangt nach Ergebnis
         * ----  User gibt ein Ergebnis ein.
         * ----  Das Ergebnis wird überprüft und "Richtig" oder "Falsch" ausgegeben.
         *
         * */

        int min = 1;
        int max = 10;

        int randomNumVariableX = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNumVariableY = ThreadLocalRandom.current().nextInt(min, max + 1);

        // Input von User mit Ergebnis abfragen:
        int ergebnis = randomNumVariableX * randomNumVariableY;
        int ergebnisUser;

        Scanner scan = new Scanner(System.in);
        System.out.println("was ist das Ergebnis für " + randomNumVariableX + " * " + randomNumVariableY + " ?");
        ergebnisUser = scan.nextInt();

        // User Ergebnis vergleichen und Ergebnis anzeigen:
        boolean eingabeKorrekt = ergebnis == ergebnisUser;




        if (eingabeKorrekt) {
            System.out.println("Das ist korrekt");
        } else {
            System.out.println("Das ist falsch, probiers nochmal");
            System.out.println("was ist das Ergebnis für " + randomNumVariableX + " * " + randomNumVariableY + " ?");
//            ergebnisUser = scan.nextInt();

        }


    }
}

