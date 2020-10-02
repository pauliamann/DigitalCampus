package at.dcv.w02;

public class W2Tag1 {
    public static void main(String[] args) {

/*---
*  String text = "Hello World!" ;
        text.length();
        text.compareTo("Apfel");
        System.out.println();
* */


        /*
         * 1. Wer hat den kürzesten Namen?
         * 1a. Wer hat den längsten Namen?
         * 2. ?? Wer steht auf der Klassenleiter auf erster Stelle?
         * 2a. .. an letzter Stelle?
         * 3. Gibt es im Kurs einen Alexander? Wieviele Alexander gibt es in der Gruppe?
         * 4. Gibt es einen Namen der mindestens 2x auf der Liste steht?
         *
         * */

        String[] names ={"Bertram", "Emelin" , "Dodo", " Antonkhkjhhkj" };

        int nameLength = 0 ;
        int longestName = 0 ;
        int longestNamePosition = 0;
        int shortestNamePosition = 0;
        int shortestName = names[0].length();
        int indexFirstName = 0 ;
        int indexLastName = 0;

        for (int i = 0; i < names.length; ++i) {
            nameLength = names[i].length();
            if (longestName < nameLength ) {
                longestName = nameLength;
                longestNamePosition = i;
            }
        }

        for (int i = 0; i < names.length; ++i) {
            nameLength = names[i].length();
            if (nameLength < shortestName) {
                shortestName = nameLength;
                shortestNamePosition = i;
            }
        }
        System.out.println("longestName: " + longestName + " Das ist: " + names[longestNamePosition]);
        System.out.println("shortestName: " + shortestName + " Das ist: " + names[shortestNamePosition]);
        System.out.println("---");

        for (int i  = 0; i < names.length; ++i) {
            if (names[indexFirstName].compareTo(names[i]) > 0) {
                indexFirstName = i;
            }
        }

        for (int i  = 0; i < names.length; ++i) {
            if (names[indexLastName].compareTo(names[i])< 0) {
                indexLastName = i;
            }
        }

        System.out.println("Der Name " + names[indexFirstName] + " ist der Erste im Alphabet "); // compare sagt: wenn etwas identisch ist dann ist das Ergebnis 0 !! wenn größer = dann ist es nachgereicht, wenn kleiner 0 dann ist es vorgereiht
        System.out.println("Der Name " + names[indexLastName] + " ist der letzte im Alphabet ");


        /*--- Welcher Name steht doppelt drinnen?
        * */



    }
}
