package at.dcv.w04;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

// Lösung von Markus

public class SchachUebung {
    public static void main(String[] args) {
        //Schach-Matt
        //1. Das Pferd startet aus der Ecke A1
        //2. Das Pferd läuft zufällig
        //3. Das Pferd darf das Spielfeld nicht verlassen
        //4. Nach jedem Schritt das Spielfeld "graphisch" darstellen
        //5. Programm endet, wenn das Pferd das Feld H8 erreicht hat
        //----------------------------------------------------------

        Random random = new Random();
        int zeile = 0;                          //Startposition Zeile
        int spalte = 0;                         //Startposition Spalte
        int figur = 4;                          //Darstellung der Figur (nur integer erlaubt)
        int size = 8;                           //Spielfeldgröße
        int counter = 0;                        //Zähler für Spielzüge
        int[][] area = new int[size][size];


        while (area[7][7] != figur)             //Endbedingung
        {
            playfield(zeile, spalte, figur, area, size);        //druckt das Spielfeld, samt Spielfigur in der Konsole aus

            int[] positionNacher = movementLogik(zeile, spalte, random);    //Aufruf Randomfunktion für nächsten Zug
            zeile = positionNacher[0];
            spalte = positionNacher[1];

            System.out.println();

            counter++;                          //Zähler für Spielzüge
        }
        System.out.println();
        System.out.println("Der Springer brauchte " + counter + " Züge um zum Feld H8 zu gelangen.");
    }


    public static int[] movementLogik(int indexI, int indexJ, Random random) {
        int[] move = new int[2];        //Array, weil wir 2 Rückgabewerte haben (Zeile, Spalte)
        int tmpIndexI = indexI;
        int tmpIndexJ = indexJ;
        do {
            if (indexI < 0 || indexI > 7 || indexJ < 0 || indexJ > 7)       //wenn die Figur durch den Randomgenerator, außerhalb des Spielfeds landen würde
            {                                                              //wird die Position wieder auf den Wert davor gesetzt und das Ganze wiederholt
                indexI = tmpIndexI;
                indexJ = tmpIndexJ;
            }
            int tmp = random.nextInt(8) + 1;

            if (tmp == 1) {
                indexI += 1;
                indexJ += 2;
            } else if (tmp == 2) {
                indexI += 1;
                indexJ -= 2;
            } else if (tmp == 3) {
                indexI -= 1;
                indexJ += 2;
            } else if (tmp == 4) {
                indexI -= 1;
                indexJ -= 2;
            }
            //oben unten
            else if (tmp == 5) {
                indexI += 2;
                indexJ += 1;
            } else if (tmp == 6) {
                indexI += 2;
                indexJ -= 1;
            } else if (tmp == 7) {
                indexI -= 2;
                indexJ += 1;
            } else if (tmp == 8) {
                indexI -= 2;
                indexJ -= 1;
            }
            move[0] = indexI;
            move[1] = indexJ;
        } while (indexI < 0 || indexI > 7 || indexJ < 0 || indexJ > 7);  //Schleife wird wiederholt falls Figur außerhalb des Spielfelds landet

        return move;
    }

    public static void playfield(int zeile, int spalte, int figur, int[][] area, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == zeile && j == spalte)     //alle Felder im Array werden mit 0 befüllt, außer dem an der sich der Springer befindet
                    spielfigurPosition(figur, zeile, spalte, area);
                else
                    area[i][j] = 0;
            }
            System.out.println(Arrays.toString(area[i]));
        }
    }

    public static void spielfigurPosition(int figur, int zeile, int spalte, int[][] area) {
        area[zeile][spalte] = figur;
    }
}
