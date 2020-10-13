package at.dcv.w05;

import java.time.LocalDate;
import java.util.Arrays;

public class Kurs {

    private String standort; //zb.: Feldkirch, Dornbirn
    private String format; // zb.: VZ BB
    private LocalDate startDate;
    private String thema; // z.b. JaVA
    private String[] lehrer;
    private String[] teilnehmer;

    // Constructor initialisieren:
    public Kurs(String standort, String format, LocalDate startDate, String thema, String[] lehrer, String[] teilnehmer) {
        this.standort = standort;
        this.format = format;
        this.startDate = startDate;
        this.thema = thema;
        this.lehrer = lehrer;
        this.teilnehmer = teilnehmer;
    }

    public String toString() { // Das machen wir damit wir die unterschiedlichen Inhalte im main souten können
        String returnValue = "Standort: " + standort + " Format: " + startDate.toString() + " StartDate: " + startDate + " Lehrer: " + Arrays.toString(lehrer);
        return returnValue;
    }

    // GET intitialisieren:
    public String getStandort() {
        return standort;
    }

    public String getFormat() {
        return format;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getThema() {
        return thema;
    }

    public String[] getLehrer() {
        return lehrer;
    }

    public String[] getTeilnehmer() {
        return teilnehmer;
    }

    // SET intitialisieren: (hier definieren bei welcher Variable die nachträgliche Änderung möglich ist.
    // Wir entscheiden uns diesmal für Lehrer und Teilnehmer als nachträglich änderbar
    // Daher -> set erstellen

    public void setLehrer(String[] lehrer) {
        this.lehrer = lehrer;
    }

    public void setTeilnehmer(String[] teilnehmer) {
        this.teilnehmer = teilnehmer;
    }
}
