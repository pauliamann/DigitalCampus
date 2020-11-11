package at.dcv.w05.zooMarkus;

import java.util.Vector;

public class Gehege{
    private String name;
    private Vector<Tiere> tierListe;
    private Vector<Futter> futtertyp = new Vector<Futter>();


    public static Vector<Futter> namenListeFutter(Vector<Vector> rawData)
    {
        Vector<String> namen = new Vector<String>();
        for (int i = 1; i < rawData.size(); i++)
        {
            if (!namen.contains(rawData.get(i).get(2)))
            {
                namen.add((String) rawData.get(i).get(2));
            }
        }
        Vector<Futter> namenListeFutter = new Vector<Futter>();
        for (String x:namen)
        {
            Futter tmp = new Futter(x);
            namenListeFutter.add(tmp);
        }
        return namenListeFutter;
    }

    public void addFutteryp(Vector<Futter> futterListe)
    {
        for (Futter x:futterListe)
        {
            this.futtertyp.add(x);
        }
    }

    public String toString()
    {
        return this.name;
    }

    public Gehege(String name)
    {
        this.name = name;
        this.tierListe = new Vector<Tiere>();
    }

    public String getName()
    {
        return name;
    }

    public void addTier(Tiere tierName)
    {
        this.tierListe.add(tierName);
    }

    public Vector<Tiere> getTierListe()
    {
        return tierListe;
    }

    public static void addTiere(Vector<Vector> rawData, Vector<Futter> futterListe, Vector<Gehege> gehegeListe)
    {
        for (Vector x : rawData)
        {
            for (Futter z:futterListe)
            {
                if (x.get(2).toString().equalsIgnoreCase(z.toString()))
                {
                    for (Gehege h:gehegeListe)
                    {
                        if (x.get(5).toString().equalsIgnoreCase(h.toString()))
                        {
                            String gattung = x.get(0).toString();
                            String name = x.get(1).toString();
                            Futter futter = z;
                            double futtermenge = Double.parseDouble(x.get(3).toString());
                            int gesundheit = Integer.parseInt(x.get(4).toString());
                            Gehege gehege = h;
                            Tiere tmp = new Tiere(gattung,name,futter,futtermenge,gesundheit,gehege);
                            //tierListeGesamt.add(tmp);
                            h.tierListe.add(tmp);
                        }
                    }
                }
            }
        }
    }
}
