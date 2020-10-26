package at.dcv.w07;

public class Wuerfel3D {

    public static void main(String[] args) {
        int size = 5;
        int diagonal = size - 2;


        for (int i = 0; i < diagonal; i++) {
            // Parallelogramm oben
            for (int j = 0; j < diagonal - i; j++) {
                System.out.print(" ");
            }
            // erste zeile
            if (i == (0)) {
                for (int j = 0; j < size; j++) {
                    System.out.print("0 ");
                }
            }
            // letzte Zeile
            else if (i == diagonal - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("0 ");
                }
                for (int x = 0; x < i - 2; x++) {
                    System.out.print(" ");
                }
                System.out.print("0");
            }
            // alle Zeilen zwischen erster und letzter Zeile
            else {
                System.out.print("0 ");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("0");
//                Hier wird der obere Teil des vertikalen Parallelogramms erstellt.
                if (i != 1 || i != 0) {
                    for (int j = 0; j < i - 1; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("0");
            }

            System.out.println();

        }
        // Hier wird die Front erstellt
        for (int j = 1; j < size; j++) {
            if (j != size - 1) {
                System.out.print(" 0 ");
                for (int i = 0; i < size - 2; i++) {
                    System.out.print("  ");
                }
                System.out.print("0");
// todo: auf Variable umstellen. nur notwendig wenn der winkel variabel sein soll
                if (j == 1 || j == 2) {

                    for (int y = 0; y < diagonal - 2; y++) {
                        System.out.print(" ");
                    }
                    System.out.print("0");
                } else {
                    for (int i = 0; i < diagonal-j; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("0");
                }


            } else if (j == size - 1) {
                System.out.print(" ");
                for (int i = 0; i < size; i++) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }
}
