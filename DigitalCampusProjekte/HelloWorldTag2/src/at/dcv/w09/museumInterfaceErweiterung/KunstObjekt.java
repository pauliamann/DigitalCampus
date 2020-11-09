package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Objects;

public class KunstObjekt {
    private String titel;
    private String kuenstler;
    private int preis;

    protected KunstObjekt(String titel, String kuenstler, int preis) {
        this.titel = titel;
        this.kuenstler = kuenstler;
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public String getKuenstler() {
        return kuenstler;
    }

//    public String getTyp() {
//        return typ;
//    }

    public String toString(String prefix) {
        return          prefix + "Titel: " + titel + "\n" +
                        prefix + "Künstler: " + kuenstler + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KunstObjekt that = (KunstObjekt) o;
        return Objects.equals(titel, that.titel) &&
                Objects.equals(kuenstler, that.kuenstler);
    }

    public int getPreis() {
        return preis;
    }


}
