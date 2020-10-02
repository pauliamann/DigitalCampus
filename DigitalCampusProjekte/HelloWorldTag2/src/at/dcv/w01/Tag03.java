package at.dcv.w01;

import java.util.Scanner;  // import the Scanner class

public class Tag03 {
    public static void main(String[] args) {

        /* ------------------------------------------------
        --- Serie Pi: 4/1 - 4/3 + 4/5 - 4/7 ...
        ------------------------------------------------ */
/*
        int pi1 = 1;
        int pi2 = 1;
        double myPi = 0;

        while ( pi1 < 2000) {

            myPi += pi2 * 4 / (double) pi1;
            pi1 += 2;
            pi2 *= -1;

            System.out.println(myPi);
*/

        /* ------------------------------------------------
        --- Summe von : 1 +2 + 3 + ... 99 + 100
        ------------------------------------------------ */

/*        long forErgebnis = 1;
        for (int forZahl = 2; forZahl < 101; ++forZahl) {

            forErgebnis = forErgebnis + forZahl;
            System.out.println(forErgebnis);
        }
*/

        /* ------------------------------------------------
        --- Aufgabe C: Ist Zahl X eine Primzahl?
            Zahl ist nur durch sich selbst und 1 Teilbar
            D.h. man muss prüfen ob:
                - die Zahl durch die Zahlen von
                  - 2 bis (Zahl-1) teilbar ist.
                - (ohne Rest)
        ------------------------------------------------ */

/*        int zahlX = 11;
        boolean isPrim = true;

        for (int prüfZahl = 2; prüfZahl < zahlX && isPrim; prüfZahl = prüfZahl + 1) {
            if (zahlX % prüfZahl == 0) {
                isPrim = false;
            }
        }

        if (isPrim) {
            System.out.println(zahlX + " ist Primzahl");
        } else {
            System.out.println(zahlX + " ist keine Primzahl");
        }
*/





        /* ------------------------------------------------
        --- Die ersten 100 Primzahlen
        ------------------------------------------------ */
/*        int a = 2;
        int countPrim = 0;
        while (countPrim < 100) {
            boolean isPrim = true;

            for (int x = 2; x < a; ++x) {
                if (a % x == 0) {
                    isPrim = false;
                }
            }

            if (isPrim) {
                ++countPrim;
                System.out.println(countPrim + ". Primzahl ist " + a);

            }
            ++a;
        }*/

        /* ------------------------------------------------
        --- Quarat mit x*A Seitenlänge bauen
        ------------------------------------------------ */

/*        String txtA = "A ";
        int variableA = 5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        variableA = scan.nextInt();

        System.out.println("Aufgabe Quadrat");
        for (int height = 1; height <= variableA; ++height ) {
            for (int width = 1; width <= variableA; ++width ) {
                System.out.print(txtA);
            }

            System.out.println("");
        }*/

        /* ------------------------------------------------
        --- Rechteck mit x*y*B Seitenlänge bauen
        ------------------------------------------------ */

/*       String txtB = "B";
         int widthVariable = 1;
        int heightVariable = 4;

        System.out.println("Aufgabe Rechteck:");

        for (int height = 1; height <= heightVariable; ++height) {
            for (int width = 1; width <= widthVariable; ++width) {
                System.out.print(txtB);
            }

            System.out.println("");

        }*/


        /* ------------------------------------------------
        --- Dreieck mit 1C 2C 3C 4C Seitenlänge bauen
            C
            CC
            CCC
        ------------------------------------------------ */

/*
        String txtC = "C";

        System.out.println("Aufgabe Dreieck Variante C:");

        for (int variableWidth = 1; variableWidth <= 5; ++variableWidth ) {
            for (int width = 1; width <= variableWidth; ++width) {
                System.out.print(txtC);
            }
            System.out.println("");
        }
*/



        /* ------------------------------------------------
        --- Dreieck mit D Seitenlänge bauen
         DDD
         DD
         D
        ------------------------------------------------ */

/*        String txtD = "D";
        int sizeD = 3;

        System.out.println("Aufgabe Dreieck Variante D:");

        for (int variableWidth = 1; variableWidth <= sizeD; ++variableWidth ) {
            for (int width = 1; width <= 1+sizeD-variableWidth; ++width) {
                System.out.print(txtD);
            }
            System.out.println("");
        }*/

    }
}
