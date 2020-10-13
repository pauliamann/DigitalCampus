package at.dcv.w04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class W04Tag3CSVAuswertung {

    /* --- Aufgabenstellung
    1. Tabellarische Darstellung (jede Spalte ist 15 Charaktere breit)
            Längere Texte werden abgeschnitten.
            Zwischen den Spalten müssen "" kommen.
    2. Tabellarische Darstellung (Dynamische Spaltenbreite)
    3. Analyse
            a. Wie viel Wert wurde verkauft? (Komplettumsatz)
            b. Wie viel Stücke wurden verkauft?
            c. Wer hat am meisten Geld ausgegeben?
            d. Wer hat am meisten Stücke gekauft?
            e. An welchem Tag wurde am meisten Stücke verkauft?
            f. Durchschnitt Einkauf pro Kunde?
    * */
    public static void main(String[] args) {
        String input = "";
        String input1;
        FileInputStream fis = null;

        int width = 15;

        try {  // Prüfung ob Datei gefunden wird
            fis = new FileInputStream("C:\\Users\\DCV\\Desktop\\TableData.csv");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        if (fis != null) { // Wenn Datei gefunden, dann diesen Code ausführen.
            Scanner sc = new Scanner(fis);

            while (sc.hasNext()) {
                input1 = sc.nextLine(); // Schreibt die erste Zeile in eine temporäres Feld.
                input += input1;        // Übergibt den Wert vom temporären an das fixe Feld.
                input += "\n";          // Schliesst die Zeile im fixen Feld mit einem Zeilenumbruch ab . An dieser Stelle sind alle Zeilen mit allen Inhalten an die Variable String input übergeben.
            }
            try {
                fis.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            System.out.println(input); // Hier wird die oben erstelle String input Variable unformatiert angezeigt.
            String[] textSplit = input.split("\n"); // Hier ein String Array erstellt, mit dem unformatierten String input (der beim Zeilenumbruch gesplittet wurde).


            ausgabeFixeSpaltengroesse(textSplit, width);
//            umsatz(textSplit);
//            artikelAnzahl(textSplit);
//            unitPriceSumme(textSplit);
            mostMoneySpent(textSplit);
        }
    }

    public static void ausgabeFixeSpaltengroesse(String[] textSplit, int width) {

        for (int i = 0; i < textSplit.length; i++) {        // Hier läuft die Schleife bis die Zeilenanzahl erreicht ist (14) (Da der Text beim Zeilenumbruch jeweils in ein neues ArrayFeld geordnet wird.
            String[] zeile = textSplit[i].split(","); // Hier wird die im "String[] textSplit" enthaltene Zeichenkombination an der Stelle "," unterteilt und in ein neues Array gespeichert.
            for (int j = 0; j < zeile.length; j++) {        // Hier läuft die Schleife bis die Länge der Zeile erreicht ist.
                int length = 0;                             // Neue Variable wird erstellt (length).
                if (zeile[j].length() < width) {                    // Wenn die Zeichenfolge kürzer als die Definierte Weite (15) ist, dann..
                    length = width - zeile[j].length();             // Die Variable length wird definiert.  Die hat den Wert Weite minus der Zeichenanzahl.
                    for (int k = 0; k < zeile[j].length(); k++) {   // Iteriert solange k kleiner ist als die länge des Strings an der Stelle j .
                        System.out.print(zeile[j].charAt(k));       // Printet die Zeichenfolge.
                    }
                    for (int k = 0; k < length; k++) {              // Hier wird das Spaltenfeld mit den notwendigen Leerzeichen aufgefüllt um auf die Weite (15) zu kommen.
                        System.out.print(" ");
                    }
                    System.out.print(" ");                          // Nachdem die Zeichenfolge vollständig geprintet ist, kommt ein Fragezeichen
                } else if (zeile[j].length() > width) {             // Wenn die Zeichenfolge länger als die definierte Weite ist, dann wird das Wort abgesschnitten.
                    for (int k = 0; k < width; k++) {
                        System.out.print(zeile[j].charAt(k));
                    }
                    System.out.print("");                          // Abstand zwischen den Spalten.
                }
            }
            System.out.println();
        }
    }

    public static void umsatz(String[] textSplit) {
        int umsatzGesamt = 0;
        for (int i = 0; i < textSplit.length; i++) {
            String[] zeile = textSplit[i].split(",");
            if (i > 0) {
                umsatzGesamt += Integer.valueOf(zeile[5]);
            }
        }
        System.out.println(umsatzGesamt + " --> Gesamtumsatz");
    }

    public static void artikelAnzahl(String[] textSplit) {
        int artikelAnzahl = 0;
        for (int i = 0; i < textSplit.length; i++) {
            String[] zeile = textSplit[i].split(",");
            if (i > 0) {
                artikelAnzahl += Integer.valueOf(zeile[4]);
            }
        }
        System.out.println(artikelAnzahl + " --> verkaufte Artikel");

    }

    /* --- Wer hat am meisten Geld ausgegeben? --- */
    public static void mostMoneySpent (String[] textSplit) {

//        Create Name Array & Create moneySpent Array
        String[] names = new String[12];
        String tempName = "";
        int[] moneySpent = new int[12];
        int tempMoneySpent = 0;
        String [] zeile = new String[12];

        for (int i = 1; i < textSplit.length-1; i++) {
            zeile = textSplit[i].split(",");

            names[i-1] = String.valueOf(zeile[1]);
            moneySpent[i-1] = Integer.valueOf(zeile[5]);


        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(moneySpent));

//     Compare Array Name

        for (int i = 1; i < textSplit.length-2; i++) {
            if (String.valueOf(zeile[1]).equals(names[i])) {
                System.out.println(names[i]);
                tempMoneySpent += Integer.valueOf(zeile[5]);
            }

            System.out.println(tempMoneySpent + " TempMoney Spent");
        }

    }

    public static void unitPriceSumme(String[] textSplit) {
    int unitPriceGesamt = 0;

        for (int i = 0; i < textSplit.length; i++) {
            String[] zeile = textSplit[i].split(",");
            if (i > 0) {
                unitPriceGesamt = unitPriceGesamt + Integer.valueOf(zeile[3]);
            }
        }
        System.out.println(unitPriceGesamt + " --> Unit Preis Gesamt");
    }
}
