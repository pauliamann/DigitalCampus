package at.dcv.w04;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WHMultiArrayDokumentHolen {

    public static void main(String[] args) {
        // Fileinput überprüfen
        // Zeilen zählen
        // Spalten Zählen
        // String [][] indizieren und füllen
        // Ausgeben

        String input = "";
        String placeholder = "";
        int lineCount = 0;


        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\DCV\\Desktop\\TableData.csv");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        if (fis != null) {
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()) {
                placeholder = sc.nextLine();
                input += placeholder;
                input += "\n";
                ++lineCount;
            }
        }

        try {
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        String[] textSplit = input.split("\n");
        int columnCount = getColumnCount(textSplit, lineCount);
        System.out.println( "String[]: " + Arrays.toString(textSplit));

        int[][] contentArray = new int[lineCount][columnCount];
        int count = 1;
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                ++count;
                contentArray[i][j] = count;
            }
        }



    }



    public static int getColumnCount(String[] textSplit, int lineCount) {
        int columnCountSpeicher = 0;
        for (int i = 0; i < textSplit.length; i++) {
            String[] zeile = textSplit[i].split(",");
            for (int j = 0; j < zeile.length; j++) {
                ++columnCountSpeicher;
            }
        }
        int columnCount = columnCountSpeicher / lineCount;

        return columnCount;
    }




}

