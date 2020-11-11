package at.dcv.w04;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionaleArrays {
    public static void main(String[] args) {


        int[][] randomArray = new int[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                randomArray[i][j] = getRandomInt();
                System.out.print(randomArray[i][j]);
            }
            System.out.println("");
        }


        int diagonaleLR = 0;
        for (int j = 0; j < 3; j++) {
            diagonaleLR += randomArray[j][j];
        }
        System.out.println("Diagonale links nach rechts : " + diagonaleLR);

        int diagonaleRL = 0;

        for (int j = 0; j < 3; j++) {
            diagonaleRL += randomArray[j][2-j];
        }
        System.out.println("DiagonaleRL: " + diagonaleRL);

        System.out.println(diagonaleLR);


    }

    public static int getRandomInt() {
        Random rand = new Random();
        int random = 0;
        random = rand.nextInt(5);

        return random;
    }

}
