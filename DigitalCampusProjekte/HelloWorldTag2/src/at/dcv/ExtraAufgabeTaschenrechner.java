package at.dcv;

import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ExtraAufgabeTaschenrechner {
    public static void main(String[] args) {

        /*   Ein Rechenprogramm das zwei Zufällige Zahlen auswirft,
        und den User Auffordert das Ergebnis einzugeben
        und bei falschem Ergebnis erneute Eingaben verlangt.
        *
        * */

        int min = 1;
        int max = 10;

        int rnA = ThreadLocalRandom.current().nextInt(min, max +1);
        int rnB = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println(rnA + rnB);

    }
}
