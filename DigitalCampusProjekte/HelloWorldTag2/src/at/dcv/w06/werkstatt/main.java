package at.dcv.w06.werkstatt;

public class main {

    public static void main(String[] args) {

        Auto auto = new Auto("Jaguar", 995, 25.56f,  50, "Benzin");

        Tankstelle tankstelle1 = new Tankstelle("OMV");
        auto.setTankstelle(tankstelle1);

        Werkstatt werkstatt1 = new Werkstatt("Ullis Car Repear");
        auto.setWerkstatt(werkstatt1);

        /* --- . --- . ---  A U S G A B E --- . --- . --- */


        auto.fahren(100);

        auto.printStatistik();


    }


}
