package at.dcv.w09.EinkaufsZentrum;

import java.util.Vector;

public abstract class Produkt implements IProduktKategorie {

    public String description;

    public Produkt() {
        this.description = description;
    }


    @Override
    public String getDescription() {
        return description;
    }
}
