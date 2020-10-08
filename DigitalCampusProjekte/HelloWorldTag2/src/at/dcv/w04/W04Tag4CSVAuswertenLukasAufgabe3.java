package at.dcv.w04;

public class W04Tag4CSVAuswertenLukasAufgabe3 {

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
        System.out.println("Gesamtsumme: " + sumRow(lines, 5));
        System.out.println("Anzahl gekaufter Dinge: " + sumRow(lines, 4));

    }

    public static int sumRow (String[] lines, int index) {
        int sum = 0;
        for (int i = 1; i < lines.length; i++) { // Hier starten wir bei Zeile 1, da in Zeile 0 noch die Überschriften drinnen stehen.
            String line = lines[i];
            String[] columns = line.split(",");
            sum += Integer.parseInt(columns[index]);
        }  return sum;


    }


}
