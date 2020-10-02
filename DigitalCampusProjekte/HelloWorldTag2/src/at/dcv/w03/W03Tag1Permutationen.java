package at.dcv.w03;

public class W03Tag1Permutationen {

    public static void main(String[] args) {
/*
        ABCD 4! = 4 3 2 1
        A Verbindung B C D
        B Verbindung A C D
        C Verbindung A B D
        D Verbindung A B C

       */

        perm("", "ab");

    }

    public static void perm(String prefix, String rest) {

//      Schleife wählt Buchstaben aus und wertet den Rest aus.
        for (int i = 0; i < rest.length(); i++) {

            String newCharacter = String.valueOf(rest.charAt(i));           // charAt zeigt das Zeichen an der definierten Position. valueOf zeigt
            String newPrefix = prefix + String.valueOf(rest.charAt(i));     //hier füge ich einen Buchstaben auf Position i dem Prefix zu.
            String newRest = rest.replaceFirst(newCharacter, ""); // hier tausche ich diesen Buchstaben auf Position i mit einem leeren Feld.

//            System.out.println("perm(\" " + prefix + "\" , \"" + rest + "\")");
//            System.out.println("newCharakter: " + newCharacter);
//            System.out.println("newPrefix: " + newPrefix + " newRest: " + newRest);

            if (newRest.isEmpty()) {                                        // wenn rest leer ist, dann haben wir einen kompletten String mit 4 Stellen erzeugt. Ansonsten läuft der Code weiter
                System.out.println("Perm: " + newPrefix);
            } else {
                perm(newPrefix, newRest);                                   // hier ruft der Code sich selbst auf (perm ist oben im public static void definiert) . Bloss die Variablen sind andere.
            }
        }


    }

}

