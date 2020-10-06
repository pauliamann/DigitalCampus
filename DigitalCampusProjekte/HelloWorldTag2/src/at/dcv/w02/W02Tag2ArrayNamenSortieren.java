package at.dcv.w02;

import java.util.Arrays;

public class W02Tag2ArrayNamenSortieren {
    public static void main(String[] args) {
        String[] names = {"Edi", "Clemens", "Bbla", "David", "Ariel"};

        System.out.println(("Array Vorgabe: " + Arrays.toString(names)));

//        String str = Arrays.toString(names);
//        System.out.println("Sout: str: " + str);
        System.out.println("Sout: printAlphabeticOrder: " + printAlphabeticOrder(names));
    }



    /* ---
     * Wer steht auf der Klassenleiter auf erster Stelle?
     * Wer .. an letzter Stelle?
     * --- */
    public static String printAlphabeticOrder (String[] names) {
        String temp = "";
        String result = "";
        int iteration = 0;

        for (int j = 0; j < names.length; ++j) {
            for (int i = 0; i < names.length -1 - j; ++i) {
                if (names[i].compareTo(names[i + 1]) > 0) {
                    temp = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = temp;
                }
                ++iteration;
                System.out.println(("Iteration " + iteration + ".: " + Arrays.toString(names)));
            }
            result = Arrays.toString(names);
        }
        return result;
    }
}
