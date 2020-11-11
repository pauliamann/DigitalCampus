package at.dcv.w09.museumInterfaceErweiterung;


import at.dcv.w08.interfaceInnerClassAbstract.CSVReader;
import at.dcv.w08.interfaceInnerClassAbstract.ICSVProcessor;

import java.util.Vector;

public class Main {

    private static class MuseumProcessor implements ICSVProcessor {
        Vector<Museum> museen;

        MuseumProcessor(Vector<Museum> museen) {
            this.museen = museen;
        }

        @Override
        public boolean isLineValid(int columnCount) {
            if (columnCount == 8) return true;
            return false;
        }

        public Museum searchAndCreateMuseum(String neuesMuseum, Vector<Museum> museen) {
            for (Museum m : museen) {
                if (m.getName().equals(neuesMuseum)) {
                    return m;
                }
            }
            Museum m = new Museum(neuesMuseum);
            museen.add(m);
            return m;
        }

        @Override
        public void process(String[] columns) {
//        System.out.println("Museum : " + columns[0]);
//        System.out.println("Etage : " + columns[1]);
//        System.out.println("Raum : " + columns[2]);
//        System.out.println("Kunstobjekt : " + columns[3]);
//        System.out.println("Farbe : " + columns[4]);
//        System.out.println("Material : " + columns[5]);
//        System.out.println("Künstler : " + columns[6]);
//        System.out.println("Titel : " + columns[7]);

            Museum neuesMuseum = searchAndCreateMuseum(columns[0], museen);
            Etage neueEtage = neuesMuseum.searchAndCreateEtage(columns[1]);
            Raum neuerRaum = neueEtage.searchAndCreateRaum(columns[2]);
            KunstObjekt neuesKunstObjekt = neuerRaum.searchAndCreate(columns[7], columns[6], columns[3]);
            if (neuesKunstObjekt instanceof Gemaelde) {
                ((Gemaelde) neuesKunstObjekt).addFarben(columns[4].split(";"));
            } else if (neuesKunstObjekt instanceof Skulptur) {
                ((Skulptur) neuesKunstObjekt).addMaterialien(columns[5].split(";"));
            }

        }
    }

    public static void main(String[] args) {

        Vector<Museum> museen = new Vector<>();

        MuseumProcessor rf = new MuseumProcessor(museen);
        CSVReader csv = new CSVReader(rf);
        csv.readCSV("C:\\Users\\DCV\\Desktop\\museum-sascha.csv", ",");

        Vector<KunstObjekt> kaufObjekt = new Vector<>();
        kaufObjekt.add(new Gemaelde("Monalisa", "Leonardo da Vinci", 10));
        kaufObjekt.add(new Skulptur("PflanzeImGarten", "Detlev Doof", 300));
        kaufObjekt.add(new Gemaelde("SchuhUntermSofa", "Verschlamperer Horst", 90));
        kaufObjekt.add(new Skulptur("Nix Verstehen", "Java Jahn", 1));

        for (Museum m : museen) {
            //m.createBesucher("Franz Josef");
            new Besucher("Franz Josef", m);
//            new Besucher("Berna Dette", m);
//            new Besucher("Gundula Golf", m);
//            new Besucher("Hermann Dubios",m);

            new Dieb("Richard Räuber", m);

/*
            m.createBesucher("Berna Dette");
            m.createBesucher("Gundula Golf");
            m.createBesucher("Hermann Dubios");
*/
//            m.createDieb("Richard Räuber");
//
//            m.createWaechter("Wielfred Wach");
//            m.createWaechter("Heinrich Handschnelle");
//            m.createWaechter("Robert Räuberfänger");

            Kurator k = new Kurator("Kevin", m, kaufObjekt);
/*
            System.out.println("Print Museums-Struktur:");
            m.printStruktur();
            System.out.println();
            System.out.println("Simulation: ");
            m.simulation(3);

 */
            for (int i = 0; i < 10; i++) {
                MuseumSimulator.getInstance().tick();
            }
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
}
