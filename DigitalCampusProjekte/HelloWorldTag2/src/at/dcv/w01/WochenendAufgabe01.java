package at.dcv.w01;

import java.util.Arrays;

public class WochenendAufgabe01 {
    public static void main(String[] args) {
        /*
         * Aufgaben:
         * 1. Gesamtumsatz des Buchladens
         * 2a. Was war das beste Monatsergebnis?
         * 2b. Welcher Monat war das beste Monatsergebnis?
         * 3a. Was war das schwächste Monatsergebnis?
         * 3b. Welcher Monat war das beste Monatsergebnis?
         * 4. Gab es 2 Monate hintereinander wo das Ergebnis negativ war?
         * 5. Was war die längste Periode mit negativem Umsatz?
         * 6. Was war das zweitbeste Ergebnis? */

        int[] businessResult = {10, 2, 5, -4, -7, 8, -4, -3, -2, 12, 11, 3};
        System.out.println(Arrays.toString(businessResult));

        /*--- Aufgabe 1: GesamtUmsatz
         * */


        int i = 0;
        int summeMonate = 0;


        for (; i <= businessResult.length; ++i) {
            summeMonate += businessResult[i];
        }

        System.out.println(summeMonate);





        /*Aufgabe 5.
         *
         * */
        /*

        int maxLengthWithNegativeResult = 0;

        for (int i = 0; i < businessResult.length; ++i) {
            if (businessResult[i] < 0) {
                int j = i;
                int count = 0;

                while ((j < businessResult.length) && (businessResult[j] < 0)) {
                    ++count;
                    ++j;
                }

                if (count > maxLengthWithNegativeResult) {  //--- Intervall Länge prüfen -Ende
                    maxLengthWithNegativeResult = count;
                }
                System.out.println("Monat : " + (i + 1) + " " + count);
            }
        }
        System.out.println("Die längste negative Periode war: " + maxLengthWithNegativeResult + " Monate lang.");

         */
    }
}

