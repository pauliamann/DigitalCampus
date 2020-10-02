package at.dcv.w01;

import java.sql.SQLOutput;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //--- Numerische Variablen Formatierung
//
//        int intZahl = 123;
//        float floatA = 123.625F;
//
//        System.out.println("Hallo");
//        System.out.println(intZahl);
//        float floatB = 0.234;

//        System.out.printf("Beispiel zu printf:\n");
//        System.out.printf("%8d\n", doubleA, doubleB);
//        System.out.printf("->%.2f<-\n", floatA);
//        System.out.printf("->%10f<-\n", floatA * 90);
//        System.out.printf("->%10.2f<-\n", floatA * 900);
//        System.out.printf('%d');

//        System.out.println(++intZahl);
//        System.out.println(intZahl++);
//        System.out.println(intZahl);
//        System.out.println(++intZahl);


        //--- Pi berechnen
        //--- Manuell
//        double pi = (4.0 / 1.0) - (4.0 / 3.0) + (4.0 / 5.0) - (4.0 / 7.0) + (4.0 / 9.0) - (4.0 / 11.0) + (4.0 / 13) - (4.0 / 15) ;
//
//        System.out.println(pi);

        //--- Automatisch mit while Loop

//        int pi1 = 1;
//        int pi2 = 1;
//        double myPi = 0;
//
//        while (pi1 < 1000) {
//            myPi += pi2 * 4/ (double)pi1;
//            pi1 += 2;
//            pi2 *= -1;
//
//            out.println(myPi);
//        }


        //--- Aufgabe 20 = 1 * 2 *3 ...

        /*int zahl = 1;
        long ergebnis = 1;

        System.out.println("While Schleife:");
        while (zahl <= 20) {

            ergebnis = ergebnis * zahl;
            System.out.println("Zahl: " + zahl + " Ergebnis: " + ergebnis);
            ++zahl;
        }

        long forErgebnis = 1;

        System.out.println("For Schleife:");
        for (int forZahl = 1; forZahl <= 20; ++forZahl) {

            forErgebnis = forErgebnis * forZahl;
            System.out.println(forZahl + ".) forErgebnis: " + forErgebnis);
        }  */

        //--- Aufgabe A: Ist Zahl A durch Zahl B teilbar ohne  Rest?

        int zahlA = 100;
        int zahlB = 5;
//        int ergebnis = zahlA / zahlB;

//        out.println((zahlA%zahlB == 0)
//        ? "Zahl ist ohne Rest teilbar"
//        : "Zahl ist NICHT ohne Rest teilbar");


        //---  Mit welcher Zahl kann ich 100 dividieren? ohne Rest

//        int zahl1 = 100;
//        int teiler = 1;
//
//        while (teiler <= 50) {
//
//            if (zahl1%teiler == 0) {
//                System.out.println("Zahl " + zahl1 +  " ist durch " + teiler + " ohne Rest teilbar");
//            }// else {
////                System.out.println("Zahl " + zahl1 +  " ist durch " + teiler + " NICHT ohne Rest teilbar");
////            }
//
//            ++teiler;
//        }

//        int numberToTest = 100;
//        for (int testvalue = 1; testvalue <= numberToTest; ++testvalue) {
//            System.out.println(numberToTest + " % " + testvalue + " "
//                    + numberToTest % testvalue + " dividieren "
//                    + (numberToTest % testvalue == 0));
//        }
        /* ------------------------
        --- Aufgabe C: Ist Zahl X eine Primzahl? sich selbst oder 2
        ------------------------ */

        int primZahl = 12;
        int testZahl = 1;

        while (testZahl < primZahl) {
        ++testZahl;
            if (primZahl % testZahl == 0)  {
                System.out.println(primZahl + " ist durch " + testZahl  + " ohne Rest teilbar");

            } 

        }







    }
}
