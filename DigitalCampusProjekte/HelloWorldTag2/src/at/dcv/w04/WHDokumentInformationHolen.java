package at.dcv.w04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class WHDokumentInformationHolen {

    public static void main(String[] args) {

        String input = "";
        String placeholder = "";
        int width = 15;


        FileInputStream fis = null;

        try { // Hier wird dem FileInputStream der Dateipfad zugewiesen.
            fis = new FileInputStream("C:\\Users\\DCV\\Desktop\\TableData.csv");
        } catch (FileNotFoundException fnfe){ // wenn unter dem Dateipfad nichts gefunden wird, gibt es folgenden Hinweis.
            fnfe.printStackTrace();
        }

        if (fis != null) {
            Scanner sc = new Scanner(fis);  // Scanner aktiviert.

            while (sc.hasNext()) {      // solange es eine nächste Zeile gibt, wird folgender Code ausgeführt.
                placeholder = sc.nextLine(); // Der placeholder wird mit dem Inhalt des line-scans befüllt.
                input += placeholder;       // Der placeholder Inhalt wird dem input String zugefügt.
                input += "\n";              // nach dem Zeileninhalt wird ein Zeilenumbruch zugefügt (um es später hier zu trennen).
            }
        }

        try {
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

//        System.out.println(input);
        String[] textSplit = input.split("\n");
//        System.out.println(Arrays.toString(textSplit));

        printFixeSpaltenWeite(textSplit,width);
    }

    public static void printFixeSpaltenWeite (String[] textSplit, int width) {

        for (int i = 0; i < textSplit.length; i++) { // Hier wird die Zeile bearbeitet
            String[] zeile = textSplit[i].split(",");
            for (int j = 0; j < zeile.length; j++) {
                int length = 0;
                if (zeile[j].length() < width) {
                    length = width - zeile[j].length();
                    for (int k = 0; k < length; k++) {
                        System.out.print(" ");
                    }
                    System.out.print(zeile[j]);
                    System.out.print(" ");

                } else if (zeile[j].length() > width) {
                    for (int k = 0; k < width; k++) {
                        System.out.print(zeile[j].charAt(k));
                    }
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }

}
