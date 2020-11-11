package at.dcv.w05.zooMarkus;

import java.util.Vector;

public class Zoo {

    /*

    Der Zoo hat Gehege
    Gehege haben Tiere
    Pfleger haben Gehege
    Tiere bekommen Futter

    1. Simulation basiert auf einen Tag (Tag 1 , Tag 2, Tag 3.... )
    2. Tiere haben Futterbedarf (Menge, Futtersorte)
    3. Pfleger kümmern sich um Gehege und füttern Tiere
    4. Tiere haben Gesundheit (0 - 100)
        Tiere mit 0 Gesundheit werden entfernt
    5. Tiere beißen sich mit 30% Wahrscheinlichkeit pro (wenn sie sich beißen Schaden 0 - 20 )
        Tiere beißen sich nicht selbst
        Tiere beißen nur Tiere in ihrem Gehege
    6. Tierarzt heilt 1 Tier am Tag im Zoo (Tier mit wenigsten HP)
        heilt 10 - 50 HP
    7. Pflegepersonal hat ein Lieblingsgattung
        haben 20% Chance ein Tier zu bewundern wenn Sie damit arbeiten (sout Ausgabe "Ich bewundere 'Tiername'")
        50% Chance wenn Sie mit der Lieblingsgattung arbeiten
        Pfleger können nur Tiere bewundern von ihrem zugewiesenem Gehege
    8. Am Ende des Tages Statistik von verwendetem Futter
           (Tabelle mit dynamischer Spaltengröße)
    9. einlesen CSV Datei der Tiere


    Tiere haben (Name, Gattung.... beides String)

    Pflege
    Liste Gehege

    Pfleger hat einen String was ist meine Lieblingsgattung

    7 Klassen:
                Zoo
                Gehege
                Tier
                Pfleger
                Tierarzt
                Futter
                Main/Programm

        Simulation:
        alle Pfleger füttern
        Tiere beißen
        Tierarzt heilt

------------------------------------------------------------------------------

    Zoo:
    --------------------------------------------------
    -String Name
    -int Tag (Zeit für die Simulation max 30 Tage)
    -Vector<Gehege>
    -Tierarzt
    -Vector<Pfleger>
    -Vector<Futtertyp>
    ------------------------------------------------------------------------
    Funktionen:
    -Zoo Constructor
    -simulation() ges. Zoo (muss nicht wissen wieviele Tiere (Gehege muss))
    -Futterangabe
    -Bedarfsliste(Tagesbedarf Futter)
    -addGehege
    -addTierarzt
    -addPfleger
    -addFutter


    Gehege:
    --------------------------
    -Vector<Tiere>
    -String name
    --------------------------
    Funktionen:
    -Gehege Constructor
    -simulation() Tiere beißen
    -addTier


    Tiere:
    ---------------------------
    -String name
    -String gattung
    -Futter
    -int wievielFutter pro Tag
    -int Gesundheit
    -Gehege
    ---------------------------
    Funktionen:
    -Contructor Tier
    -addGehege
    -simulation() beißen
    -heilen() HP rauf wenn Tierarzt max



    ---------------------------------------------------
    | Zuerst statische dann dynamische Punkte machen! |
    ---------------------------------------------------
     */

    private String name;
    private Tierarzt tierarzt;
    private Vector<Gehege> gehege;
    private Vector<Pfleger> listePfleger;


    public Zoo(String name)
    {
        this.name = name;
        this.tierarzt = tierarzt;
        this.gehege = new Vector<Gehege>();
        this.listePfleger = new Vector<Pfleger>();
    }

    public Vector<Gehege> getGehege()
    {
        return gehege;
    }

    public Vector<Pfleger> getListePfleger()
    {
        return listePfleger;
    }

    public Tierarzt getTierarzt()
    {
        return tierarzt;
    }

    public void addGehege(Vector<Gehege> gehegeListe)
    {
        for (Gehege x : gehegeListe)
        {
            this.gehege.add(x);
        }
        //this.gehege.addAll(gehegeListe); //andere Schreibweise
    }

    public void addPersonal(Vector<Vector> rawData, Vector<Gehege> gehegeListe)
    {
        for (Vector x : rawData)
        {
            if (x.get(1).toString().equalsIgnoreCase("Tierartz"))
            {
                String name = x.get(0).toString();
                String lieblingsTier = x.get(3).toString();
                Tierarzt tmp1 = new Tierarzt(name, lieblingsTier);
                this.tierarzt = tmp1;
            }
            //überprüft ob es den Pleger bereits in der Pflegerliste gibt
            int counterPfleger = 0;
            if (!(listePfleger == null))
            {
                for (Pfleger a : listePfleger)
                {
                    if (x.get(0).toString().equalsIgnoreCase(a.getName()))
                    {
                        counterPfleger++;
                    }
                }
            }
             //erstellt einen neuen Pfleger wenn es noch keine Pfleger in der Pflegeliste gibt, oder es den aktuellen Pfleger noch nicht in der Pflegerliste gibt
            //Person wird ein Pfleger wenn in der Zeile der Datei "Pflege" steht
            if (listePfleger == null && x.get(1).toString().equalsIgnoreCase("Pflege") || x.get(1).toString().equalsIgnoreCase("Pflege") && counterPfleger == 0)
            {
                String name = x.get(0).toString();
                String lieblingsTier = x.get(3).toString();
                Pfleger tmp = new Pfleger(name, lieblingsTier);

                for (Vector w : rawData)
                {
                    for (Gehege q : gehegeListe)
                    {
                        //wenn der Name des Pfleger gleich ist wie der Name des Pfleger der CSV Datei UND Ple
                        if (w.get(0).toString().equalsIgnoreCase(tmp.getName()))
                        {
                            if (q.getName().equalsIgnoreCase(w.get(2).toString()))
                            {
                                tmp.getMeineGehege().add(q);
                            }
                        }
                    }
                }
                this.listePfleger.add(tmp);
            }
        }
    }

    public Vector<Gehege> namenListeGehege(Vector<Vector> rawData)
    {
        Vector<String> namen = new Vector<String>();
        for (int i = 1; i < rawData.size(); i++)
        {
            if (!namen.contains(rawData.get(i).get(5)))
            {
                namen.add(rawData.get(i).get(5).toString());
            }
        }
        Vector<Gehege> namenListeGehege = new Vector<Gehege>();
        for (String x : namen)
        {
            Gehege tmp = new Gehege(x);
            namenListeGehege.add(tmp);
        }
        return namenListeGehege;
    }

    public String toString()
    {
        return "Der Zoo hat " + this.gehege.size() + " Gehege\n" + "Der Arzt des Zoos: " + this.tierarzt + "\n" + "Pfleger: " + this.listePfleger.size();
    }

    public String getInfoTiereAnzahl()
    {
        int gesAnzahlTiere = 0;

        for (Gehege element : gehege)
        {
            gesAnzahlTiere += element.getTierListe().size();
        }

        return "Es gibt " + gesAnzahlTiere + " Tiere im Zoo";
    }

    public void getInfoArzt()
    {
        System.out.println(this.tierarzt.getName());
    }

    public void getInfoPfleger()
    {
        for (Pfleger x : this.listePfleger)
        {
            System.out.println(x.getName() + " " + x.getGattung());
        }
    }
}