package at.dcv.w06.werkstattLukas;

import java.sql.SQLOutput;

public class Werkstatt {

    private String name;

    // Constructor
    public Werkstatt(String name) {
        this.name = name;
    }

    // Methoden
    public void service(Auto auto) {

        auto.setKmBisService(auto.KM_BIS_SERVICE);
        Fahrer fahrer = auto.getFahrer();
        System.out.println(ANSI_GREEN + "--- SERVICE ---");
        System.out.printf("Rechnung für: %s, kostet: %d€. ", fahrer.getName(), 350);
        System.out.println(ANSI_RESET);
    }


    public void reifenwechsel(Reifen r, Auto auto) {
        r.setReifenProfil(auto.REIFENPROFIL_NEU);

        System.out.println(ANSI_YELLOW + "--- REIFENWECHSELN ---");
        System.out.printf("Der Reifenwechsel für %s kostet %d€ ", r.getName(), 200);
        System.out.println(ANSI_RESET);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

}
