package at.dcv.w02;

public class W2Tag1doppelterName {
    public static void main(String[] args) {

        /* VIEL ZU KOMPLIZIERT !!! KEINE NACHVOLLZIEHBARE LÖSUNG VERMITTELT WORDEN
         * 4. Gibt es einen Namen der mindestens 2x auf der Liste steht?
         *
         * --- name x wird mit den anderen Namen geprüft. Wenn nochmal vorkommt, dann wird dieser Name mit Doppelt markiert
         * Danach wird der nächste name geprüft. Wenn dieser name nochmal vorkommt, dann wird
         *
         * */

        String[] names = {"Anton", "Bertl", "Dodo", "Emelin", "Bertl", "Bertl"};

        int saveCompareIndex = 0;
        boolean sameName = false;
        int countername = 0;


        for (int i = 0; i < names.length; ++i) {
            for (int j = 0; j < names.length; ++j) {
                if ( (i < j) && (names[j].compareTo(names[i]) == 0)  ) {
                    saveCompareIndex = i;
                    sameName = true;
                    ++countername;
                }
            }
        }

        if (sameName) {
            System.out.println("gibt es ein Ergebnis mehmals ja: " + countername + " " + names[saveCompareIndex]);
        } else {
            System.out.println("Nein, es gibt den Namen nur 1x");
        }

    }
}
