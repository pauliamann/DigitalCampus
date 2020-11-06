package at.dcv.w05.family;

import java.util.Vector;

public class main {

    public static void main(String[] args) {

        Vector<Person> personList = new Vector<Person>();

        Person pax1 = new Person("Romeo", "R", 32, "m");
        Person pax2 = new Person("Julia", "J", 30, "f");

        personList.add(pax1);
        personList.add(pax2);

        System.out.println();
        System.out.println(pax1.getLastName() + " möchte " + pax1.getLastName() + " heiraten.");
        pax1.marriage(pax1);

        System.out.println(" __ . ^ . __ __ . ^ . __ __ . ^ . __ __ . ^ . __ __ . ^ . __ ");

        System.out.println(pax1.getLastName() + " möchte " + pax2.getLastName() + " heiraten.");

        System.out.println("---");
        /* Hier wird definiert wer wen heiratet: */
        pax1.marriage(pax2);




        System.out.println(pax1.getPartner());
        System.out.println(pax2.getPartner());



         /*   System.out.println("");
            System.out.println("--- Divorce Part ---");
            System.out.println("");

            pax1.divorce(pax2);
            System.out.println(
                    pax1.getLastName() +
                            " hat sich von " +
                            pax2.getLastName() +
                            " scheiden lassen." +
                            " Heiratsstatus ist: " + pax1.isMarried() + " " + pax2.isMarried()
            );*/


    }

}
