package at.dcv.w01;

import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class tag04Arrays {
    public static void main(String[] args) {



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

