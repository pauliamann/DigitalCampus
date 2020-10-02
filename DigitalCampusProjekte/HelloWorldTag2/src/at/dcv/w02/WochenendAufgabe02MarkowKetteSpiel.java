package at.dcv.w02;

import java.util.Arrays;
import java.util.Random;

public class WochenendAufgabe02MarkowKetteSpiel {

    public static void main(String[] args) {

        /*
        Erstelle ein Spielfeld mit x Feldern. Spielfigur "A" befindet sich in der Mitte
        ......A.....
        Zahlenraum 1-10
        1-3 bewegung nach links
        4-6 Bewegung nach stehenbleiben
        7-10 Bewegung nach rechts

        Zufallszahl generiert eine Zahl von 1 - 10;

        Wir brauchen: Bewegung, Spielfeldweite, Zufallszahl

        */

        int spielfeldweite = 10;
        String A = "A";
        String spielfeld = ".";

        int spielfeldLinks = spielfeldweite / 2;
        int spielfeldRechts = spielfeldweite / 2;

        Random rn = new Random();

        while (spielfeldLinks != 0 || spielfeldRechts != 0) {

            // Hier wird das Spielfeld ausgegeben:
            for (int i = 1; i <= spielfeldLinks; i++) {
                System.out.print(spielfeld);

            }
            System.out.print(A);

            for (int i = 0; i < spielfeldRechts; i++) {
                System.out.print(spielfeld);
            }

            int zufallszahl = rn.nextInt(10);

            if (zufallszahl <= 3) {
                spielfeldLinks = spielfeldLinks - 1;
                spielfeldRechts = spielfeldRechts + 1;
            }

            if (zufallszahl >= 7) {
                ++spielfeldLinks;
                --spielfeldRechts;
            }
        }
    }
}


