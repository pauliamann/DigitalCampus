package at.dcv.w05.zoo;


import java.sql.SQLOutput;
import java.time.chrono.IsoChronology;
import java.util.Vector;


public class Zoo {
    private String name;
    private int tag;
    private Vector<Gehege> gehegeListe;
    private Vector<Pfleger> pflegerListe;
    private Vector<Futter> futterListe;
    public Tierarzt tierarzt;


    /* --- Constructor --- */
    public Zoo(String name) {
        this.name = name;
        this.tag = 0;
        gehegeListe = new Vector<Gehege>();
        pflegerListe = new Vector<Pfleger>();
        futterListe = new Vector<Futter>();
        this.tierarzt = tierarzt;

    }





    /* --- Methoden --- */

    public void simulation(int tagVariable) {

        int totalFoodFed = 0;

        for (int tag = 0; tag < tagVariable; ++tag) {
            // ToDo:Anzahl Tiere im Gehege jeden Tag aufs neue überprüfen:
            int animalCount = 0;
            int dailyFoodFed = 0;
            this.tag++;


            System.out.println("Tierliste mit Futterbedarf: ");

            for (Gehege ge : gehegeListe) {
                animalCount += ge.countAnimals();

                ge.futterbedarf();

                System.out.println(ge + ", Tiere: " + ge.countAnimals() + ", Futterbedarf pro Gehege: " + ge.futterbedarf());
                dailyFoodFed += ge.futterbedarfProTier();
            }
            totalFoodFed += dailyFoodFed;
            System.out.println("Pfleger hat " + animalCount + " Tiere an Tag " + (tag + 1) + " gefüttert. Futtermenge: " + dailyFoodFed);
            System.out.println("___ . ___ . ___ . ___");

            // Beissen
            System.out.println("Beissen:" + (tag+1) + ". Tag:");

            for (Gehege ge : getGehegeListe()) {
               ge.printBeissen();
            }
            System.out.println();


        }
//        System.out.println("Futter gesamt verfüttert: " + totalFoodFed);


    }


    public void printZooStruktur() {
        System.out.println(name);
    }

    public void addGehege(Gehege newGehege) {
        // das fügt ein Gehege der Gehegeliste dazu
        gehegeListe.add(newGehege);
    }

    public void addPfleger(Pfleger newPfleger) {
        pflegerListe.add(newPfleger);
    }

    public void addFutter(Futter newFutter) {
        futterListe.add(newFutter);
    }

    public String getInfo() {
        String info = "Name: " + getName() + " Anzahl Gehege: " + getGehegeListe();
        return info;
    }

    public String getName() {
        return name;
    }

    public int getTag() {
        return tag;
    }

    public void printGehegeListe() {

        for (Gehege ge : getGehegeListe()) {
            System.out.print(ge);
            System.out.print(", ");
        }
    }

    public Vector<Gehege> getGehegeListe() {


        return gehegeListe;
    }

    public Vector<Pfleger> getPflegerListe() {
        return pflegerListe;
    }

    public Vector<Futter> getFutterListe() {
        return futterListe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setGehegeListe(Vector<Gehege> gehegeListe) {
        this.gehegeListe = gehegeListe;
    }

    public void setPflegerListe(Vector<Pfleger> pflegerListe) {
        this.pflegerListe = pflegerListe;
    }

    public void setFutterListe(Vector<Futter> futterListe) {
        this.futterListe = futterListe;
    }


    public void setTierarzt(Tierarzt tierarzt) {
        this.tierarzt = tierarzt;
    }


    public Tierarzt getTierarzt() {
        return tierarzt;
    }
}
