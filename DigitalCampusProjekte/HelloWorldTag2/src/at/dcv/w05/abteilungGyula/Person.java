package at.dcv.w05.abteilungGyula;

public class Person {
    String name;
    Abteilung aktuelleAbteilung;

    public Person(String name){
        this.name = name;
        aktuelleAbteilung = null;
    }

    public String getName() {
        return name;
    }

    public Abteilung getAktuelleAbteilung() {
        return aktuelleAbteilung;
    }

    public void setAktuelleAbteilung(Abteilung aktuelleAbteilung) {
        this.aktuelleAbteilung = aktuelleAbteilung;
    }
}
