package at.dcv.w05.zoo;


import java.util.Vector;

public class Gehege {

    private String name;
    private Vector<Tiere> tiereListe;


    /* --- Constructor --- */
    public Gehege(String name) {
        this.name = name;
        this.tiereListe = new Vector<Tiere>();
    }

    public void printBeissen() {

        for (Tiere tie : tiereListe) {
            tie.beissen();
        }
    }

    // Todo: wie muss ich das umschreiben, dass ich tote Tiere aus dem Vektor entfernen kann.



    public void sterben() {
// Innerhalb des iterators kann man nicht löschen
        for (Tiere tie : tiereListe) {
            if (tie.getGesundheit() <= 0) {
                System.out.println("Tier: " +this.name + " ist tot und wird aus Vektor entfernt.");
                tiereListe.remove(tiereListe.indexOf(this.name)); // alternativ ohne
            }
        }
    }

    public void addTiere(Tiere newTiere) {
        tiereListe.add(newTiere);
    }

    @Override
    public String toString() {

        return "- Gehege:" + name;
    }

    /* ---  Methoden --- */

    // beissen


    // Futterbedarf berechnen

    public int futterbedarfProTier() {

        int futterbedarfProTier = 0;
        for (Tiere tie : tiereListe) {
            tie.getTagesbedarf();
            futterbedarfProTier += tie.getTagesbedarf();
//            System.out.println("TIE Tagesbedarf: "+ tie.getTagesbedarf());
        }
        return futterbedarfProTier;
    }


    public String futterbedarf() {

        String futterArt = "";
        int futterbedarfProTier = 0;

        for (Tiere tie : tiereListe) {
            futterArt = tie.getFutter();
            tie.getTagesbedarf();
            futterbedarfProTier += tie.getTagesbedarf();
//            System.out.println(tie.getFutter() + " x " + tie.getTagesbedarf());
        }
        return futterArt + " " + futterbedarfProTier;
    }

    public String getAnimalName() {
        String animalName = "";
        for (Tiere tie : tiereListe) {
            animalName = tie.getName();
        }

        return animalName;
    }

    public String getName() {
        return name;
    }

    public int countAnimals() {
        return getTiereListe().size();
    }

    public Vector<Tiere> getTiereListe() {

        return tiereListe;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTiereListe(Vector<Tiere> tiereListe) {
        this.tiereListe = tiereListe;
    }


}
