package at.dcv.w05.zooMarkus;

import java.util.Random;
import java.util.Vector;

public class Pfleger {
    private String name;
    private String gattung;
    private Vector<Gehege> meineGehege;

    Random random = new Random();

    public Pfleger(String name, String gattung)
    {
        this.name = name;
        this.gattung = gattung;
        this.meineGehege = new Vector<Gehege>();
    }

    public String getName()
    {
        return name;
    }

    public Vector<Gehege> getMeineGehege()
    {
        return meineGehege;
    }

    public String getGattung()
    {
        return gattung;
    }

    public String toString()
    {
        return "- " + this.name;
    }

    public void fuettern(Vector<Gehege> gehegeListe)
    {
        double benoetigteFuttermenge = 0;

        //dursucht alle Geheger die dem Pfleger zugeteilt sind
        for (Gehege h : meineGehege)
        {
            for (Tiere z : h.getTierListe())
            {
                benoetigteFuttermenge += z.getFuttermenge();
            }
            String nameFutter = h.getTierListe().get(0).getFutter().toString();
            System.out.println(this.getName() + " hat heute im Gehege: " + h.getName() + " " + benoetigteFuttermenge + "kg " + nameFutter + " gebraucht.");
        }
    }

    public void bewundern()
    {
        for (Gehege x : meineGehege)
        {
            for (Tiere y : x.getTierListe())
            {   //überprüft ob Pfleger Lieblingsgattung die gleiche ist wie von dem Tier
                if (this.getGattung().equalsIgnoreCase(y.getGattung()))
                {
                    int chanceBewundern = random.nextInt(100);
                    if (chanceBewundern <= 54)
                    {
                        System.out.println(this.getName() + " bewundert " + y.getName() + " von seiner Lieblingstierart " + y.getGattung());
                    }
                }
                else
                {
                    int bewundern = random.nextInt(10);
                    if (bewundern < 2)
                    {
                        System.out.println(this.getName() + " bewundert " + y.getName() + " Tierart: " + y.getGattung());
                    }
                }
            }
        }
    }
}
