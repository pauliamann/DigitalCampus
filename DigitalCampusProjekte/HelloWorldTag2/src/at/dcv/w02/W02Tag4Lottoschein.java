package at.dcv.w02;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class W02Tag4Lottoschein {
    /* --- Lottoschein
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(LottoHelper.ANSI_GREEN + "------------------------------------------");
        System.out.println("---" + LottoHelper.ANSI_CYAN + " Servas, gib deine Glückszahlen ein " + LottoHelper.ANSI_GREEN + "---");
        System.out.println("------------------------------------------" + LottoHelper.ANSI_RESET);

        System.out.println("Was möchtest du? 0 ist normales Lotto. 1 ist Computer Lotto");

        int choice = sc.nextInt();
        if (choice == 0) {
            normalesLotto(sc);
        } else {
            System.out.println("wieviele Runden denn??");
            int runden = sc.nextInt();
            computerLotto(runden);
        }
    }

    public static void computerLotto(int runden) {
        System.out.println("Der Computer spielt nun..");
//        double runden = 1_000_000.0;
        int[] ziehung = LottoHelper.randomZahlen();

        int[] richtigeSumme = new int[7];

        for (int i = 0; i < runden; i++) {
            if (i % 100000 == 0 ){
                System.out.println("Runde: " + i);
            }
            int[] computerZahlen = LottoHelper.randomZahlen();

            int richtige = LottoHelper.gewinnAbfrage(ziehung, computerZahlen);
            richtigeSumme[richtige]++;
        }

        System.out.println("Ergebnis Übersicht für " + runden + " Tipps: ");
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + ": " + richtigeSumme[i] + " Das sind: " + (richtigeSumme[i] * 100.0 / runden)+ "%");
        }
    }

/*
    public static void computerLotto (Scanner sc) {
        int anzahlSpiele = 1000000;
        int looserCount = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int winnerCount = 0;
        for (int i = 0; i < anzahlSpiele; i++) {
            int[] gezogeneZahlenComputerLotto = LottoHelper.randomZahlen();
            int[] gezogeneZahlenComputerLotto2 = LottoHelper.randomZahlen();
            int count = LottoHelper.gewinnAbfrage(gezogeneZahlenComputerLotto, gezogeneZahlenComputerLotto2);

            if (count == 0) {
//                System.out.println("Verloren: " + count);
                looserCount++;
            } else  {
//                System.out.println("Andres Zahl: " + count);
                winnerCount++;
                if (count ==1) {
                    ++count1;
                }

                if (count ==2) {
                    ++count2;
                }

                if (count ==3) {
                    ++count3;
                }

                if (count ==4) {
                    ++count4;
                }

                if (count ==5) {
                    ++count5;
                }

                if (count ==6) {
                    ++count6;
                }

            }

        }

        double prozent1 = count1 * 100 / anzahlSpiele;
        double prozent2 = count2 * 100 / anzahlSpiele;
        double prozent3 = count3 * 100 / anzahlSpiele;
        double prozent4 = count4 * 100 / anzahlSpiele;
        double prozent5 = count5 * 100 / anzahlSpiele;
        double prozent6 = count6 * 100 / anzahlSpiele;
        double prozentLost = looserCount * 100 / anzahlSpiele;
        double  prozentWin = winnerCount * 100 / anzahlSpiele;


        System.out.println("Du hast " + winnerCount + "x gewonnen, = " + prozentWin + "% der Spiele. Das teilt sich wie folgt auf:"  );
        System.out.println("1.: " + count1 + " = " + prozent1 + "% der Spiele.");
        System.out.println("2.: " + count2 + " = " + prozent2 + "% der Spiele.");
        System.out.println("3.: " + count3 + " = " + prozent3 + "% der Spiele.");
        System.out.println("4.: " + count4 + " = " + prozent4 + "% der Spiele.");
        System.out.println("5.: " + count5 + " = " + prozent5 + "% der Spiele.");
        System.out.println("6.: " + count6 + " = " + prozent6 + "% der Spiele.");
        System.out.println("und " + looserCount +"x verloren"  + " = " + prozentLost + "% der Spiele.");



    }*/

    public static void normalesLotto(Scanner sc) {
        System.out.println("Willkommen beim normalen Lotto.");
        int[] zahlen = LottoHelper.tipAbfrage(sc);

        System.out.println("Mein Schein: ");
        LottoHelper.scheinAusgabe(zahlen);

        int[] gezogeneZahlen = LottoHelper.randomZahlen();
        System.out.println("Ziehung:");
        LottoHelper.scheinAusgabe(gezogeneZahlen);

        int count = LottoHelper.gewinnAbfrage(gezogeneZahlen, zahlen);
        if (count == 0) {
            System.out.println("Du hast dein Geld verschwendet.");
        } else {
            System.out.println("Glückwunsch, du hast " + count + " richtige. ");
        }
    }
}
