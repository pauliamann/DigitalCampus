package at.dcv.w08.codingcampus;

public class Main {

    public static void main(String[] args) {

        CodingCampus codingCampus = new CodingCampus("Digital Campus");
//          Kurse Anlegen:
        Course javaCoding1 = codingCampus.searchAndCreateJava("JC-1", "JavaCoding", 2, 10, "Computer");
        Course javaCoding2 = codingCampus.searchAndCreateJava("JC-2", "JavaCoding",4, 20, "Computer");
        Course businessEnglish1 = codingCampus.searchAndCreateEnglish("BE-1","BusinessEnglish", 4, 30, "bücher");

//        Participant zufügen Parameter(name)
        Participants pax1 = new Participants("Heinz", "JavaCoding");
        Participants pax2 = new Participants("Karli", "JavaCoding");
        Participants pax3 = new Participants("Stefan", "JavaCoding");
        Participants pax4 = new Participants("Sedat", "JavaCoding");
        Participants pax5 = new Participants("Julia","JavaCoding");
        Participants pax6 = new Participants("Peter","JavaCoding");
        Participants pax7 = new Participants("Klaus","BusinessEnglish");

        javaCoding1.addKursTeilnehmer(pax1, codingCampus);
        javaCoding1.addKursTeilnehmer(pax2, codingCampus);
        javaCoding1.addKursTeilnehmer(pax3, codingCampus);
//        javaCoding1.addKursTeilnehmer(pax4, codingCampus);
//        javaCoding1.addKursTeilnehmer(pax5, codingCampus);

        javaCoding2.addKursTeilnehmer(pax6, codingCampus);
        javaCoding2.addKursTeilnehmer(pax5, codingCampus);
//        javaCoding2.addKursTeilnehmer(pax4, codingCampus);

        businessEnglish1.addKursTeilnehmer(pax7, codingCampus);
        businessEnglish1.addKursTeilnehmer(pax2, codingCampus);

        Instructor inst1 = new Instructor("SuperHeinz");
        javaCoding1.addInstructor(inst1);





        // --- Print Struktur: ---

        codingCampus.printCodingCampusStructure();
    }


}
