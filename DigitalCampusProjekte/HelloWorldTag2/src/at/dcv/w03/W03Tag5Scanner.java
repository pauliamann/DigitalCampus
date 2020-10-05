package at.dcv.w03;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class W03Tag5Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        try {
            String input1 = sc.nextLine();
            num1 = Integer.valueOf(input1);
        } catch (NumberFormatException nfe) {
            System.out.println("Wir haben ein Problem.");
        }
        System.out.println("Gib bitte die zweite Zahl ein: ");
        sc.nextInt();





        /*int InputMismatchException = 0-9;

           System.out.println("Was willst du addieren?");
          try {
              System.out.println("erste Zahl:");
              int choiceA = sc.nextInt();
              System.out.println("zweite Zahl:");
              int choiceB = sc.nextInt();
              System.out.println("Ergebnis: " + (choiceA + choiceB));
          } catch (InputMismatchException ime) {
              System.out.println("Das is keine Zahl");

          }*/






    }
}
