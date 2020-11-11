package at.dcv.w09.ArztSimulation;

public class Hausarzt extends Arzt {

    public Hausarzt(String name) {
        super(name);
    }

    @Override
    public void behandeln() {
        System.out.println(Hausarzt.class.getClass() + " " + getName() + " behandelt jemanden.");
    }
}
