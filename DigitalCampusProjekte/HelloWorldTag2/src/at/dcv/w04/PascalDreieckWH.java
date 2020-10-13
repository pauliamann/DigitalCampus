package at.dcv.w04;

import java.util.Arrays;

public class PascalDreieckWH {
    public static void main(String[] args) {

        int size = 6;

        int[][] pascal = new int[size][size]; // Hier ist ein multidimensionales Array mit der weite und höhe "Size" erstellt worden.

        for (int i = 0; i < pascal.length; i++) { // Hier wird die Zeile angesprochen
            pascal[i][0] = 1; // In Zeile i wird in Spalte Null ein 1er gesetzt.

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
            pascal[i][i] = 1; // Hier wird in der Diagonalen ein 1er gesetzt.

            System.out.println(Arrays.toString(pascal[i]));
        }

        printPascal(pascal);
    }
    public static void printPascal (int[][] pascal){

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal.length-i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("%5d " ,pascal[i][j]);
            }
            System.out.println();
        }

    }
}
