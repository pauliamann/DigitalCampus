package at.dcv.w05.familyGyula;

import java.text.ParseException;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector<Person> family = new Vector<Person>();

        Person firstPerson = new Person("Sascha", "S", 25, Person.MALE);
        family.add(firstPerson);
        Person secondPerson = new Person("Sedat", "S", 29, Person.MALE);
        family.add(secondPerson);
        Person thirdPerson = new Person("Olga", "Roxana", 19, Person.FEMALE);
        family.add(thirdPerson);

        firstPerson.marry(firstPerson);
        firstPerson.marry(secondPerson);
        secondPerson.marry(thirdPerson);
        thirdPerson.marry(firstPerson);
        thirdPerson.divorce();
        thirdPerson.marry(firstPerson);
        Person p1 = firstPerson.makeChild("Viktor", firstPerson.getLastName(), Person.MALE);
        if (p1 != null){
            family.add(p1);
        }
        Person p2 = firstPerson.makeChild("Viktoria", firstPerson.getLastName(), Person.FEMALE);
        if (p2 != null){
            family.add(p2);
        }

        secondPerson.printBiography();
        thirdPerson.printBiography();
    }

}
