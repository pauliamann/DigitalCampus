package at.dcv.w05.animal;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        System.out.println("Hallo zum Tierprogramm");

    /* --- Instanzen erstellen --- */
        Dog dog1 =  /*Hier wird eine Instanz von der Vorlage (Dog.java) erstellt*/
                new Dog("lilly", 10); // Hier wird der Constructor für Dog aufgerufen.
        Dog dog2 = new Dog("Bello", 5);
        Dog dog3 = new Dog("Apollo", 11);

        // ---

        Cat cat1 = new Cat("Pussycat", 19); // Hier wird eine Instanz von der Vorlage/Klasse (Dog.java) erstellt.
        Cat cat2 = new Cat("Mitty", 12);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(cat1);
        animals.add(cat2);

        System.out.println("__ . __ . __ . __");

        Animal.printInfos(animals);


        /* --- Ausgaben --- */


        System.out.println("__ . ___ . ___");
        System.out.println("Hund");
        dog1.bark();
        System.out.println(cat1.getInfo());
        System.out.println("__ . __ . __ . __");
        System.out.println("Katze");
        cat1.purr();
        System.out.println(dog1.getInfo());

    }
}
