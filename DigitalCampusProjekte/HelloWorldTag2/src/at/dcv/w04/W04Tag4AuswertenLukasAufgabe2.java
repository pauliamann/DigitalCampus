package at.dcv.w04;

import java.util.Arrays;

public class W04Tag4AuswertenLukasAufgabe2 {
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

        W04Tag4CSVAuswertenLukas.checkPreconditions(args);

        String text = W04Tag4CSVAuswertenLukas.readfile(args[0]);

        if (text == null) {
            System.out.println("Beim Lesen ist ein Fehler aufgetreten");
            System.exit(1);
        }

        String[] lines = W04Tag4CSVAuswertenLukas.splitLines(text);

        String[] maxColumns = maxColumnWidth(lines);

        for (String line : lines) {
            String[] columns = line.split(",");
            for (int i = 0; i < maxColumns.length; i++) {

                W04Tag4CSVAuswertenLukas.printColumn(columns[i], maxColumns[i].length());
            }
            System.out.println("");

        }
    }


    public static String[] maxColumnWidth(String[] lines) {
        // Wir gehen alle Spalten aller Zeilen durch, und vergleichen die Spaltenbreite mit der aktuellen Spaltenbreite. Wenn größer, wird das Wort gespeichert.
        // Zunächst initialisieren wir das Array mit Null, da wir die Größe noch nicht kennen.

        String[] maxColumnWord = null;

        // wir gehen über jede Zeile
        for (String line : lines) {
            // Spalten werden gesplittet
            String[] column = line.split(",");
            // Wenn maxColumnWord noch null ist, weisen wir ihm ein Array mit der Größe von column.length zu.
            if (maxColumnWord == null) {
                maxColumnWord = column;
            }
            for (int i = 0; i < column.length; i++) {
                // Aktueller Spaltenwert
                String currentColumn = column[i];
                // Spaltenwerte Spitzenreiter
                String maxColumn = maxColumnWord[i];
                if (currentColumn.length() > maxColumn.length()) {
                    maxColumnWord[i] = currentColumn;
                }
            }
        }
        return maxColumnWord;
    }
}
