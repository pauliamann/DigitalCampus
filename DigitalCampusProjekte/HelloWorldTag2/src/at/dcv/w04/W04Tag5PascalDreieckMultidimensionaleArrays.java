package at.dcv.w04;

import java.util.Arrays;

public class W04Tag5PascalDreieckMultidimensionaleArrays {
    public static void main(String[] args) {

        int size = 5;


        int pascal[][] = new int[size][size];

        for (int i = 0; i < pascal.length; i++) { // Zeile
            // initialisiert die erste Spalte
            pascal[i][0] = 1;
            //  hier wird die Summe der Zahlen errechnet
            for (int j = 1; j < i; ++j) { // Spalte
                pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
            }
            // Die Diagonale mit 1 Füllen
            pascal[i][i] = 1;
            System.out.println(Arrays.toString(pascal[i]));
        }

        printPascal(pascal);
    }


    public static void  printPascal (int[][] pascal) {
        //  Hier wird die Spitze des Dreiecks zentriert und passende Abstände eingefügt.
        for (int i = 0; i < pascal.length; ++i) {
            for (int j = 0; j < pascal.length-i; ++j){
                System.out.print("   ");
            }
            for (int j = 0; j <= i; ++j) {
                System.out.printf("%5d ", pascal[i][j]);
            }
            System.out.println();
        }


    }


}
