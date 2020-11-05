package at.dcv.w08.museum_improved;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

public class ReadInput {
    public static void main(String[] args) {
        try {
            Vector<String[]> data = readCSV(",", "C:\\Users\\DCV\\Downloads\\museum.csv");
            for (String[] line : data) {
                System.out.println(Arrays.toString(line));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        try {
            Vector<String[]> data = readCSVShort(",", "C:\\Users\\DCV\\Downloads\\museum.csv");
            for (String[] line : data) {
                System.out.println(Arrays.toString(line));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public static Vector<String[]> readCSV(String delimiter, String filename) throws IOException {
        BufferedReader br = null;
        Vector<String[]> lines = new Vector<>();
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] data = line.split(delimiter);
                lines.add(data);
            }
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return lines;
    }

    public static Vector<String[]> readCSVShort(String delimiter, String filename) throws IOException {
        Vector<String[]> lines = new Vector<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.split(delimiter));
            }
        }
        return lines;
    }
}
