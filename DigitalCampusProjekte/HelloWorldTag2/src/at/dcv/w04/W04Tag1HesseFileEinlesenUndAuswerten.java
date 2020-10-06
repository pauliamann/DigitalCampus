package at.dcv.w04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class W04Tag1HesseFileEinlesenUndAuswerten {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\DCV\\Desktop\\HermannHesse.txt");
        } catch (
                FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        String text = "";
        if (fis != null) {          //wenn File nicht existiert, soll Code nicht weiter ausgeführt werden
            Scanner sc = new Scanner(fis);

            while (sc.hasNext()) {

                text += sc.nextLine();
                text += " " ;
                //System.out.println(" File content : " + input1);
            }
            try {
                fis.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (NumberFormatException nfe) {
                System.out.println("irgendein Fehler tritt auf.");
            }
        }
        System.out.println("1.: Anzahl der Zeichen: " + textLength(text));
        System.out.println("2.: Anzahl Charaktere: " + at.dcv.w03.W03Tag2SehrlangerString.textLengthStrip(text));
        System.out.print("3.: Anzahl Worte: " + at.dcv.w03.W03Tag2SehrlangerString.wordCount(text));
        //System.out.println(" 3a.: Clemens Anzahl Wort: " + at.dcv.w03.W03Tag2SehrlangerString.wordCountClemens(text));
        System.out.print("4.: Längstes Wort: " + at.dcv.w03.W03Tag2SehrlangerString.longestString(text));
        System.out.println(" 4a .: Kürzestes Wort: " + at.dcv.w03.W03Tag2SehrlangerString.shortestString(text));
        System.out.println("5.: erstes Wort alphabetisch: " + at.dcv.w03.W03Tag2SehrlangerString.firstWord(text));
        System.out.println("6.: Anzahl Hesse: " + at.dcv.w03.W03Tag2SehrlangerString.wordCountHesse(text));
        System.out.println("7.: LowerCaseCount: " + at.dcv.w03.W03Tag2SehrlangerString.lowerCaseCount(text));
        System.out.println("8.: UpperCaseCount: " + at.dcv.w03.W03Tag2SehrlangerString.upperCaseCount(text));
        at.dcv.w03.W03Tag2SehrlangerString.printWordSort(text);
    }

    //         1.: Anzahl der Charactere
    public static int textLength (String text) {
        int input1Int = Integer.valueOf(text.length());
        return input1Int;
    }
}
