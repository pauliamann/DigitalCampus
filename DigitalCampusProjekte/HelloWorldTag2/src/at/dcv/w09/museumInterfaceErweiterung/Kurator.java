package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Random;
import java.util.Vector;

public class Kurator implements ISimulate {
    private String name;
    private int spenden;
    private Vector<KunstObjekt> kaufObjekt = new Vector<>();
    private static Random random = new Random();
    private Museum museum;

    public Kurator(String name, Museum museum, Vector<KunstObjekt> kaufObjekt) {
        this.name = name;
        this.kaufObjekt = kaufObjekt;
        this.museum = museum;
        MuseumSimulator.getInstance().addObjektToSimulate(this);
    }

    public void spendenSammeln(int spende) {
        spenden = spenden + spende;
    }

    public KunstObjekt kunstobjekteKaufen() {
        KunstObjekt gekauftesObjekt = null;
        for (KunstObjekt k : kaufObjekt) {
            if (k.getPreis() <= spenden) {
                System.out.println("KURATOR " + name + " kauft: " + k.getTitel() + " um € " + k.getPreis() + ".-");
                spenden = spenden - k.getPreis();
                gekauftesObjekt = k;
                kaufObjekt.remove(k);
                break;
            }
        }
        if (gekauftesObjekt != null) {
            kaufObjekt.remove(gekauftesObjekt);
            Raum r = museum.getRandomRaum();
            r.addKunstObjekt(gekauftesObjekt);
            System.out.println(" - - > \"" + gekauftesObjekt.getTitel() + "\" wurde \"" + r + "\" zugefügt.");
        }


        return gekauftesObjekt;
    }


    @Override
    public void simulate(int day, int hour) {
        System.out.println();
        System.out.println("--- KURATOR ---");

        System.out.println("Budget € " + spenden + ".-");
        System.out.println("Kaufoptionen:");
        for (KunstObjekt k : kaufObjekt) {
            System.out.println("   " + k.getTitel() + " kostet € " + k.getPreis());
        }
        if (random.nextInt(10) < 5) {
            spendenSammeln(random.nextInt(300));
            System.out.println("Spenden erhalten. Das Budget ist nun € " + spenden + ".-");
        } else {
            KunstObjekt objGekauft = kunstobjekteKaufen();
        }
        System.out.println();
    }


}
