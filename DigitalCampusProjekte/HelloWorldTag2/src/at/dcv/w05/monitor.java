package at.dcv.w05;
/*
 auf die Reihenfolge achten:
    1. Attribute;
    2. Constructoren;
    3. Funktionen;
    4 main
*/



public class monitor { // Klassenname und Constructor muss identisch sein !!!

    private String description; // Attribute (dieses Attribut ist private, somit können externe Funktionen nicht zugreifen.


    /* Es gibt einen standard:
    * wenn eine Funktion nur zu lesen ist: dann mit get am Anfang
    * wenn es auch zu Schreiben ist: dann mit set am Anfang
    *
    * */
    /* This is a constructor without parameter */

    public monitor(){
        description = "Monitor";
    }
    /* This is a constructor without parameter */

    public monitor(String desc){
        description = desc;
    }
    public static void main(String[] args) {
        monitor m = new monitor();
        m.sayHello();
    }

    public void sayHello() {
        System.out.println(description + " says: Hello World!");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

/*    public static void main(String[] args) { // jetzt kann man objektspezifische Funktionen aufrufen Bspw.:
        monitor mClemens = new monitor("Monitor von Clemens");
        mClemens.sayHello();

        monitor mPaul = new monitor("Monitor von Paul");
        mPaul.sayHello();
    }*/
}
