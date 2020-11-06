package at.dcv.w05.zoo;

public class Pfleger {

    private String name;
    private String gehege; // für die Zuordnung
    private int tiereGefuettert;


    /* --- Constructor --- */
    public Pfleger(String name) {
        this.name = name;
        this.gehege = gehege;
    }

    /* --- Methoden --- */

    public void pflegerFuetter (){
        System.out.println("Tiere sind gefüttert.");



        System.out.println("Er muss XX Tiere Füttern.");
  // den Tagesbedarf abfragen, und den Futtercounter für das jeweilige Futter pro Tag erhöhen.




    }

    @Override
    public String toString() {
        return "- Pfleger: " + name ;
    }

    public String getName() {
        return name;
    }

    public String getGehege() {


        return gehege;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGehege(String gehege) {
        this.gehege = gehege;
    }
}
