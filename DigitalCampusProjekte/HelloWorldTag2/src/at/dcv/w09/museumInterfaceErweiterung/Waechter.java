package at.dcv.w09.museumInterfaceErweiterung;

public class Waechter extends Person {
    private Raum raum;

    public Waechter(String name) {
        super(name);
    }

    public void bewegen(Raum neuerRaum) {
        if (raum != null) {
            raum.removePerson(this);
        }
            raum = neuerRaum;
            raum.addPerson(this);
            System.out.println("Wächter " + getName() + " befindet sich im Raum: " + raum);
        }
}
