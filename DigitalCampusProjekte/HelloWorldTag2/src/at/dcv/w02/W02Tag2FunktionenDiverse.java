package at.dcv.w02;

import org.w3c.dom.ls.LSOutput;

public class W02Tag2FunktionenDiverse {
    public static void main(String[] args) {
        int ageOfMarc = 10;

/*        *//* Switch Operatoren *//*
        int zahl1 = 2;
        int zahl2 = 3;
        String operator;

        switch(operator) {
            case "+": System.out.println(zahl1 + zahl2); break;
            case "-": System.out.println(zahl1 + zahl2); break;
            case "*": System.out.println(zahl1 + zahl2); break;
            case "/": System.out.println(zahl1 + zahl2); break;
            default: System.out.println("I dont know this operator"); break;


        }*/

        int month = 1;
        String monthString = "1";
        switch (month) {
            case 1: monthString = "Jänner"; break;
            case 2: monthString = "Februar"; break;
            case 0: monthString = "gibts nicht"; break;
        }

        System.out.println(monthString);

    }





}
