package at.dcv.uebungen;

public class SchleifenPyramideAmKopf {
    public static void main(String[] args) {


        /*
        *
        *        DDDDD
        *         DDD
        *          D
        *
        * */




        /*  !! Funktioniert :-)*/
        int pHeight = 5;

        for (int lineNumber = 1; lineNumber <= pHeight ; lineNumber++) {
            for (int j = 1; j <=  lineNumber -1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (pHeight - lineNumber)  ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
