package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Vector;

public class Gemaelde extends KunstObjekt {
    private Vector<String> farben = new Vector<>();

    public Vector<String> getFarben() {
        return farben;
    }

    public Gemaelde(String titel, String kuenstler, int preis) {
        super(titel, kuenstler, preis);
    }

    public void addFarben(String[] neueFarben) {
        for (String neueFarbe : neueFarben) {
            if (!farben.contains(neueFarbe)) {
                farben.add(neueFarbe);
            }
        }
    }

    @Override
    public String toString(String prefix) {
        return super.toString(prefix) + prefix + "Farben: " + farben + "\n";
    }
}
