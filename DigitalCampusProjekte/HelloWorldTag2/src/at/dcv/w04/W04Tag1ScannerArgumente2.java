package at.dcv.w04;

public class W04Tag1ScannerArgumente2 {

    /* --- Exceptions mit Argumenten ---
    * es muss eine Zahl eingegeben sein
    * es darf nicht leer sein
    * es darf nur eine Zahl zwichen 1 & 10 sein --- */
    public static void main(String[] args) {

        if (args.length >= 2) {

            int size = -1;
            try {
                size = Integer.valueOf(args[0]);
                if (!((size >= 1) && (size <= 10))) {
                    System.out.println("Die erwartete Größe ist zwischen 1 & 10");
                    size = -1;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("du musst eine Zahl für die Größe eingeben");
            }
            if ((args[1].length()==0) || (args[1].length()>=2)) {
                System.out.println("Das Zeichen darf nur einstellig sein");
                args[1] = "";
            }
            if ((size > 0) && (args[1].length() > 0)) {
                printSquare(size, args[1]);
            }

        } else {
            System.out.println("Gib zwei Parameter ein.");
        }
    }



    public static void printSquare (int size, String txt) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(txt);
            }
            System.out.println();
        }
    }
}
