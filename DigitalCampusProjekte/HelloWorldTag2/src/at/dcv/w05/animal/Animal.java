package at.dcv.w05.animal;

import java.util.ArrayList;

public class Animal {

    private String name;
    private int age;
    /*private static int age;
    // wenn hier das Attribut mit Static definiert ist, dann gibt es nur 1 alter. die letzte definietion wird für alle übernommen */

    /* --- Constructor --- */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


     /* --- Methoden --- */
    public String getInfo() { // das ist eine !! nicht statische Instanz-Methode
        String info = "Name: " + getName() + ", Alter: " + getAge();
        return info;
    }

    public void printInfo() {
        System.out.println("Tier printInfo: " + getInfo());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 0) {
            throw new RuntimeException("Alter muss größer als 0 sein.");
        }
        if ( age > 20 ) {

            throw new RuntimeException("Alter muss kleiner als 20 sein.");
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printInfos (ArrayList<Animal> animals) {
        System.out.println("Liste: ");
        for (Animal animal: animals) {
            System.out.println(animal.getInfo());
        }
    }
}
