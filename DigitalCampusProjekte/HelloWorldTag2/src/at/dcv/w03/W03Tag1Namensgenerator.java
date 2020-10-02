package at.dcv.w03;

import java.util.Random;

public class W03Tag1Namensgenerator {

//    Firmennamen Generator

    public static void main(String[] args) {

        String[] tat = {"Bauchstich" , "Kopfschuss" , "Watsche mit Fuß"};
        String[] type = {"Pub" , "Kaffee" , "Hotel"};

        Random rn = new Random();

        for (int i = 0; i < 10; i++) {
            int intRandomColor = rn.nextInt(tat.length);
            int intRandomType = rn.nextInt(type.length);

            System.out.println("Zufallsname " + i +" ist: "+ type[intRandomType]  + " " + tat[intRandomColor] );
        }
    }
}
