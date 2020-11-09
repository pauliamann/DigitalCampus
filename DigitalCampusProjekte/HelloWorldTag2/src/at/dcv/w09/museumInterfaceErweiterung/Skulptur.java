package at.dcv.w09.museumInterfaceErweiterung;

import java.util.Vector;

public class Skulptur extends KunstObjekt {

    private Vector<String> materialien = new Vector<>();

    public Vector<String> getMaterialien() {
        return materialien;
    }

    public Skulptur(String titel, String kuenstler, int preis) {
        super(titel, kuenstler,preis);
    }

    public void addMaterialien (String[] neueMaterialien) {
        for (String neuesMaterial : neueMaterialien) {
            if (!materialien.contains(neuesMaterial)) {
                materialien.add(neuesMaterial);
            }
        }
    }

    @Override
    public String toString(String prefix) {
        return super.toString(prefix) + prefix + "Materialien: " + materialien + "\n";
    }
}
