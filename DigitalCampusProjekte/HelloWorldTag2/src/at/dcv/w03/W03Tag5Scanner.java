package at.dcv.w03;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class W03Tag5Scanner {

    public static void main(String[] args) {

        System.out.println( "Argumente beim main(): ");
        for (int i = 0; i < args.length; ++i) {
            System.out.println("args[" + i + "]: " + args[i]);
        }



        // ---------------------
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib die erste Zahl ein: ");
        int num1 = Integer.MIN_VALUE;

        while (num1 == Integer.MIN_VALUE) {
            try {
                String input1 = sc.nextLine();
                int value = Integer.valueOf(input1);
                if ((value >=1) && (value <=20)) { // Prüfung ob die Zahl im Zahlenraum ist.
                    num1 = value;
                } else {
                    System.out.println("Gib eine Zahl zwischen 1 & 20 ein:");
                }
            } catch (NumberFormatException nfe) { // Prüfung ob die Eingabe eine Zahl ist.
                System.out.println("Sie müssen eine Zahl eingeben:");
            }
        }
        System.out.println("Gib bitte die zweite Zahl ein: ");
        sc.nextInt();

    }
}
