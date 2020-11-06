package at.dcv.w05.family;

import java.sql.SQLOutput;
import java.util.Vector;

public class Person {
    enum Gender{
        MALE,
        FEMALE,
        OTHER
    }


    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private Gender gender2;
    private String maidenName;
    private Person partner;


    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.partner = null;
        this.gender2 = Gender.MALE;
    }

/*    public Person makeChild(Person kid)
    {

    }*/

    public String toString (){ //
        return firstName+" "+lastName;
    }

    public void marriage(Person marPerson)
    { //pax2 = person x

        if ((marPerson.getGender() != getGender()) && (partner == null)) {
            // Hier überarbeiten: Person einen MaidenName der unveränderbar ist.
            // Nach Heirat ändert sich der LastName.

            // Add Partner Infos zu beiden Personen
            this.partner = marPerson;
            marPerson.partner = this;

            // Abfrage einbauen. Wenn person 1 ist F && person 2 ist M
            if ((marPerson.getGender() == "f" ) && (getGender() == "m")) {
                marPerson.setMaidenName(marPerson.getLastName());
                marPerson.setLastName(getLastName());
                System.out.println(" Frau " + marPerson.getLastName() + "'s Mädchenname ist: " + marPerson.getMaidenName());
            }
            // Abfrage: Wenn person 1 ist M && person 2 ist F

            if ((marPerson.getGender() == "m" ) && (getGender() == "f")) {
                setMaidenName(getLastName());
                setLastName(marPerson.getLastName());
                System.out.println("Frau " + getLastName() + "'s Mädchenname ist: " + getMaidenName());
            }

//            marPerson.setMarried(true);
//            setMarried(true);

        } else {
            System.out.println("Leider leider ist gleichgeschlechtliche Ehe verboten..");
        }
        System.out.println(marPerson.getLastName() + " hat " + getLastName() + " geheiratet.");
        System.out.println("Heiratsstatus ist: " + marPerson.isMarried() + " & " + isMarried());
    }

    public void divorce(Person divPerson)
    {

        if (divPerson.getGender() == "f") {
            divPerson.setLastName(divPerson.getMaidenName());
        }

//        divPerson.setMarried(false);
//        setMarried(false);

    }


    public Person getPartner() {
        return partner;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public boolean isMarried() {
        return (partner == null);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isMarAccepted() {
        return (partner != null);
    }
}
