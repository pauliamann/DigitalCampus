package at.dcv.w03.gyula;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class FileLottoHelper {

    public static void scheinAusgabe(PrintStream ps, int[] zahlen) { //
        int spalten = 9;
        deckel(ps, spalten);

        for (int i = 1; i <= 45; ++i) {
            if (enthaelt(zahlen, i)) {
                ps.print("|  X ");
            } else {
                ps.printf("| %2d ", i);
            }
            if (i % spalten == 0) {
                ps.println("|");
            }
        }
        deckel(ps, spalten);
    }

    /* hier werden die Random Zahlen erstellt, die die Zahlen der Ziehung darstellen. */
    public static int[] randomZahlen() {
        Random random = new Random();

        int[] zahlen = new int[6];

        for (int i = 0; i < zahlen.length; i++) {
            while (true) { // es wird so lange eine Zahl gesucht bis eine gefunden ist.
                int temp = random.nextInt((45) + 1);// 45 bedeutet den Zahlenraum 0 - 44. Da wir 0 nicht wollen addieren wir 1 dazu. um den Zahlenraum 1-45 zu erhalten.
                if (!enthaelt(zahlen, temp)) {
                    zahlen[i] = temp;
                    break;
                }
            }
        }
        return zahlen;
    }

    /* Hier wird ein Array mit 6 Stellen erzeugt. */
    public static int[] tipAbfrage(Scanner sc) {
        int[] zahlen = new int[6];
        for (int i = 0; i < zahlen.length; ++i) {
            System.out.println("Tippe eine Zahl zwischen 1 und 45 ein (Nr." + (i + 1) + ")");
            zahlen[i] = gueltigeZahlSchleife(sc, zahlen);
        }
        return zahlen;
    }

    /* hier wird geprüft ob die Zahlen gültig sind (zwische 6 & 45 , + nicht doppelt vorhanden sind) */
    public static int gueltigeZahlSchleife(Scanner sc, int[] zahlen) {

        while (true) {
            int zahl1 = sc.nextInt();
            if (zahl1 < 1 || zahl1 > 45 || enthaelt(zahlen, zahl1)) {
                System.out.println(ANSI_RED + "Oida, gib eine gültige Zahl ein" + ANSI_RESET);
            } else {
                return zahl1;
            }
        }
    }

    /* Hier werden die Zahlen meines Tipps mit den zufälligen Zahlen der Ziehung verglichen. */
    public static int gewinnAbfrage(int[] ziehung, int[] meinTipp) {
        int count = 0;

        for (int zahl : ziehung) {
            if (enthaelt(meinTipp, zahl)) {
                count++;
            }
        }
        return count;
    }

    /* hier wird gepüft ob die eingegebene Zahl bereits eingegeben wurde. */
    public static boolean enthaelt(int[] zahlen, int zahl1) {

        for (int tmp : zahlen) {  //Das ist eine foreach Schleife. hier läuft die Schleife über das hier definierte Array drüber und prüft jede einzelne Stelle.
            if (zahl1 == tmp) {
                return true;
            }
        }
        return false; // das muss man schreiben, weil es sein kann, dass diese Funktion niemals aufgerufen wird nach der Zahleneingabe.
    }

    /* hier wird der Deckel oberhalb und unterhalb des Lotto Rasters gemacht. */
    public static void deckel(PrintStream ps, int spalten) {
        for (int i = 0; i < spalten * 5 + 1; i++) {
            ps.print("-");
        }
        ps.println();
    }

    /* Diverse Farbcodes */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";



}
