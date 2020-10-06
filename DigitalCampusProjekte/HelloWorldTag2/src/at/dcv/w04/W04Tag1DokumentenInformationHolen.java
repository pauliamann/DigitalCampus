package at.dcv.w04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/*--- Wie lese ich eine Einzige Zahl des Text Dokuments ( es wird die erste Zahl im Dokument gelesen) --- */
public class W04Tag1DokumentenInformationHolen {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try { // Hier wird der Pfad zum Dokument indiziert. Und es gibt eine Exception für File not found
            fis = new FileInputStream("C:\\Users\\DCV\\Desktop\\input.txt"); // wenn ein File gefunden wird, dann ändert sich die Variable des Fileinputstreams.
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


        if (fis != null) {
            Scanner sc = new Scanner(fis); // new Scanner(System.in);

            int num1 = Integer.MIN_VALUE;

            try {
                String input1 = sc.nextLine();
                int value = Integer.valueOf(input1);
                if ((value >= 1) && (value <= 20)) {
                    num1 = value;
                } else {
                    System.out.println("Die Zahl muss aus dem Intervall 1 bis 20.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Sie müssen ein Zahl eingeben");
            }
            try {
                fis.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            System.out.println("num1: " + num1);

        }
    }
}
