package at.dcv.w01;


import java.util.Arrays;

public class wochenendAufgabenW01V2 {

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

       int[] businessResult = {101, 21, -3, 104, -78, 202};
        System.out.println(Arrays.toString(businessResult));
        /*--- Aufgabe 1: GesamtUmsatz
         * */
/*        int summeMonate = 0;

        for (int i = 0; i <= businessResult.length - 1; ++i) {
            summeMonate += businessResult[i];
        }
        System.out.println("Summe Monate= " + summeMonate);*/

        /*--- Aufgabe 2a + 2b: was ist das beste Monatsergebnis, & welcher Monat war das?
         * */

        int maxResult = businessResult[0];
        int i = 1;

        for (; i < businessResult.length; i++) {
            if (businessResult[i] > maxResult) {
                maxResult = businessResult[i];
            }
        }

        System.out.println("Das beste Monatsergebnis ist: " + maxResult + ". Das war im Monat: " + (i));

        /*--- Aufgabe 3: Was war das schlechteste Monatsergebnis?
         * */

    }
}

