package at.dcv.w07;

import java.util.Random;

public class Wichteln {

    public static void main(String[] args) {

        String[] names = {"Bekir", "Belal", "Daniel", "Sedat", "Ivan", "Sascha", "Henning", "Julia", "Clemens", "Markus", "Marc", "Gyula", "Paul"};

        int arrayValues = 5;
        int[] randomNumbersArray = new int[arrayValues];
        int[] intArray = {0, 1, 2, 3, 4}; // muss gleich groß sein wie int arrayValues
        int min = 0;
        int max = 4;
        int iteration = 0;
        boolean numberCompare = false;



        // Random Array befüllen:
        for (int i = 0; i < arrayValues; i++) {

            while (true) {
                int temp = getRandomZahl(arrayValues);
                if (!enthaelt(randomNumbersArray, getRandomZahl(arrayValues))) {
                    randomNumbersArray[i] = temp;
                    break;
                }
            }

        }

        for (int i = 0; i < arrayValues; i++) {
            System.out.println(randomNumbersArray[i]);
        }


        for (int j = 0; j < arrayValues; j++) {
            System.out.println("Runde: " + j);
            // wenn die Zahlen gleich sind, wird nochmal zugewiesen.
            while (randomNumbersArray[j] == intArray[j]) {
                randomNumbersArray[j] = getRandomZahl(arrayValues);
                if (randomNumbersArray[j] == intArray[j]) {
                    System.out.println("Gleich: " + randomNumbersArray[j] + " " + intArray[j]);
                }
            }
            System.out.printf("numbersArray %s , intArray %s \n", randomNumbersArray[j], intArray[j]);
        }


    }

    public static int getRandomZahl(int arrayValues) {
        Random rn = new Random();
        int zufallsZahl = rn.nextInt(arrayValues);

        return zufallsZahl;
    }


    public static boolean enthaelt(int[] randomNumbersArray, int randomNumber) {
        for (int tmp : randomNumbersArray) {
            if (randomNumber == tmp) {
                return false;
            }
        }
        return true;
    }


}


