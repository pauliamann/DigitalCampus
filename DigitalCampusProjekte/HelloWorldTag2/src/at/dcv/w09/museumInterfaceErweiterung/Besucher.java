package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Random;
import java.util.Vector;

public class Besucher extends Person implements ISimulate {
    private Museum museum;
    private Raum raum;

    private static Random random = new Random();

    public Besucher(String name, Museum museum) {
        super(name);
        this.museum = museum;
        this.raum = null;
        MuseumSimulator.getInstance().addObjektToSimulate(this);
    }

    public Raum getRaum() {
        return raum;
    }

    public void bewegen(Raum neuerRaum) {
        raum = neuerRaum;
        raum.addPerson(this);
    }

    public void bewundern() {
        System.out.println(getName() + " ist in Raum " + raum.getNamen());
        Vector<KunstObjekt> objekte = raum.getKunstObjekte();
        if (objekte.size() > 0) {
            KunstObjekt k = objekte.get(random.nextInt(objekte.size()));
            System.out.print(getName() + ": \"oh wie schön\" " + k.getTitel());
        }
        System.out.println("");
    }

    @Override
    public void simulate(int day, int hour) {
        System.out.println("Bewegen:");
        bewegen(museum.getRandomRaum());
        bewundern();

    }
}
