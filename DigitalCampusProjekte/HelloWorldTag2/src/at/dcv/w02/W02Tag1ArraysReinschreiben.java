package at.dcv.w02;

import java.util.Arrays;
import java.util.Random;

public class W02Tag1ArraysReinschreiben {
    public static void main(String[] args) {

        /*---   Man kann Arrays auch befüllen. (Array initialisieren)
        ---
        * */

        /* ein Array mit zufälligen Zahlen Befüllen und die Zahlen nach Größe sortieren. (Bubble Sort nennt man das)
         *
         * Aufgabe: Vergleiche die Zahlen von randomArray[i] und randomArray[i+1]
         *           --  Wenn randomArray[i+1] ist größer als randomArray[i] dann sollen die Inhalte getauscht werden.
         *
         * 1. Tausche die Inhalte von 2 Array-Feldern
         *
         * */

        int[] rNumber = {5, 4, 3, 2, 1};

        // Ende der Initialisierung

        int iterationCount = 0; // only used to display numbered iteration steps

        System.out.println("Vorgabe:                      " + Arrays.toString(rNumber));

            for (int j = 0; j < (rNumber.length); ++j) {
                for (int i = 0; i < (rNumber.length - 1 - j); ++i) {
                    if (rNumber[i] > rNumber[i + 1]) {
                        int tmp = rNumber[i];
                        rNumber[i] = rNumber[i+1];
                        rNumber[i +1] = tmp;
                    }
                    ++iterationCount;
                    // next sout is only used to display the single iteration steps
                    System.out.println("Iteration " + iterationCount + ". " + " i: " + i + " & " + " j: " + j + "   " + Arrays.toString(rNumber));
                }
            }

        System.out.println("Ergebnis:                      " + Arrays.toString(rNumber));

    }
}
