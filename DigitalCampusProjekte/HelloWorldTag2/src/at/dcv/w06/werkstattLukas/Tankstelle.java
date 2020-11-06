package at.dcv.w06.werkstattLukas;

import java.util.Vector;

public class Tankstelle {

    private String name;
    private Vector<Treibstoff> treibstoffListe;

    public Tankstelle(String name, Vector<Treibstoff> treibstoffListe) {
        this.name = name;
        this.treibstoffListe = treibstoffListe;
    }

    private Treibstoff findeTreibstoff(String treibstoffArt) {
        // hier suchen wir die Treibstoffart

        for (Treibstoff ts : treibstoffListe) {
            if (ts.getName().equals(treibstoffArt)) {
                return ts;
            }
        }
        return null; // wenn der Treibstoff des Autos nicht in der TreibstoffListe enthalten ist. wird null zurückgegeben.
    }

/*   Hier benötigen wir Attribute von Klasse Auto.
     Die Verbindung zur Auto Klasse stellen wir her, indem in der Methode die Klasse Auto in der Klammer mitgegeben wird .
     in der Auto Klasse müssen die benötigten getter oder Setter erstellt sein.*/

    public void tanken(Auto auto) {
    //  Zuerst prüfen wir ob die vom Auto benötigte Treibstoffart in der Tankstelle enthalten ist.
        String treibstoffArt = auto.getTreibstoff();
        Treibstoff treibstoff = findeTreibstoff(treibstoffArt);

        if (findeTreibstoff(treibstoffArt) != null) {
            // Wenn der Treibstoff vorhanden ist, fährt sie fort und Tankt
            float zuTanken = auto.getTankGroesse() - auto.getTankStand();
            float rechnung = zuTanken * treibstoff.getPreisProLiter();
            float newSummeTankenEuro = auto.getSummeEuroTanken() + rechnung;

            auto.setAnzahlTanken(+1);
            auto.setSummeEuroTanken(newSummeTankenEuro);
            auto.setTankStand(auto.getTankGroesse());

            // Ausgabe
            System.out.println("");
            System.out.printf("--- --- Willkommen auf der Tankstelle %s --- --- \n", name);
            System.out.printf("Wir tanken Ihnen %.2fL %s \n", zuTanken, treibstoffArt);
            System.out.printf("%s muss den Betrag über: %.2f€ zahlen.\n", auto.getFahrer().getName(), rechnung);
            System.out.println("--- --- --- ");
        } else {
            // wenn der Treibstoff auf der Tankstelle nicht existiert, hört die Methode hier auf.
            System.out.println("Tanke wo anders. den treibstoff gibts ned.");
            return;
        }
    }
}
