package at.dcv.w05.abteilungGyula;

import java.util.Vector;

public class Abteilung {

    private String name;
    private Vector<Abteilung> unterAbteilung;
    private Person leiter;
    private Vector<Person> mitarbeiter;

    public Abteilung(String name){
        this.name = name;
        unterAbteilung = new Vector<Abteilung>();
        leiter = null;
        mitarbeiter = new Vector<Person>();
    }

    public void zufuegenUnterAbteilung(Abteilung unterAbt){
        if (!unterAbteilung.contains(unterAbt)) {
            unterAbteilung.add(unterAbt);
        }
    }

    public void printAbteilungsStruktur(String prefix){
        System.out.print(prefix + name);
        if (leiter != null) {
            System.out.print(" (" + leiter.getName() + ")");
        } else {
            System.out.print(" (nicht genannt)");
        }
        System.out.println();
        System.out.print(prefix + "Mitarbeiter:");
        boolean firstElement = true;
        for (Person p : mitarbeiter){
            if (firstElement){
                firstElement = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(p.getName());
        }
        System.out.println(" (Mitarbeiteranzahl: " + mitarbeiter.size() + ")");
        for (Abteilung unterAbt : unterAbteilung){
            System.out.println();
            unterAbt.printAbteilungsStruktur(prefix + "    ");
        }
    }

    public void leiterErnennen(Person neuerLeiter){
        System.out.println(neuerLeiter.getName() + " ist ab heute Leiter von " + name);
        zufuegenMitarbeiter(neuerLeiter);
        leiter = neuerLeiter;
    }

    public void zufuegenMitarbeiter(Person neuerMitarbeiter){
        if (!mitarbeiter.contains(neuerMitarbeiter)) {
            if (neuerMitarbeiter.getAktuelleAbteilung() != null) {
                neuerMitarbeiter.getAktuelleAbteilung().mitarbeiter.remove(neuerMitarbeiter);
                neuerMitarbeiter.setAktuelleAbteilung(null);
            }
            mitarbeiter.add(neuerMitarbeiter);
            neuerMitarbeiter.setAktuelleAbteilung(this);
        }
    }

    public int getMitarbeiterAnzahl(){
        return mitarbeiter.size();
    }

    public boolean switchAbteilung(Person p, Abteilung neueAbteilung){
        boolean success = false;
        if (!mitarbeiter.contains(p)){
            System.out.println(p.getName() + " arbeitet nicht in der Abteilung " + this.name);
        } else{
            if (p.equals(leiter)){
                System.out.println(p.getName() + " wurde als Leiter von " + name + " entbunden.");
                leiter = null;
            }
            System.out.println(p.getName() + " arbeitet für " + name);
            neueAbteilung.zufuegenMitarbeiter(p);
            success = true;
        }
        return success;
    }
}
