package at.dcv.w03;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.Stream;

public class W03Tag1StringUebungen {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "helo";
        String strStartsWith = "He";
        String strContains = "ll";


/*        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareTo(str1));

        *//*concatination*//*

        System.out.println("Concatination: " + str1.concat(str2));

        *//*contains *//*
        System.out.println("contains : " + str1.contains("ll"));
        System.out.println("contains : " + str2.contains("ll"));



        *//* starts End with */

//        System.out.println(str1 + " Starts with: " + strStartsWith + " : " + str1.startsWith(strStartsWith));
//        System.out.println(str2 + " Starts with: " + strStartsWith + " : " + str2.startsWith(strStartsWith)); // Test ob Case-Sensitive

        /* Ends with*/

//        System.out.println("Ends With: " + str1.endsWith("llo"));
//        System.out.println("Ends With: " + str2.endsWith("llo"));
        // static Class
//        String test = String.format("%5d",100);
//        System.out.println(test);
//        // Variable aufrufen, wenn nicht static.
//        boolean isOK = test.endsWith("0");
//        System.out.println(isOK);


        /*
         * Format
         * */


//        String f1 = String.format("|%d|", 101);
//        String f2 = String.format("|%10d|", 101);
//        String f3 = String.format("|%-10d|", 101);
//        String f4 = String.format("|% d |", 101);
//        String f5 = String.format("|%10d-10d|", 101);
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//        System.out.println(f4);
//        System.out.println(f5);


        /* Length *//*

        System.out.println("length of String: " + str1.length());

        *//* Repeat *//*

        String repeatString = "|101|";
        System.out.println(repeatString.repeat(3));*/


        /* Split */

//        String strSplit = "paul.amann@gmx.at";
//        String[] strArray = strSplit.split("@");
//
//        System.out.println(Arrays.toString(strArray));

        /* --- Strip --- */

//        String strStrip = " Paul Amann ";
//        String stripped = strStrip.strip();
//        System.out.println(strStrip.strip());
//        System.out.println(stripped.replaceAll(" ", "-"));

        // CompareToIgnoreCase



         String[] stringArray = {"Banana", "Ali", "Ulli" , "Aha", "zebru"} ;

        for (int i = 0; i < stringArray.length-1; i++) {
            String firstWord = stringArray[i];
            int compare = stringArray[i].compareToIgnoreCase(stringArray[i+1]);
            System.out.println(i + ". Runde");
            if (compare < 0) {
                firstWord = stringArray[i];
            }

            System.out.println(firstWord);
        }



    }

//    String text =

}
