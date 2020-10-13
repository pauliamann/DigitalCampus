package at.dcv.w04;

import java.io.*;

// Lösung von Gyula

public class MultiArrayBefuellen {
    public static void main(String[] args) {
        String[][] table = readCSV("C:\\Users\\DCV\\Desktop\\homes.csv");
        cleanData(table);

        countAvarage(table, 5); // Die Spalte deren Inhalt für die Average Berechnung verwendet werden soll.
        printDynTable(table);

    }

    public static void cleanData(String[][] table){
        for (int i = 0; i  < table.length; ++i) {
            for (int j = 0; j < table[i].length; ++j) {
                table[i][j] = table[i][j]
                        .replaceAll("^\"", "")
                        .replaceAll("\"$", "");
            }
        }
    }

    public static int[] calculateColumnWidth(String[][] table){
        int[] tableWidth = new int[table[0].length];
        for (int i = 0; i < table.length; ++i){
            for (int j = 0; j < table[i].length; ++j){
                if (table[i][j].length() > tableWidth[j]){
                    tableWidth[j] = table[i][j].length();
                }
            }
        }
        return tableWidth;
    }

    public static void printDynTable(String[][] table){
        int[] tableWidth = calculateColumnWidth(table);
        for (int i = 0; i < table.length; ++i) {
            for (int j = 0; j < table[i].length; ++j) {
                System.out.printf("%"+tableWidth[j]+"s ", table[i][j]);
            }
            System.out.println();
        }
    }

    public static void countAvarage(String[][] table, int column){
        double sum = 0.0;
        int countSums = 0;
        for (int i = 1; i < table.length; ++i){
            double value = Double.MIN_VALUE;
            try {
                value = Double.valueOf(table[i][column]);
            } catch (NumberFormatException nfe){
                // The field contains an alphanumerical value, we've to ignore it
            }
            if (value != Double.MIN_VALUE){
                sum += value;
                countSums += 1;
            }
        }


        System.out.print("The avarage of column \"" + table[0][column] + "\" is " + String.format("%.2f", sum / countSums));
        if (countSums != table.length-1){
            System.out.print(" (Attention the column contains alphanumerical values. These have been ignored.)");
        }
        System.out.println();
    }

    public static String[][] readCSV(String fileName) {
        int countLines = countLines(fileName);
        String[][] table = new String[countLines][];

        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(fileName));
            if (br != null) {

                while (br.ready()) {
                    String line = br.readLine();
                    table[idxLine] = line.split(",");
                    ++idxLine;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return table;
    }

    public static int countLines(String fileName) {
        BufferedReader br = null;
        int count = 0;
        try {
            br = new BufferedReader(new FileReader(fileName));
            if (br != null) {

                while (br.ready()) {
                    String line = br.readLine();
                    ++count;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return count;
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
