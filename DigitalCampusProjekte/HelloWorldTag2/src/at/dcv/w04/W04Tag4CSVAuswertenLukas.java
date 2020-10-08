package at.dcv.w04;

import java.io.*;

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

public class W04Tag4CSVAuswertenLukas {
    public static void main(String[] args) {
        checkPreconditions(args);

        String text = readfile(args[0]);

        if (text == null) {
            System.out.println("Text konnte nicht eingelesen werden.");
            System.exit(1);
        }

        String[] lineArray = splitLines(text);


        for (String line: lineArray) {
            String[] columns = line.split(",");
            for (String column: columns) {
                printColumn(column, 10);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printColumn (String column, int length) {
        if (column.length() < length) {
            // Auffüllen mit Leerzeichen
            int spaces = length - column.length();
            System.out.print(column);
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");

            }
        } else if (column.length() > length){
            // String muss abgeschnitten werden
            System.out.print(column.substring(0, length));

        } else {
            // Wenn gleich lang: einfach ausgeben
            System.out.print(column);

        }
        System.out.print(" ");
    }

    public static void printLines (String[] lineArray) {
        /*        // for Zählschleife mit index (als alternative Ausgabe verwenden wir die for each Schleife)
        for (int i = 0; i < lineArray.length; i++) {
            System.out.println(lineArray[i]);
        }
        System.out.println("---");*/

        // for each Schleife
        for (String line: lineArray) {
            System.out.println(line);
        }
    }

    public static void checkPreconditions(String[] args) {
        // Prüfen ob ein Argument dem Programm mitgegeben wurde;
        // Das Argument sollte unsere CSV Datei sein;
        // Im args Array stehen alle übergebenen Argumente.
        if (args.length < 1) {
            System.out.println("Bitte gib eine Datei ein");
            // Wir beenden das Programm mit einem Statuscode ungleich 0 -> Fehler.
            System.exit(1); // Status 1 bedeutet, dass ein Fehler auftritt, 0 bedeutet es ist erfolgreich.
        }

        // Prüfen ob Datei existiert
        String filename = args[0];
        // Erstellen eines File Objekts aus dem Dateinamen
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("Die Datei existiert nicht... ");
            System.exit(1);
        }
    }

    public static String readfile (String filename) {
        // Einlesen der Datei über buffered reader; (der Buffered Reader liest so lange bis er das Zeilenende erreicht.) (der Filereader liest Zeichen für Zeichen)
        // Kann Zeile für Zeile lesen.
        BufferedReader fis = null;
        try {
            // BufferedReader -> Lesen von Zeilen  mithilfe eines anderen Readers
            // Filereader -> Lesen von Zeichen aus Datei
            fis = new BufferedReader(new FileReader(filename));
            String line = null;
            String text = "";

            // line wird der Wert aus fis.readline() zugewiesen.
            // Die komplette Zuweisung (line = fis.readline()) hat den Wert der zugewiesen wurde.
            // Deswegen können wir auf null prüfen.
            while ((line = fis.readLine()) != null) {
                text += line;  //hier wird der ausgelesene Text in einen String gespeichert. Nach jeder line wird ein "\n" zugefügt.
                text += "\n";
            }
            // Wir ersetzen alle " durch nichts.
            //
            return text.replaceAll("\"", "");
        } catch (IOException exc) {
            exc.printStackTrace();
            //
            // Bei Fehlerfall wird null zurückgegeben.
            return null;
        } finally {
            // Hier sagen wir dass das Programm beendet werden soll.
            // finally wird immer ausgeführt.
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException exc) {
                    //noop (no operation)
                }
            }
        }
    }

    public static String[] splitLines(String text) {
        // Text wird in ein Array gesplittet
        String[]  lineArray = text.split("\n");

        return lineArray;

    }

}
