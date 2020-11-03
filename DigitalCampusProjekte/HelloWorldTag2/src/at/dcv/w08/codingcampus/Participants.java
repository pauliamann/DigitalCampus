package at.dcv.w08.codingcampus;

public class Participants extends People {

    private String kursWunsch;

    public Participants(String name, String kursWunsch) {
        super(name);
        this.kursWunsch = kursWunsch;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setKursWunsch(String kursWunsch) {
        this.kursWunsch = kursWunsch;
    }

    public String getKursWunsch() {
        return kursWunsch;
    }

    @Override
    public String toString() {
        return kursWunsch ;
    }
}
