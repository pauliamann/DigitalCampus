package at.dcv.w06.restaurant;

import org.w3c.dom.html.HTMLImageElement;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import java.util.*;

public class Restaurant {

    private String name;
    private Vector<Tisch> tischListe;
    private Vector<Speise> speiseListe;
    private Vector<Gruppe> gruppenListe;


    public Restaurant(String name) {
        this.name = name;
        tischListe = new Vector<Tisch>();
        speiseListe = new Vector<Speise>();
        gruppenListe = new Vector<Gruppe>();
    }


    public void doAktionen(String name, int anzahl, String aktion, String speise) {
        switch (aktion) {
            case "ANKUNFT":
                System.out.println(name + " ist eingetroffen. Er braucht " + anzahl + " Plätze.");
                Gruppe g = new Gruppe(name, anzahl, aktion, speise);
                tischReservierung(g);
                System.out.println();

                break;
//             Damit Bestellung und Zahlen funktioniert benötigen wir eine Such Funktion (suche tisch bei Gruppe)

            case "BESTELLUNG":  // bestellen was(..) und summe auf Rechnungssumme auf Tisch stellen.
                //System.out.println(name + " was wollen sie essen?");
                Tisch tb = searchTischBeiGruppenName(name);
                Speise sb = searchSpeiseBeiName(speise);

                if (tb != null && sb != null) {
                    tb.speiseZuRechnung(sb);
//                    tb.getSummeRechnung(); // hier wurde die Rechnung geschrieben
                }
                break;

            case "ZAHLEN":
                System.out.println(name + ": \"Bezahlen bitte\"");
                Tisch t = searchTischBeiGruppenName(name);
                if (t != null) {
                    // tische leeren funktion fehlt

                    System.out.println(t.getGruppe().getName() + " hat " + t.getSummeRechnung() + " gezahlt." /* Tischkonsum*/);
                    t.setSummeRechnung(0.0f);
                    t.setGruppe(null); // damit sind die Gäste wieder vom Tisch entfernt
                }
                System.out.println();
                break;
            default:
                break;
        }
    }

    // diese Funktion benötigen wir für die Switch funktion bei doAktion
    public Tisch searchTischBeiGruppenName(String name) {
        for (Tisch t : tischListe) {
            if ((t.getGruppe() != null) && t.getGruppe().getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Speise searchSpeiseBeiName(String speisenname) {
        for (Speise s : speiseListe) {
            // wenn Wunschspeise in speisenliste enthalten:
            if (s.getName().equals(speisenname)) {
                return s;
            }
        }
        System.out.println("die speise " + speisenname + " haben wir nicht.");
        return null;
    }


    public Tisch searchAndCreateTisch(String nameTisch, int sitzPlaetze) {
        for (Tisch tisch : tischListe) {
            if (tisch.getName().equals(nameTisch)) {
                return tisch;
            }
        }

        Tisch t = new Tisch(nameTisch, sitzPlaetze);
        tischListe.add(t);
        return t;
    }

    public Speise searchAndCreateSpeise(String nameSpeise, float preis, float selbstkosten) {

        for (Speise s : speiseListe) {
            if (s.getName().equals(nameSpeise)) {
                return s;
            }
        }

        Speise s = new Speise(nameSpeise, preis, selbstkosten);
        speiseListe.add(s);
        return s;

    }

    public Gruppe searchAndCreateGruppe(String nameGruppe, int teilnehmer, String aktion, String speise) {

        for (Gruppe g : gruppenListe) {
            if (g.getName().equals(nameGruppe)) {
                return g;
            }
        }
        Gruppe g = new Gruppe(nameGruppe, teilnehmer, aktion, speise);
        gruppenListe.add(g);
        return g;
    }


    public void tischReservierung(Gruppe newGruppe) // Funktioniert
// Hier wird die ideale Tischgröße zur Gruppengröße gefunden
    {
        Tisch bestTisch = null;


        for (int i = 0; i < tischListe.size(); i++) {
            if (tischListe.get(i).getSitzplaetze() >= newGruppe.getAnzahl() && tischListe.get(i).getGruppe() == null) {
                if (bestTisch == null) {
                    bestTisch = tischListe.get(i);
                } else {
                    if (bestTisch.getSitzplaetze() > tischListe.get(i).getSitzplaetze()) {
                        bestTisch = tischListe.get(i);
                    }
                }
            }
        }
        if (bestTisch != null) {
            System.out.println(
                    "Wir hätten " +
                            bestTisch.getName() +
                            " (" + bestTisch.getSitzplaetze() + ") " +
                            " für Sie frei, Herr " + newGruppe.getName() +
                            " (" + newGruppe.getAnzahl() + ") "
            );
            bestTisch.setGruppe(newGruppe);
        } else {
            System.out.println("Wir haben leider keinen freien Tisch für Sie Herr" + newGruppe.getName());
        }
    }

    public void alleGruppenzuweisen() {
        System.out.println("--- Gruppen Zuweisen ---");
        for (Gruppe g : gruppenListe) {
            tischReservierung(g);
        }
    }

    public void addTisch(Tisch newTisch) {
        tischListe.add(newTisch);
    }

    public void addSpeise(Speise newSpeise) {
        speiseListe.add(newSpeise);
    }

    public void addGruppe(Gruppe newGruppe) {
        gruppenListe.add(newGruppe);
    }

    public void printRestaurantStruktur() {
        System.out.println("Restaurant:" + name);
        System.out.println("");
        System.out.println("--- --- Tische --- --- ");
        for (Tisch t : tischListe) {
            System.out.println("   " + t.toString());
        }
        System.out.println("");
        System.out.println("--- --- Speisen --- --- ");
        for (Speise s : speiseListe) {
            System.out.println("  " + s.toString());
        }
        System.out.println("");
        System.out.println("--- --- Gruppen --- --- ");
        for (Gruppe g : gruppenListe) {
            System.out.println("  " + g.toString());
        }
        System.out.println("");


    }


}
