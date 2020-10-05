package at.dcv.w04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class W04Tag1ScannerArgumente {
    /* ------------------------------------------------
     --- Dreieck mit G bauen
        G
       GGG
      GGGGG
     GGGGGGG
     ------------------------------------------------ */
    public static void main(String[] args) {
//        System.out.println("Argument beim main(): " + args[0]);

        printTriangleArgument("A", checkInput(args));

        printTriangleScanner("G", 4);

    }


    public static void printTriangleScanner(String txt, int sizeVariable) {
        String txtEmpty = " ";
        System.out.println("Aufgabe Dreieck Variante " + txt + " :");    // Ausgabe der Aufgabenstellung.

        for (int lineNumber = 1; lineNumber <= sizeVariable; ++lineNumber) { // Zeilenbeginn bei 1, Definition der Höhe des Dreiecks.

            for (int widthEmpty = 1; widthEmpty <= sizeVariable - lineNumber; ++widthEmpty) {  // Leerzeichen Aushgabe links sowie dessen reduktion.
                System.out.print(txtEmpty);
            }

            for (int widthTxt = 1; widthTxt <= 1 + 2 * (lineNumber - 1); ++widthTxt) {  //
                System.out.print(txt);
            }

            System.out.println("");
        }
    }

    /* --- Prüfen ob das Argument größer 1 --- */
    public static int checkInput(String[] args) {
        /* ---  Argumente überprüfen ob Zahl*/
        int internalArgument = 0;

        if (args.length > 0) {
            try {
                internalArgument = Integer.valueOf(args[0]);
            } catch (NumberFormatException nfe) {
                System.out.println("Im Argument muss eine Zahl eingegeben werden.");
            }
        } else {
            System.out.println(" muss was drin stehen");
        }

        return internalArgument;
    }

    /* --- Funktion für die Ausgabe  --- */
    public static void printTriangleArgument(String txt, int internalArgument) {
        String txtEmpty = " ";

        System.out.println("Aufgabe Dreieck Variante " + txt + " :");    // Ausgabe der Aufgabenstellung.

        System.out.println("Use of internal Argument:");

        for (int lineNumber = 1; lineNumber <= internalArgument; ++lineNumber) { // Zeilenbeginn bei 1, Definition der Höhe des Dreiecks.
            for (int widthEmpty = 1; widthEmpty <= internalArgument - lineNumber; ++widthEmpty) {  // Leerzeichen Aushgabe links sowie dessen reduktion.
                System.out.print(txtEmpty);
            }
            for (int widthTxt = 1; widthTxt <= 1 + 2 * (lineNumber - 1); ++widthTxt) {
                System.out.print(txt);
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
}
