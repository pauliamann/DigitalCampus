package at.dcv.w05.zooMarkus;

import java.sql.SQLOutput;
import java.util.Random;

public class Tierarzt {
    private static Random random = new Random();
    private String name;
    private String gattung;

    public Tierarzt(String name, String gattung)
    {
        this.name = name;
        this.gattung = gattung;
    }

    public String getName()
    {
        return name;
    }

    public String getGattung()
    {
        return gattung;
    }

    public void bewundern(Zoo zoo)
    {
        for (Gehege x : zoo.getGehege())
        {
            for (Tiere y : x.getTierListe())
            {
                if (this.getGattung().equalsIgnoreCase(y.getGattung()))
                {
                    int chanceBewundern = random.nextInt(100);
                    if (chanceBewundern <= 54)
                    {
                        System.out.println(this.getName() + " bewundert " + y.getName() + " von ihrer Lieblingstierart " + y.getGattung());
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

    public void heilen(Zoo zoo)
    {
        //Holt über den Zoo die liste der Gehege, in den Gehegen die Liste der Tiere, tier mit kleinster HP finden, dann um 10-50 heilen
        Tiere kleinstHPTier = null;
        for (Gehege currentGehege : zoo.getGehege())
        {
            for (Tiere tier : currentGehege.getTierListe())
            {
                if (kleinstHPTier == null)
                {
                    kleinstHPTier = tier;
                }       //vergleicht alle Tiere und speicher das Tier mit wenigsten HP in kleinstHPTier
                else if (kleinstHPTier.getGesundheit() > tier.getGesundheit())
                {
                    kleinstHPTier = tier;
                }
            }
        }

        int gesundheitTier = kleinstHPTier.getGesundheit();
        if (gesundheitTier == 100)
        {
            System.out.println("Heute waren keine Tiere verletzt.");
        }
        else if (gesundheitTier < 100)
        {   //Anzahl HP die der Arzt heilen kann
            int heilen = random.nextInt(41) + 10;
            if ((gesundheitTier + heilen) <= 100)
            {
                kleinstHPTier.setGesundheit(gesundheitTier + heilen);
            }   //falls der Arzt mehr als 100 HP heilen würde, wird hier auf 100 HP begrenzt
            else if ((gesundheitTier + heilen) > 100)
            {
                kleinstHPTier.setGesundheit(100);
            }
            System.out.println(this.name + " hat heute " + kleinstHPTier.getName() + " um " + heilen + " HP geheilt\n" + kleinstHPTier.getName() + " HP vorher: " + gesundheitTier + " HP nacher: " + kleinstHPTier.getGesundheit());
        }
    }

    public String toString()
    {
        return this.name;
    }
}
