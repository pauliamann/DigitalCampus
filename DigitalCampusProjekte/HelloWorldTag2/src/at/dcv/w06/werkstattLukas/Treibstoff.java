package at.dcv.w06.werkstattLukas;

public class Treibstoff {
    private String name;
    private float preisProLiter;

    public Treibstoff (String name, float preisProLiter) {
        this.name = name;
        this.preisProLiter = preisProLiter;
    }

    public String getName() {
        return name;
    }

    public float getPreisProLiter() {
        return preisProLiter;
    }
}
