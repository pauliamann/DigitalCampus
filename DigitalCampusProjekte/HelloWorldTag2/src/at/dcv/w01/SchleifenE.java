package at.dcv.w01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SchleifenE {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\users\\dcv\\desktop\\schleifeE.txt");
            PrintStream ps = new PrintStream(fos);
            printTriangleRight(ps , " E", 5);
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }

    }

    /* ------------------------------------------------
    --- Dreieck mit E bauen
          E
         EE
        EEE
       EEEE
      EEEEE
    ------------------------------------------------ */
    public static void printTriangleRight(PrintStream ps, String txt, int sizeVariable) {


        String txtEmpty = txt.replaceAll(".", " ");

        System.out.println("Aufgabe Dreieck Variante " + txt + " :");

        for (int lineNumber = 1; lineNumber <= sizeVariable; ++lineNumber) {

            for (int widthEmpty = 1; widthEmpty <= sizeVariable - lineNumber; ++widthEmpty) {
                System.out.print(txtEmpty);
            }

            for (int widthTxt = 1; widthTxt <= lineNumber; ++widthTxt) {
                System.out.print(txt);
            }

            System.out.println("");
        }
    }
}
