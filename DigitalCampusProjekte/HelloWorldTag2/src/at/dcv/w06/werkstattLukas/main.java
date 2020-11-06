package at.dcv.w06.werkstattLukas;

import java.util.Vector;

public class main {
//    Treibstoff treibstoff = new Treibstoff

    public static void main(String[] args) {
        Vector<Treibstoff> treibstoffs = new Vector<>();
        treibstoffs.add(new Treibstoff("Benzin", 1.2f));
        treibstoffs.add(new Treibstoff("Diesel", 0.9f));


        Werkstatt werkstatt = new Werkstatt("Heinzis Autoreparatur");
        Tankstelle tanke = new Tankstelle("Esso", treibstoffs);
        Fahrer fahrer1 = new Fahrer("Paul");

        Reifen[] reifen = new Reifen[4];
        Reifen reifenVL = new Reifen("vorneLinks", 7);
        Reifen reifenVR = new Reifen("vorneRechts", 6);
        Reifen reifenHL = new Reifen("hintenLinks", 5);
        Reifen reifenHR = new Reifen("hintenRechts", 4);

        reifen[0] = reifenVL;
        reifen[1] = reifenVR;
        reifen[2] = reifenHL;
        reifen[3] = reifenHR;



        Auto auto = new Auto("Fiat", "Punto", 20, 6.0f, "Benzin", reifen);
        auto.setFahrer(fahrer1);
        auto.setTankstelle(tanke);
        auto.setWerkstatt(werkstatt);


        auto.fahren(800);
        auto.statistik();
    }

}
