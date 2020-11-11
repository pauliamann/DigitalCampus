package at.dcv.w09.ArztSimulation;

public class Arzt implements IBehandlung, IRechnung{
    private String name;
    private String fachgebiet;


    public Arzt(String name) {
        this.name = name;
        this.fachgebiet = fachgebiet;
    }

    @Override
    public void behandeln() {
        System.out.println(" Arzt: " + name + " behandelt jemanden.");
    }

    @Override
    public void getRechnung() {
        System.out.println(" Arzt: " + name + " legt eine Rechnung.");

    }

    public String getName() {
        return name;
    }

    @Override
    public void simulation() {
        System.out.println("--- " + name + " Fachgebiet: " + fachgebiet + "----");
        behandeln();
        getRechnung();
    }


    @Override
    public String getEmpfaenger() {
        return null;
    }

    @Override
    public int getSumme() {
        return 0;
    }

    @Override
    public void simulate() {

    }
}
