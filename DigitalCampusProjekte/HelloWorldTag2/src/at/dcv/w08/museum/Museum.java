package at.dcv.w08.museum;

import java.util.Random;
import java.util.Vector;

public class Museum {

    private String name;
    private Vector<Etage> etageVector;
    private Vector<String> farbeVector;
    private Vector<String> materiaVector;
    private Vector<Besucher> besucherVector;
    private Vector<Raum> raumVector;

    Random random = new Random();

    public Museum(String name) {
        this.name = name;
        this.farbeVector = new Vector<String>();
        this.materiaVector = new Vector<String>();
        this.etageVector = new Vector<Etage>();
        this.besucherVector = new Vector<Besucher>();
        this.raumVector = new Vector<Raum>();
    }


    public void runSimulation(int time) {
        fillRaumVektor();

        System.out.println("--- --- Museumssimulation:");
        int counter = 0;
        for (int i = 0; i < time; i++) {
            ++counter;
            System.out.printf("--- --- %s. Stunde im Museum:  %s --- ---\n", counter, name);
            addBesucher();

            for (Besucher b : besucherVector) {
                System.out.println(b + " ist  in: " + b.getCurrentRoom());
                Raum neuerRaum = getNewRnRoom();
                if (!neuerRaum.equals(b.getCurrentRoom())) {
                    b.bewegen(neuerRaum);
                }
                b.exitMuseum();
            }

            System.out.println();
        }
    }

    public Raum getNewRnRoom() {
        Raum neuerRaum = raumVector.get(getRandomNumberMax(raumVector.size()));
        return neuerRaum;
    }


    public void addBesucher() {
        // hier sollen auch mehrer Besucher gleichzeitig den Raum betreten dürfen:

        for (int i = 0; i < random.nextInt(4); i++) {
            String neuerBesucher = getRNName();
            Besucher b = new Besucher(neuerBesucher);
            besucherVector.add(b);
            b.setCurrentRoom(getRandomRaum());
        }
    }

    private String getRNName() {
        String[] vorname = {"Adam", "Bertram", "Cesar", "Dominique", "Emanuelle", "Franziska", "Georgina", "Henriette"};

        int intRNVorname = random.nextInt(vorname.length);

        String randomName = vorname[intRNVorname];

        return randomName;
    }

    public void fillRaumVektor() {
        for (Etage e : etageVector) {
            for (Raum r : e.getRaumVector()) {
                raumVector.add(r);
            }
        }
    }


    public Raum getRandomRaum() {
        int maxInt = raumVector.size();
        Raum r = raumVector.get(random.nextInt(raumVector.size()));
        return r;
    }


    public int getRandomNumberMax(int max) {
        int rnInt = random.nextInt(max);

        return rnInt;
    }

    public int getRandomNumberMinMax(int min, int max) {
        int rnInt = random.nextInt(max - min) + min;
        return rnInt;
    }


    public void printStruktur(String prefix) {
        System.out.println("Museum:" + name);
        for (Etage e : etageVector) {
            e.printStruktur(prefix + "    ");
        }
    }


    public Etage searchAndCreate(String neueEtage) {
        for (Etage e : etageVector) {
            if (e.getName().equals(neueEtage)) {
                return e;
            }
        }
        Etage e = new Etage(neueEtage);
        etageVector.add(e);
        return e;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
}


