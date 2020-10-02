package at.dcv.uebungen;

public class SchleifenDiamant {

    public static void main(String[] args) {

        /*
         *                A
         *               AAA
         *              AAAAA
         *
         * */

        String txt = "A";
        String empty = " ";
        int height = 5;


        for (int lineNumber = 1; lineNumber <= (height) ; lineNumber++) {
            for (int widthEmpty = 1; widthEmpty <= height - lineNumber; ++widthEmpty) {
                System.out.print(empty);
            }

            for (int widthTxt = 1; widthTxt <= 1 + 2 * (lineNumber - 1) ; widthTxt++) {
                System.out.print(txt);
            }

            System.out.println();

        }


    }
}
