package at.dcv.w01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class SchleifenE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Was möchtest du? 0 = Print. 1 = Console");
        int choice = sc.nextInt();
        int sizeVariable = 10;
        if (choice == 0) {
            try {
                FileOutputStream fos = new FileOutputStream("C:\\users\\dcv\\desktop\\schleifeE.txt");
                PrintStream ps = new PrintStream(fos);
                System.out.println("Dokument ist erstellt");
                printTriangleRight( ps," E", sizeVariable);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } else {
            printTriangleRight(System.out,"E", sizeVariable);
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

        ps.println("Aufgabe Dreieck Variante " + txt + " :");

        for (int lineNumber = 1; lineNumber <= sizeVariable; ++lineNumber) {

            for (int widthEmpty = 1; widthEmpty <= sizeVariable - lineNumber; ++widthEmpty) {
                ps.print(txtEmpty);
            }

            for (int widthTxt = 1; widthTxt <= lineNumber; ++widthTxt) {
                ps.print(txt);
            }

            ps.println("");
        }
    }

     /*    ------------------------------------------------
    --- Dreieck mit E bauen --- O R I G I N A L --
          E
         EE
        EEE
       EEEE
      EEEEE
    ------------------------------------------------*//*
    public static void printTriangleRightConsole(String txt, int sizeVariable) {


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
    }*/ /* test test */
}
