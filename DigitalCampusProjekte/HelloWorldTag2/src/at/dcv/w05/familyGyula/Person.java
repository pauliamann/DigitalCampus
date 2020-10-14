package at.dcv.w05.familyGyula;

import java.util.Vector;

public class Person {
    public final static String FEMALE = "female";
    public final static String MALE = "male";

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String maidenName;

    private Person partner;
    private Vector<Person> children;

    public Person(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        if (gender.equals(FEMALE)){
            this.maidenName = lastName;
        } else {
            this.maidenName = "";
        }
        this.children = new Vector<Person>();
    }

    public boolean marry(Person otherPerson){
        boolean success = false;
        if (!this.equals(otherPerson)){
            if (this.partner != null){
                System.out.println(this.firstName + ", you are, already married.");
            } else if (otherPerson.partner != null){
                System.out.println(this.firstName + ", you cannot marry an already married person.");
            } else {
                if (this.gender.equals(otherPerson.gender)) {
                    System.out.println(this.firstName + " and " + otherPerson.firstName + ", you cannot marry, as you're both " + this.gender);
                } else {
                    // Marriage is possible...
                    System.out.println(this.firstName + " and " + otherPerson.firstName + " marry.");
                    this.partner = otherPerson;
                    otherPerson.partner = this;

                    if (this.gender.equals(FEMALE)){
                        this.lastName = otherPerson.lastName;
                    }
                    if (otherPerson.gender.equals(FEMALE)){
                        otherPerson.lastName = this.lastName;
                    }
                    success = true;
                }
            }
        } else {
            System.out.println(firstName + ", you may not marry yourself.");
        }

        return success;
    }


    public boolean divorce(){
        boolean success = false;
        if (this.partner != null){
            System.out.println(this.firstName + " and " + partner.firstName + " have divorced.");
            Person exPartner = this.partner;
            this.partner = null;
            exPartner.partner = null;
            if (this.gender.equals(FEMALE)){
                this.lastName = this.maidenName;
            }
            if (exPartner.gender.equals(FEMALE)){
                exPartner.lastName = exPartner.maidenName;
            }

            success = true;
        } else {
            System.out.println(this.firstName + " you're not married.");
        }
        return success;
    }


    public Person makeChild(String firstName, String lastName, String gender){
        Person p = null;
        if (partner != null) {
            System.out.println(this.firstName + " and " + partner.firstName + ", you've got a baby.");
            p = new Person(firstName, lastName, 0, gender);
            this.children.add(p);
            partner.children.add(p);
        } else {
            System.out.println(this.firstName + ", you cannot get children without a partner.");
        }
        return p;
    }

    public void printBiography(){
        System.out.print(this.firstName + " " + this.lastName);
        if (partner != null) {
            System.out.print(" is married to " + partner.firstName + " " + partner.lastName);
        }
        System.out.println();
        System.out.print("Children: ");
        boolean firstChild = true;
        for (Person p : children){
            if (firstChild) {
                firstChild = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(p.firstName);
        }
        System.out.println();
    }

    public String getLastName() {
        return lastName;
    }
}
