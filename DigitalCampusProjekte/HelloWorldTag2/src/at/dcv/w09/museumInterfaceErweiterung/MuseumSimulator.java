package at.dcv.w09.museumInterfaceErweiterung;


import java.util.Vector;

public class MuseumSimulator {
    private static MuseumSimulator instance = new MuseumSimulator();
    private Vector<ISimulate> objekteToSimulate = new Vector<>();
    private int day = 0;
    private int hour = 0;

    private MuseumSimulator() {
    }

    public static MuseumSimulator getInstance() {
        return instance;
    }

    public void addObjektToSimulate(ISimulate obj) {
        objekteToSimulate.add(obj);
    }

    public void removeObjektFromSimulate(ISimulate obj) {
        objekteToSimulate.remove(obj);
    }

    public void tick() {
        Vector<ISimulate> currentSimulate = (Vector<ISimulate>) objekteToSimulate.clone();
        for (ISimulate sim : currentSimulate) {
            sim.simulate(day, hour);
        }
        ++hour;
        if (hour >= 24) {
            hour = 0;
            ++day;
        }
    }
}
