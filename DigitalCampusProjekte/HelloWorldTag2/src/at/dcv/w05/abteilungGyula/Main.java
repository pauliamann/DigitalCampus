package at.dcv.w05.abteilungGyula;

public class Main {
    public static void main(String[] args) {
        Abteilung vorstand = new Abteilung("Vorstand");
        Abteilung vertrieb = new Abteilung("Vertrieb");
        Abteilung vertriebPrivat = new Abteilung("Vertrieb Privatkunden");
        Abteilung vertriebFirmen = new Abteilung("Vertrieb Firmenkunden");
        Abteilung einkauf = new Abteilung("Einkauf");

        Person alfred = new Person("Alfred Boss");
        Person max = new Person("Mustermann Max");
        Person angela = new Person("Musterfrau Angela");
        Person gyula = new Person("Gyula");

        vorstand.zufuegenUnterAbteilung(vertrieb);
        vorstand.zufuegenUnterAbteilung(einkauf);
        vertrieb.zufuegenUnterAbteilung(vertriebPrivat);
        vertrieb.zufuegenUnterAbteilung(vertriebFirmen);

        vorstand.leiterErnennen(alfred);
        vertrieb.leiterErnennen(max);
        vertriebPrivat.leiterErnennen(angela);
        vertrieb.zufuegenMitarbeiter(gyula);
        vertrieb.switchAbteilung(gyula, einkauf);
        vorstand.leiterErnennen(gyula);

        vorstand.printAbteilungsStruktur("");
    }
}
