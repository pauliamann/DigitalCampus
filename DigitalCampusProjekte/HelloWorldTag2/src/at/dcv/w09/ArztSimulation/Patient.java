package at.dcv.w09.ArztSimulation;

public class Patient {

    private String name;
    private String Symptome;

    public Patient(String name) {
        this.name = name;
        this.Symptome = Symptome;
    }

    public String getName() {
        return name;
    }

    public String getSymptome() {
        return Symptome;
    }

    public void setSymptome(String symptome) {
        Symptome = symptome;
    }
}
