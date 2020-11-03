package at.dcv.w08.codingcampus;

import java.util.Vector;

public class Course {

    public String name;
    private String description;
    public int maxParticipants;
    public int dauer;
    public Vector<Participants> kursTeilnehmerListe;
    private Vector<Instructor> instuctorListe;


    public Course(String name, String description, int maxParticipants, int dauer) {
        this.name = name;
        this.description = description;
        this.maxParticipants = maxParticipants;
        this.dauer = dauer;
        this.kursTeilnehmerListe = new Vector<Participants>();
        this.instuctorListe = new Vector<Instructor>();

    }

    public String getName() {
        return name;
    }

    public void addKursTeilnehmer(Participants participant, CodingCampus codingCampus) {
        if (kursTeilnehmerListe.size() < maxParticipants) {
            kursTeilnehmerListe.add(participant);
        } else {
            System.out.println(participant.getName() + " konnte dem Kurs nicht zugefügt werden: Kurs ist voll.");

            searchAlternateCourse(participant, codingCampus);
            System.out.println();
        }
    }

    public void searchAlternateCourse(Participants participant, CodingCampus codingCampus) {

        for (Course c : codingCampus.courseList) {

            if (c.getClass().getSimpleName().equals(participant.getKursWunsch())) {

                String istKurs = c.getDescription();
                String wunschKurs = participant.getKursWunsch();

                if (istKurs.equals(wunschKurs)) { // prüfen ob der Kurs dem Wunschkurs entspricht
                    if ((maxParticipants - c.kursTeilnehmerListe.size()) >0) {   // prüfen ob es einen Kurs mit freien Platz gibt.
                        int freiePlaetze = c.maxParticipants - c.kursTeilnehmerListe.size();

                        System.out.println("Aber der " + wunschKurs + " (" + c.getName() + ") hat noch " + freiePlaetze + " Plätze frei. " );
                        System.out.println("---");
                    }
                }
            }
        }
    }

    public void addInstructor(Instructor instructor) {
        instuctorListe.add(instructor);
    }

    public void printInstructorListe() {
        for (Instructor i : instuctorListe) {
            System.out.print(i.getName() + " ");
        }
        System.out.println();
    }

    public void printTeilnehmerListe() {
        int count = 0;
        for (Participants p : kursTeilnehmerListe) {
            count++;
            System.out.print(p.getName());
            if (count < kursTeilnehmerListe.size() ){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public String getDescription() {
        return description;
    }
}
