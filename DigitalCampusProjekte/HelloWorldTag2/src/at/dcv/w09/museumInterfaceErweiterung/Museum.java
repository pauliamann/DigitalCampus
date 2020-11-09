package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Random;
import java.util.Vector;

public class Museum {
    private String name;
    private Vector<Etage> etagen = new Vector<>();
    private Vector<Besucher> besucher = new Vector<>();
    private Vector<Waechter> waechter = new Vector<>();
//    private Kurator kurator;
    private Random random = new Random();


    public Museum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Etage searchAndCreateEtage(String neueEtage) {
        for (Etage e : etagen) {
            if (e.getEtage().equals(neueEtage)) {
                return e;
            }
        }
        Etage e = new Etage(neueEtage);
        etagen.add(e);
        return e;
    }

    @Override
    public String toString() {
        return "Museum" + name;
    }

    public void getAlleFarben() {
        Vector<String> alleFarben = new Vector<>();
        for (Etage e : etagen) {
            e.getAllKunstObjekte();
            for (KunstObjekt k : e.getAllKunstObjekte()) {
                if (k instanceof Gemaelde) {
                    Vector<String> farbenGemaelde = ((Gemaelde) k).getFarben();
                    for (String f : farbenGemaelde) {
                        if (!alleFarben.contains(f)) {
                            alleFarben.add(f);
                        }
                    }
                }
            }
        }
        System.out.println(alleFarben);
    }

    public void getAlleMaterialien() {
        Vector<String> alleMaterialien = new Vector<>();
        for (Etage e : etagen) {
            e.getAllKunstObjekte();
            for (KunstObjekt k : e.getAllKunstObjekte()) {
                if (k instanceof Skulptur) {
                    Vector<String> materialienSkulptur = ((Skulptur) k).getMaterialien();
                    for (String f : materialienSkulptur) {
                        if (!alleMaterialien.contains(f)) {
                            alleMaterialien.add(f);
                        }
                    }
                }
            }
        }
        System.out.println(alleMaterialien);
    }

    public void printStruktur() {
        String prefix = "         ";
        String prefix3 = prefix + prefix + prefix;

        System.out.println(toString());
        for (Etage e : etagen) {
            System.out.println(prefix + e.toString());
            for (Raum r : e.getRaeume()) {
                System.out.println(prefix + prefix + r.toString());
                for (KunstObjekt k : r.getKunstObjekte()) {
                    System.out.println(k.toString(prefix3));
                }
            }
        }
        System.out.print("Alle Farben: ");
        getAlleFarben();
        System.out.print("Alle Materialien: ");
        getAlleMaterialien();
    }
/*
    public void createBesucher(String name) {
        Besucher b = new Besucher(name);
        besucher.add(b);
    }
*/
/*
    public void createDieb(String name) {
        Dieb d = new Dieb(name);
        besucher.add(d);
    }

    public void createWaechter(String name) {
        Waechter w = new Waechter(name);
        waechter.add(w);
    }

 */
/*
    public void createKurator (String name, Vector<KunstObjekt> kaufObjekt){
        Kurator k = new Kurator(name, m, kaufObjekt);
        //kurator = k;
    }
*/
    public Raum getRandomRaum (){
        int randomEtage = random.nextInt(etagen.size());
        int randomRaum = random.nextInt(etagen.get(randomEtage).getRaeume().size());
        return etagen.get(randomEtage).getRaeume().get(randomRaum);
    }

    public void simulation(int stunden) {

        System.out.println("Simulation startet:");

        for (int i = 1; i <= stunden; i++) {
            System.out.println(i + ". Stunde im Museum");
            for (Waechter w : waechter){
                w.bewegen(getRandomRaum());
            }
            /*
            for (Besucher b : besucher) {
                b.bewegen(getRandomRaum());
                b.bewundern();
            }
            System.out.println( );
             */
        }
    }
}
