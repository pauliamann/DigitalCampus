package at.dcv.w08.ZooErweiterung;

import java.util.Random;

public class Tier {
    private static Random random = new Random();

    private String name;
    private String gattung;
    private Futter lieblingsFutter;
    private double futterBedarf;
    private int gesundheit;

    public Tier(String gattung, String name, Futter futter, double futterBedarf, int gesundheit)
    {
        this.gattung = gattung;
        this.name = name;
        this.futterBedarf = futterBedarf;
        this.gesundheit = gesundheit;
        this.lieblingsFutter = futter;
    }

    public void setGesundheit(int gesundheit)
    {
        this.gesundheit = gesundheit;
    }

    public String getGattung() {
        return gattung;
    }


    public int getGesundheit()
    {
        return gesundheit;
    }

    public double getFutterBedarf() {
        return futterBedarf;
    }

    public String getName()
    {
        return name;
    }

    public void printTierStruktur()
    {
        String prefix = "   ";
        System.out.println(prefix + "Tierstruktur:");
        System.out.println(prefix + "Tiername: " + name + " Gattung : " + gattung);

    }

    public void simulateOneDayFuettern(Pfleger pfleger)
    {
        System.out.println(pfleger.getName() + " füttert " + name);
        lieblingsFutter.futterAusgabe(futterBedarf);

        if (!pfleger.getLieblingsGattung().equals(gattung))
        {
            if (random.nextInt(100) < 20)
            {
                System.out.println(pfleger.getName() + " bewundert " + name);
            }
        }
        else
        {
            if (random.nextInt(100) < 55)
            {
                System.out.println(pfleger.getName() + " bewundert sein Lieblingstier " + name);
            }
        }
    }

    public void simulateOneDayBeissen(Gehege gehege)
    {
        if ((random.nextInt(100) < 30) && (gesundheit > 0))
        {
            Tier otherTier = gehege.getRandomTier();
            if (otherTier != null && !otherTier.equals(this))
            {
                otherTier.gesundheit = Math.max(0, otherTier.gesundheit - random.nextInt(21));
                System.out.println(otherTier.name + " wurde von " + this.name + " gebissen. Rest Gesundheit: " + otherTier.gesundheit);

                if (otherTier.gesundheit == 0)
                {
                    System.out.println("Das tote Tier " + otherTier.name + " wurde aus dem Zoo entfernt");
                    gehege.removeTier(otherTier);
                }
            }
        }
    }
}
