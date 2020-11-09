package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Random;

import java.util.Vector;

import static at.dcv.w09.museumInterfaceErweiterung.Main.ANSI_RESET;
import static at.dcv.w09.museumInterfaceErweiterung.Main.ANSI_YELLOW;

public class Dieb extends Besucher {

    private static Random random = new Random();

    public Dieb(String name, Museum museum) {
        super(name, museum);
    }

    /*@Override
    public void bewundern() {
        System.out.println(getName() + " ist in Raum " + getRaum().getNamen());
        Vector<KunstObjekt> objekte = getRaum().getKunstObjekte();
        if (objekte.size() > 0) {
            KunstObjekt k = objekte.get(random.nextInt(objekte.size()));
            System.out.println(getName() + ": \"oh wie schön\" " + k.getTitel());
            if (getRaum().istDiebAlleine(this)) {
                System.out.println(ANSI_YELLOW + getName() + " ist alleine im Raum.");
                System.out.printf("- - > %s wurde gestohlen.%n" + ANSI_RESET, k.getTitel());
                objekte.remove(k);
            }
        } else if (objekte.size() == 0) {
            System.out.println("Alle Objekte wurden gestohlen !");
        }
        System.out.println();
    }*/

}
