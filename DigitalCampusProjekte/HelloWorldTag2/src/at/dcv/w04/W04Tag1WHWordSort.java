package at.dcv.w04;

import java.util.Arrays;

public class W04Tag1WHWordSort {

    /* ---  Wörter der länge nach sortieren --- */

    public static void main(String[] args) {
        String[] names = {"Clemens", "Bbla","Edi", "David", "Ariell", };

        System.out.println(("Array Vorgabe: " + Arrays.toString(names)));

        System.out.println("ShortestWordLength: " + getShortestWordLength(names));
        System.out.println("ShortestWord: " + getShortestWord(names));
        System.out.println("LongestWordLength: " + getlongestWordLength(names));
        System.out.println("LongestWord: " + getLongestWord(names));


    }

    public static int getShortestWordLength (String[] names) {
        int shortestWordLength = names[0].length();

        for (int i = 0; i < names.length; i++) {

            if (names[i].length() < shortestWordLength) {
                shortestWordLength = names[i].length();
            }
//            System.out.println("Short Wordlength: " + shortestWordLength);
        }
        return shortestWordLength;
    }

    public static String getShortestWord (String[] names) {
        String shortestWord = names[0];
        int shortestWordLength = names[0].length();

        for (int i = 0; i < names.length-1; i++) {
            if (names[i+1].length() < names[i].length()) {
                shortestWord = names[i+1];
            }
//            System.out.println(shortestWordLength);
//            System.out.println("Shortest Word: " +  shortestWord);
        }
        return shortestWord;

    }

    public static int getlongestWordLength (String[] names) {

        int longestWordLength = names[0].length();

        for (int i = 0; i < names.length-1; i++) {
            if (names[i+1].length() > names[i].length()) {
                longestWordLength = names[i+1].length();
            }
        }
        return longestWordLength;
    }

    public static String getLongestWord (String[] names) {
        String longestWord = names[0];

        for (int i = 0; i < names.length-1; i++) {
            if (names[i+1].length() > names[i].length()) {
                longestWord = names[i+1];
            }
        }
        return longestWord;
    }
}
