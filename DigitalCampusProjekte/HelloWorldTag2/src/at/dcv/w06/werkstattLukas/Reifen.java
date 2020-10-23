package at.dcv.w06.werkstattLukas;


public class Reifen {

    private String name;
    private float reifenProfil;

    public Reifen(String name, float reifenProfil) {
        this.name = name;
        this.reifenProfil = reifenProfil;
    }

    public String getName() {
        return name;
    }

    public float getReifenProfil() {
        return reifenProfil;
    }

    // Abnützen / km
    public float reifenAbnuetzung(Auto auto, int kilometer) {
        float neuesReifenProfil = 0;

        neuesReifenProfil = reifenProfil - (auto.REIFENVERSCHLEIS_PRO_KM);
        reifenProfil = neuesReifenProfil;
        return reifenProfil;
    }

    public void setReifenProfil(float reifenProfil) {
        this.reifenProfil = reifenProfil;
    }

    @Override
    public String toString() {
        return "Reifen{" +
                "name='" + name + '\'' +
                ", reifenProfil=" + reifenProfil +
                '}';
    }
}
