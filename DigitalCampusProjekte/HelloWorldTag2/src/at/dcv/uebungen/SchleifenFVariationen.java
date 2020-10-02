package at.dcv.uebungen;

public class SchleifenFVariationen {

    public static void main(String[] args) {

        /*
        * fff          f
        *  ff         ff
        *   f        fff
        *
        * */



        String txt = "Q";
        String emptySpace = " ";
        int maxWidth = 5;



        for (int line = 1; line <= maxWidth; ++line) {
            for (int widthEmpty = 1; widthEmpty <= maxWidth - line; ++widthEmpty) {
                System.out.print(emptySpace);
            }

            for (int widthTxt = maxWidth; widthTxt >= (maxWidth - line +1) ; --widthTxt) {
                System.out.print(txt);
            }
            System.out.println();
        }

/*        for (int fill = 2; fill <= maxWidth; ++fill ) {
            System.out.print(txt);
        }
        System.out.println();

        for (int fill = 1; fill <= maxWidth; ++fill ) {
            System.out.print(txt);
        }
        System.out.println();*/










/*        int maxWidth = 4;
        String emptySpace = " ";
        int lineCount = 1;

        for ( ;maxWidth >= 1; --maxWidth ) {
            ++lineCount;
            for (int empty = 1; empty <= (4 - maxWidth); ++empty) {
                System.out.print(emptySpace);
            }
            for (int i = 1; i <= maxWidth; ++i) {
                System.out.print("f");
            }
            System.out.println();
        }*/










            System.out.println();



    }

}
