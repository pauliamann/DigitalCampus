package at.dcv.w01;

public class tag04newproject {
    public static void main(String[] args) { printArrowToRight("I", 3);
    }

    public static void printArrowToRight (String txt, int spaltenBreite) {
        for (int zeilenNummer = 1; zeilenNummer <= spaltenBreite; ++zeilenNummer ) {
            for (int breite = 1; breite <=  zeilenNummer; ++breite) {
                System.out.print(txt);
            }
            System.out.println();
        }

        for (int zeilenNummer = 1; zeilenNummer <= spaltenBreite; ++zeilenNummer ) {
            for (int breite = 1; breite <= spaltenBreite - zeilenNummer; ++breite) {
                System.out.print(txt);
            }
            System.out.println();
        }
    }
}
