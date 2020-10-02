package at.dcv.w01;

import java.sql.SQLOutput;
import java.util.Arrays;

public class W01WEV02 {
    public static void main(String[] args) {
        /*
         * Aufgaben:
         * 1. Gesamtumsatz des Buchladens
         * 2a. Was war das beste Monatsergebnis?
         * 2b. Welcher Monat war das beste Monatsergebnis?
         * 3a. Was war das schwächste Monatsergebnis?
         * 3b. Welcher Monat war das schwächste Monatsergebnis?
         * 4. Gab es 2 Monate hintereinander wo das Ergebnis negativ war?
         * 5. Was war die längste Periode mit negativem Umsatz?
         * 6. Was war das zweitbeste Ergebnis? */


        int[] gesamtUmsatz = {-50, 20, 80, -30, -60, -40, 90, 100 , 0, -35, -45, - 55};
        System.out.println(Arrays.toString(gesamtUmsatz));




        /* 4.Gab es 2 Monate hintereinander wo das Ergebnis negativ war? */

/*        int twoNegativeMonth = 0;

        for (int i = 0; i < gesamtUmsatz.length -1; i++) {
            if ((gesamtUmsatz[i] < 0) && (gesamtUmsatz[i +1] < 0)) {
                ++twoNegativeMonth;
            }
        }
        if (twoNegativeMonth > 0) {
            System.out.println("Ja, es gibt Monate mit negativen Umsätzen hintereinander. ");
        } else {
            System.out.println(" Keine Monate mit negativen Umsätzen hintereinander");
        }*/

        /* 3a + 3b : Schlechtestes Ergebnis anzeigen*/
/*        int schlechtestesMonatsErgebnis =gesamtUmsatz[0];
        int schlechtestesMonat = 0;

        for (int i = 0; i < gesamtUmsatz.length - 1; i++) {
            if (gesamtUmsatz[i] < schlechtestesMonatsErgebnis) {
                schlechtestesMonatsErgebnis = gesamtUmsatz[i];
                schlechtestesMonat = i;
            }
        }
        System.out.println("Schlechtestes Monatsergebnis: " + schlechtestesMonatsErgebnis);
        System.out.println("Schlechtestes Monat: " + (schlechtestesMonat + 1));
        System.out.println();*/


        /*2a + 2b : Bestes Ergebnis anzeigen
         *
         * schleife (jede runde vergleicht sie eine Stelle mit der nächsten.
         * Wenn die nächste höher ist als die aktuelle wird sie gespeichert, sonst nicht.
         *
         * */
/*
        int bestesMonatsErgebnis = gesamtUmsatz[0];
        int bestesMonat = 0;

        for (int i = 0; i < gesamtUmsatz.length - 1; i++) {
            if (gesamtUmsatz[i] > bestesMonatsErgebnis) {
                bestesMonatsErgebnis = gesamtUmsatz[i];
                bestesMonat = i;
            }
        }
        System.out.println("Bestes Monatsergebnis: " + bestesMonatsErgebnis);
        System.out.println("Bestes Monat: " + (bestesMonat + 1));
        System.out.println();
*/


        /*1.  Summe ausrechnen */
/*        int summe = 0;
        for (int i = 0; i < gesamtUmsatz.length; i++) {
            summe = summe + gesamtUmsatz[i];
        }
        System.out.println("Summe: " + summe);*/
    }


}
