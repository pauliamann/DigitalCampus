package at.dcv.w01;

import java.sql.SQLOutput;
import java.util.Arrays;

public class tag05 {
    public static void main(String[] args) {


        int[] zahlen = {7, 8, 6, 5, -4, 3, 100, 15, -68};

        System.out.println("Aufgabe 6: Array to String(zahlen) ");
        String str = Arrays.toString(zahlen);
        System.out.println(str);

        System.out.println(arrayToString(zahlen));

    }

    public static String arrayToString (int[] zahlen) {
        String result = "";

        for (int i = 0; i < zahlen.length; i++) {
            if (i == 0) {
                result = result.concat("[");
            }
            result = result.concat(Integer.toString(zahlen[i]));
            if (i < zahlen.length-1) {
                result = result.concat(", ");
            }
        }
        result = result.concat("]");
        return result;
    }
}
