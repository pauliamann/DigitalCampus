package at.dcv.w02;

import java.util.Random;

public class W02WochenendAufgabeMarkowKetteSpiel {
    public static void main(String[] args) {


        int spielfeldLinks = 5;
        int spielfeldRechts = 5;
        int spielFeldWeite = 10;

        do {
            int zufallsZahl = getRandomZahl();

            if (zufallsZahl <= 2 ) {
                --spielfeldLinks;
                ++spielfeldRechts;
            }
            if (zufallsZahl >= 7 ) {
                ++spielfeldLinks;
                --spielfeldRechts;
            }


            for (int i = 0; i < (spielFeldWeite - spielfeldRechts); i++) {
                System.out.print(".");
            }
            System.out.print("A");
            for (int i = 0; i < (spielFeldWeite - spielfeldLinks); i++) {
                System.out.print(".");
            }

            System.out.println();
        } while (spielfeldRechts != 0 && spielfeldLinks != 0 );

    }

    /* --- Random Zahl generieren --- */

    public static int getRandomZahl () {
        Random rn = new Random();
        int zufallsZahl = rn.nextInt(10);

        return zufallsZahl;
    }

}
