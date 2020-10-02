package at.dcv.w01;

public class SchleifeG {
    public static void main(String[] args) {

        printTriangle("G", 4);
/*        printTriangle("A" , 5);
        printTriangle("C", 8);*/



    }

        /* ------------------------------------------------
    --- Dreieck mit G bauen
       G
      GGG
     GGGGG
    GGGGGGG
    ------------------------------------------------ */
    public static void printTriangle (String txt, int sizeVariable) {
 /*       String txtEmpty  = " ";
        System.out.println("Aufgabe Dreieck Variante " + txt + " :");    // Ausgabe der Aufgabenstellung.

        for (int lineNumber = 1; lineNumber <= sizeVariable; ++lineNumber ) { // Zeilenbeginn bei 1, Definition der Höhe des Dreiecks.

            for (int widthEmpty = 1; widthEmpty <= sizeVariable - lineNumber; ++widthEmpty) {  // Leerzeichen Aushgabe links sowie dessen reduktion.
                System.out.print(txtEmpty);
            }

            for (int widthTxt = 1; widthTxt <= 1 + 2 * (lineNumber - 1); ++widthTxt) {  //
                System.out.print(txt);
            }

            System.out.println("");
        }*/


/*        *//* Variante 2 *//*
        int pHeight = 5;

        for (int lineNumber = 1; lineNumber <= pHeight ; lineNumber++) {
            for (int j = 1; j <= pHeight -lineNumber  ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * lineNumber - 1 ; j++) {
                System.out.print("*");

            }
            System.out.println();


        }  */
    }
}

