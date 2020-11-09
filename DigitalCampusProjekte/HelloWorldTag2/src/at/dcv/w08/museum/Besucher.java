package at.dcv.w08.museum;

import java.util.Random;

public class Besucher {

    private String name;
    private Raum currentRoom;
    private Besucher b;


    public Besucher(String name) {
        this.name = name;
        this.currentRoom = null;
        this.b = null;
    }

    public String getName() {
        return name;
    }

    public Raum getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Raum currentRoom) {
        this.currentRoom = currentRoom;
    }

    @Override
    public String toString() {
        return name;
    }

    public void bewegen(Raum neuerRaum) {
        currentRoom = neuerRaum;
        System.out.println(" - - > Besucher " + name + " wechselt nun in Raum \"" + currentRoom + "\"");
    }

    public void exitMuseum () {
        Random random = new Random();
        if (random.nextInt(10) < 5) {
            System.out.println(" -X- " + name + " verlässt das Museum.");
        }
    }



/*    public void changeRoom() {
        // Person : this Person

        // change Room



        System.out.println("Neuer Raum: ");
    }*/

 /*   public Raum getRandomRaum() {
        Raum randomRaum = null;

        for (Etage e : etageVector) {
            int nrRoomsTotal = e.getRaumVector().size();
            // zufälliger Raum ausgewählt:
//            System.out.println(e.getRaumVector().get(getRandomNumberMax(nrRoomsTotal)));
            randomRaum = e.getRaumVector().get(getRandomNumberMax(nrRoomsTotal));
        }
        return randomRaum;
    }*/


}
