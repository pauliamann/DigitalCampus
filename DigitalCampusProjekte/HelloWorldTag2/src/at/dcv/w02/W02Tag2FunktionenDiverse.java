package at.dcv.w02;

import org.w3c.dom.ls.LSOutput;

public class W02Tag2FunktionenDiverse {
    public static void main(String[] args) {
        int ageOfMarc = 10;

        /* Switch Operatoren */

        int month = 0;
        String monthString = "1";
        switch (month) {
            case 1: monthString = "Jänner"; break;
            case 2: monthString = "Februar"; break;
            case 0: monthString = "gibts nicht"; break;
        }

        System.out.println(monthString);

    }





}
