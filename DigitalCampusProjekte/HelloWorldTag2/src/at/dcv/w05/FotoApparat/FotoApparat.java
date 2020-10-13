package at.dcv.w05.FotoApparat;

import java.util.Arrays;

public class FotoApparat {


    private String bezeichnung;
    private int megaPixel;
    private int brennweite;
    private String herkunftsland;
    private String[] funktionen;
    private String besitzer;
    private String produktBlatt;
    private int speicherPlatz;
    private int freeMemorySize;
    private int savedFotos;
    private final int FOTOSIZE = 5;

    // Constructor initialisieren
    public FotoApparat(String bezeichnung, int megaPixel, int brennweite, String herkunftsland, String[] funktionen, String besitzer, String produktBlatt, int speicherPlatz, int savedFotos) {
        this.bezeichnung = bezeichnung;
        this.megaPixel = megaPixel;
        this.brennweite = brennweite;
        this.herkunftsland = herkunftsland;
        this.funktionen = funktionen;
        this.besitzer = besitzer;
        this.produktBlatt = produktBlatt;
        this.speicherPlatz = speicherPlatz;
        this.savedFotos = savedFotos;
    }

    public String toString () {
        String returnValue =
                "Bezeichnung: " + bezeichnung +
                " Megapixel: " + megaPixel +
                " Brennweite: " + brennweite +
                " Herkunftsland: " + herkunftsland +
                " funktionen: " + Arrays.toString(funktionen) +
                " produktblatt: " + produktBlatt +
                " Speicherplatz: " + speicherPlatz;

        return returnValue;
    }

 // get
    public int getFreeMemorySize() {
        freeMemorySize = speicherPlatz-savedFotos*FOTOSIZE;
        return freeMemorySize;
    }

    public String getProduktBlatt() {

        produktBlatt ="Produktblatt: " +  bezeichnung + "\n" +
                "Megapixel: " + megaPixel +
                " | Brennweite: " + brennweite +
                " | Herkunftsland: " + herkunftsland +
                " | Funktionen: " + Arrays.toString(funktionen)
                + "\n";
        return produktBlatt;
    }

// Set
    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

}

