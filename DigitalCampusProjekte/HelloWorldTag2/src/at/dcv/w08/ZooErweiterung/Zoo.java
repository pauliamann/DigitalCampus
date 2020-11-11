package at.dcv.w08.ZooErweiterung;


import java.util.Vector;

public class Zoo {
    private static Zoo currentZoo = null;

    private String name;
    private Vector<Gehege> gehegeListe;
    private TierArzt tierArzt;
    private Vector<Pfleger> pflegerListe;
    private Vector<Futter> futterListe;
//    private Vector<Mitarbeiter> mitarbeiterListe;

    public Zoo(String name)
    {
        this.gehegeListe = new Vector<Gehege>();
        this.pflegerListe = new Vector<Pfleger>();
        this.futterListe = new Vector<Futter>();
//        this.mitarbeiterListe = new Vector<Mitarbeiter>();
        this.tierArzt = null;
        this.name = name;

    }

    /* diese Funktion benötigen wir für die erweiterung der klasse Giraffe, die eine Erweiterung von Saeugetier ist.
    *
    * Das nennt man "Singelton (Pattern)
    *
    * Damit wird ein Zoo erstellt der von überall aus erreichbar ist.
    *
    * */
    public static Zoo getZoo() {
        if (currentZoo == null){

            currentZoo = new Zoo("My little Zoo");
        }
        return currentZoo;
    }

    public Futter searchAndCreateFutter(String neueFutter)
    {
        for (Futter futter : futterListe)
        {
            if (futter.getName().equals(neueFutter))
            {  // Überspringt wenn es zweimal gleiche Futter Typ gibt. Kontrolliert also ob es z.n Fleisch zweimal gibt.
                return futter;
            }
        }
        Futter f = new Futter(neueFutter);
        futterListe.add(f);
        return f;
    }

    public Gehege searchAndCreateGehege(String neueGehege)
    {
        for (Gehege gehege : gehegeListe)
        {
            if (gehege.getName().equals(neueGehege))
            {  // Überspringt wenn es zweimal gleiche Gehege Typ gibt.
                return gehege;
            }
        }
        Gehege g = new Gehege(neueGehege);
        gehegeListe.add(g);
        return g;
    }

    public Pfleger searchAndCreatePfleger(String neuePfleger, String lieblingsGattung, String beruf)
    {
        for (Pfleger pfleger : pflegerListe)
        {
            if (pfleger.getName().equals(neuePfleger))
            {  // Überspringt wenn es zweimal gleiche Pfleger Typ gibt.
                return pfleger;
            }
        }
        Pfleger p = new Pfleger(neuePfleger, lieblingsGattung, beruf);
        pflegerListe.add(p);
//        mitarbeiterListe.add(p);
        return p;
    }

    public TierArzt searchAndCreateTierArzt(String neueTierarzt, String beruf)
    {

        TierArzt t = new TierArzt(neueTierarzt, beruf);
        tierArzt = t;
//        mitarbeiterListe.add(t);
        return t;
    }

    public void printFutterBedarf()
    {
        System.out.println("Futterbedarf : ");
        for (Futter futter : futterListe)
        {
            System.out.println(futter.getName() + " " + futter.getBedarf() + "kg");
        }
    }

    public void printZooStruktur()
    {
        System.out.println("Zoostruktur: ");
        System.out.println(" Name: " + name);
        System.out.println();
        System.out.println("Gehege: ");
        for (Gehege gehege : gehegeListe)
        {
            gehege.printGehegeStruktur();
            System.out.println();
        }
        System.out.println();

        System.out.println("Pfleger: ");
        for (Pfleger pfleger : pflegerListe)
        {
            pfleger.printPflegerStruktur();
        }
        System.out.println();
        System.out.println("xx-Tierarzt: " + tierArzt.getName() + " Beruf: " + tierArzt.getBeruf());

//        System.out.println("Mitarbeiterstruktur:");
//        for (Mitarbeiter m : mitarbeiterListe) {
//
//            System.out.println(m);
//        }

    }

    public void simulateOneDay(int tag)
    {
        System.out.println();
        System.out.println("Tag" + tag);
        for (Pfleger pfleger : pflegerListe)
        {
            pfleger.simulateOneDayFuettern();
        }
        for (Gehege gehege : gehegeListe)
        {
            gehege.simulateOneDayBeissen();
        }
        Tier tierInNot = findeTierKleinsteGesundheit();
        if (tierArzt != null && tierInNot != null)
        {
            if (tierInNot.getGesundheit() < 100)
            {
                tierArzt.simulateHeilen(tierInNot);
            }
            else
            {
                System.out.println(tierArzt.getName() + " macht heute blau.");
            }
        }
    }

    public Tier findeTierKleinsteGesundheit()
    {
        Tier minHPTier = null;

        for (Gehege gehege : gehegeListe)
        {
            if (minHPTier == null)
            {
                minHPTier = gehege.findeTierKleinsteGesundheit();
            }
            else
            {
                Tier vergleichTier = gehege.findeTierKleinsteGesundheit();
                if (vergleichTier != null && minHPTier.getGesundheit() > vergleichTier.getGesundheit())
                {
                    minHPTier = vergleichTier;
                }
            }
        }
        return minHPTier;
    }

}
