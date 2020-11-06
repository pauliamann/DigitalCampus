package at.dcv.w05.zoo;

public class Futter {

    private String futterSorte;

    public Futter(String futterSorte) {
        this.futterSorte = futterSorte;
    }

    @Override
    public String toString() {
        return futterSorte + " " ;
    }
}
