package at.dcv.w07.bibClemens;


import java.util.Date;

public class Ausleihung {
    private Buch buch;
    private Date ausleihDatum;
    private String ausleiher;

    public Buch getBuch() {
        return buch;
    }

    public void setBuch(Buch buch) {
        this.buch = buch;
    }

    public Date getAusleihDatum() {
        return ausleihDatum;
    }

    public void setAusleihDatum(Date ausleihDatum) {
        this.ausleihDatum = ausleihDatum;
    }

    public String getAusleiher() {
        return ausleiher;
    }

    public void setAusleiher(String ausleiher) {
        this.ausleiher = ausleiher;
    }
}



