package at.dcv.w09.ArztSimulation;

public class Privat implements IRechnung {

    @Override
    public int getSumme() {
        return 0;
    }


    @Override
    public String getEmpfaenger() {
        return null;
    }

    @Override
    public void simulate() {
        System.out.printf("--- Privat Rechnung für %s ---\n", getEmpfaenger());
    }
}
