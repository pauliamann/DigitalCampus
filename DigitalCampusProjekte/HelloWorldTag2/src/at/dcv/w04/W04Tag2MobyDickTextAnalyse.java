package at.dcv.w04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class W04Tag2MobyDickTextAnalyse {
    /* --- Ein Parameter als Argument einlesen. Es beschreibt einen Filenamen
     Erste Zeile / Letzte Zeile ausdrücken
     Kürzeste / Längste Zeile ausdrücken
     Häufigster / Seltenster Buchstabe
     --- */

    public static void main(String[] args) {
        String filePath = "C:\\Users\\DCV\\Desktop\\mobydick.txt";
        int lineCount = 0;
        lineCount = getLineCount(filePath, lineCount);

        String[] newTextArray = printTextArray(filePath, lineCount);
        System.out.println("First Line: " + newTextArray[newTextArray.length - newTextArray.length]);
        System.out.println("Last Line: " + newTextArray[newTextArray.length - 1]);
        System.out.println("Kürzeste Zeile: " + shortestString(newTextArray));
        System.out.println("Längste Zeile: " + longestString(newTextArray));
        //4.1 Häufigster Buchstaben
        int[] hist = getHistogram(newTextArray);
        printHistogram(hist);

    }

    public static int getLineCount(String filePath, int lineCount) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        if (fis != null) {          //wenn File nicht existiert, soll Code nicht weiter ausgeführt werden
            Scanner sc = new Scanner(fis);

            while (sc.hasNext()) {
                ++lineCount;
                String textCount = sc.nextLine();
            }

            try {
                fis.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (NumberFormatException nfe) {
                System.out.println("irgendein Fehler tritt auf.");
            }
        }
        return lineCount;
    }


    public static String[] printTextArray(String filePath, int lineCount) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        String[] textArray = new String[lineCount];
        if (fis != null) {          //wenn File nicht existiert, soll Code nicht weiter ausgeführt werden
            Scanner sca = new Scanner(fis);

            int counter = 0;
            while (sca.hasNext()) {
                textArray[counter] = sca.nextLine();
                counter++;
                //System.out.println("Counter: " + counter);
            }

            try {
                fis.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (NumberFormatException nfe) {
                System.out.println("irgendein Fehler tritt auf.");
            }
//            System.out.println("textArray.length: " + textArray.length);

        } else {
            System.out.println("error");
        }
//        System.out.println("textArray: " + textArray[0]);
        return textArray;
    }

    /* --- Kürzeste Zeile ausdrücken --- */
    public static String shortestString(String[] newTextArray) {

        String shortestLine = newTextArray[0];
        for (int i = 0; i < newTextArray.length - 1; i++) {
            if (shortestLine.length() > newTextArray[i + 1].length()) {
                shortestLine = newTextArray[i + 1];
            }
        }
        return shortestLine;
    }

    /* --- Längste Zeile ausdrücken --- */
    public static String longestString(String[] newTextArray) {

        String longestline = newTextArray[0];
        for (int i = 0; i < newTextArray.length - 1; i++) {
            if (longestline.length() < newTextArray[i + 1].length()) {
                longestline = newTextArray[i + 1];
            }
        }
        return longestline;
    }

    /* --- Häufigster Buchstabe */
    public static int[] getHistogram(String[] newTextArray) {

        int[] hist = new int[256]; // Hier wird ein Array erstellt mit der Größe die es benötigt um die Buchstaben zu speichern
        //Initialize with 0
        for (int i = 0; i < hist.length; ++i) {
            hist[i] = 0;
        }

        for (int i = 0; i < newTextArray.length; i++) {
            String zeile = newTextArray[i];

            for (int j = 0; j < zeile.length(); j++) {
                char c = zeile.charAt(j);
                int index = c;
                if (c < hist.length) {
                    hist[c] += 1;
                }
            }
        }
        return hist;
    }


    public static void printHistogram(int[] hist) {
        int mostCommonChar = 0;

        // Print Histogramm
        // https://www.torsten-horn.de/techdocs/ascii.htm
        // 65 bis 122 sind die Buchstaben von A - z
        for (int i = 65; i <= 122; ++i) {
            if (hist[i] > hist[mostCommonChar]) {
                mostCommonChar = i;
            }
        }
        System.out.println("4.1 Häufigster Buchstabe: " + (char)mostCommonChar + " --> " + hist[mostCommonChar]);
    }





}

