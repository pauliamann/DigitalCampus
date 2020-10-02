package at.dcv.w03;

public class W03Tag2BeispielRekursivFaktorial {

    /* --- Faktorielle Ausrechnen ( jede Zahl von 1 bis n multiplizieren) http://www.mathe24.net/fakultaet.html?action=do
     Faktorielle von 3:     1 * 2 * 3 = 6
     Faktorielle von 4:     1 * 2 * 3 * 4 = 24
     --- */

    public static void main(String[] args) {
        System.out.println(faktoriale(4));
    }

    public static long faktoriale  (int zahl) {

        if (zahl == 1) {
            return zahl;
        } else {
            return zahl * faktoriale(zahl-1);
        }
    }
}
