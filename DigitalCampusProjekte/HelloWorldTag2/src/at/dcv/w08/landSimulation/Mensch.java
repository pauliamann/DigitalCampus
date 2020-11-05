package at.dcv.w08.landSimulation;

import java.util.Vector;

public class Mensch {
    // name alter geschlecht

    // Ziel:
    //      - durchschnittsaltler / Wohnung / Gebäude / Stadt / Land berechnen
    //      - Max alter pro ...
    //      - Struktur

    private String name;
    private int age;
    private String gender;


    public Mensch(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
