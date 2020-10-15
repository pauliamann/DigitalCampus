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


        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(dog1);
        animalsList.add(dog2);
        animalsList.add(dog3);
        animalsList.add(cat1);
        animalsList.add(cat2);

        System.out.println("__ . __ . __ . __");

        Animal.printInfos(animalsList);


        /* --- Ausgaben --- */


        System.out.println("__ . ___ . ___");
        System.out.println("Hund");
        dog1.bark();
        System.out.println(cat1.getInfo());
        System.out.println("__ . __ . __ . __");
        System.out.println("Katze");
        cat1.purr();
        System.out.println(dog1.getInfo());


        System.out.println("Anzahl: " + count(animalsList, Dog.class));
        ;
//        System.out.println("Number of Cats " + countCats(animals));
    }

    public static int countCats(ArrayList<Animal> animalsList) {

        int counter = 0;

        for (Animal animal: animalsList    ) {

            if (animal instanceof Cat) {
                counter++;
            }
        }
        return counter;
    }

    public static int count(ArrayList<Animal> animalsVariable, Class cls) { // Class ist weil wir uns auf die Klasse Cat oder Dog beziehen wollen

        int counter = 0;
        for (Animal animal: animalsVariable    ) {
        // Prüft genau ob es die selbe Klasse ist
            /*if(animal.getClass().equals(cls)) {
                ++counter;
            }*/

            if(cls.isInstance(animal)) {
                ++counter;
            }
        }
        return counter;

    }
}
