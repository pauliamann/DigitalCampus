package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Objects;
import java.util.Vector;

public class Raum {
    private String namen;
    private Vector<KunstObjekt> kunstObjekte = new Vector<>();
    private Vector<Person> personenInRaum = new Vector<>();

    public Raum(String namen) {
        this.namen = namen;
    }

    public String getNamen() {
        return namen;
    }

    public Vector<KunstObjekt> getKunstObjekte() {
        return kunstObjekte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raum raum = (Raum) o;
        return Objects.equals(namen, raum.namen);
    }

    @Override
    public String toString() {
        return "Raum: " + namen;
    }

    public KunstObjekt searchAndCreate(String neuerTitel, String kuenstler, String typ) {
        for (KunstObjekt k : kunstObjekte) {
            if (k.getTitel().equals(neuerTitel)) {
                return k;
            }
        }
        KunstObjekt k;
        if (typ.equals("Gemälde")) {
            k = new Gemaelde(neuerTitel, kuenstler, 0);
            kunstObjekte.add(k);
        } else if (typ.equals("Skulptur")) {
            k = new Skulptur(neuerTitel, kuenstler, 0);
            kunstObjekte.add(k);
        } else {
            System.out.println("Kein gültiger Typ.");
            k = null;
        }
            return k;
    }

    public void addPerson (Person person){
        personenInRaum.add(person);
    }
    public void removePerson (Person person){
        personenInRaum.remove(person);
    }
    public boolean istDiebAlleine (Dieb dieb){
        if(personenInRaum.size() == 1 && personenInRaum.contains(dieb)){
            return true;
        } return false;
    }

    public void addKunstObjekt(KunstObjekt obj){
        kunstObjekte.add(obj);
    }

    public void removeKunstObjekt(KunstObjekt obj){
        kunstObjekte.remove(obj);
    }

}
