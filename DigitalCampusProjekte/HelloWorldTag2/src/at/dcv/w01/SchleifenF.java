package at.dcv.w01;

public class SchleifenF {
    public static void main(String[] args) {
        printTriangleTopRight("T", 4);

    }

    public static void printTriangleTopRight (String txt, int sizeVariable) {
        /* ------------------------------------------------
        --- Dreieck mit F bauen

        FFFF
         FFF
          FF
           F
        ------------------------------------------------ */

        String txtSpace = " ";

        System.out.println("Dreieck mit " + txt + " : ");

        for (int lineNumber = 1; lineNumber <= sizeVariable; ++lineNumber) {

            for (int widthEmpty = sizeVariable; widthEmpty >= sizeVariable - lineNumber; --widthEmpty) {
                System.out.print(txtSpace);
            }

            for (int widthTxt = 1; widthTxt <= 1 + sizeVariable - lineNumber; ++widthTxt) {
                System.out.print(txt);
            }

            System.out.println();
        }
    }
}
