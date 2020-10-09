package at.dcv.w04;

import java.util.Arrays;

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
        System.out.println("sumif vom Bekir: " + sumIf(lines, 5, "Bekir", 1));
        System.out.println("Dynamic Names: " + Arrays.toString(dynamicNames(lines, 1)));
        System.out.println("Dynamic Dates: " + Arrays.toString(dynamicNames(lines, 0)));
        System.out.print("DurchschnittProKunde: ");
        durchschnittProKunde(sumRow(lines, 5), dynamicNames(lines, 1));

        String[] maxMoneySpent = dynamicIndexValue(lines, 1, 5);
        System.out.println("MaxMoney spent von: " + maxMoneySpent[1] + " Ausgegeben:  " + maxMoneySpent[0]);

        String[] maxUnits = dynamicIndexValue(lines, 1, 4);
        System.out.println("MaxUnits gekauft von: " + maxUnits[1] + " Anzahl Units: " + maxUnits[0]);

        String[] maxUnitsPerDay = dynamicIndexValue(lines, 0, 4);
        System.out.println("MaxUnitsPerDay am: " + maxUnitsPerDay[1] + " Anzahl Units: " + maxUnitsPerDay[0]);

    }

    public static String[] dynamicIndexValue(String[] lines, int columnIndex, int conditionIndex) {
        int maxValueDates = 0;
        String maxDate = "";
        String[] dates = dynamicNames(lines, columnIndex);
        for (String date : dates) {
            int currentValue = sumIf(lines, conditionIndex, date, columnIndex); // columnIndex sagt welche Spalte bearbeitet wird. Index, sagt mit welcher Spalte er gekoppelt wird.
            if (currentValue > maxValueDates) {
                maxValueDates = currentValue;
                maxDate = date;
            }
        }
        String[] ausgabe = {String.valueOf(maxValueDates), maxDate};
        return ausgabe;
    }

    public static void durchschnittProKunde(int sumRow, String[] dynamicNames) {
        int numberNames = dynamicNames.length;

        System.out.println(sumRow / numberNames);
    }

    public static String[] dynamicNames(String[] lines, int index) {
        // S
        String names = "";
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] columns = line.split(",");
            if (!names.contains(columns[index])) {
                names += columns[index];
                names += "\n";
            }
        }
        return names.split("\n");
    }

    public static int sumIf(String[] lines, int index, String condition, int conditionIndex) {
        int sum = 0;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String[] columns = line.split(",");
            if (condition.equals(columns[conditionIndex])) {
                sum += Integer.parseInt(columns[index]);
            }
        }
        return sum;

    }

    public static int sumRow(String[] lines, int index) {
        int sum = 0;
        for (int i = 1; i < lines.length; i++) { // Hier starten wir bei Zeile 1, da in Zeile 0 noch die Überschriften drinnen stehen.
            String line = lines[i];
            String[] columns = line.split(",");
            sum += Integer.parseInt(columns[index]);
        }
        return sum;
    }
}
