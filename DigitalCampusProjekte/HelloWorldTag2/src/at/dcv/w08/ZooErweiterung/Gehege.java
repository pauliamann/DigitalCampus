package at.dcv.w08.ZooErweiterung;
import java.util.Random;
import java.util.Vector;

public class Gehege {
    private static Random random = new Random();

    private String name;
    private Vector<Tier> tierListe;
    private Vector<Tier> toteTiere;


    public Gehege(String name)
    {
        this.name = name;
        this.tierListe = new Vector<Tier>();
        this.toteTiere = new Vector<Tier>();
    }

    public String getName()
    {
        return name;
    }

    public Tier searchAndCreateTiere(String gattung, String name, Futter futter, double futterBedarf, int gesundheit)
    {
        for (Tier tier : tierListe)
        {
            if (tier.getName().equals(name))
            {  // Überspringt wenn es zweimal gleiche Tier Typ gibt.
                return tier;
            }
        }
        Tier t = new Tier(gattung, name, futter, futterBedarf, gesundheit);
        tierListe.add(t);
        return t;
    }

    public void printGehegeStruktur()
    {
        String prefix = "   ";

        System.out.println(prefix + name);
        for (Tier tier : tierListe)
        {
            tier.printTierStruktur();


        }

    }

    public void simulateOneDayFuettern(Pfleger pfleger)
    {
        System.out.println(pfleger.getName() + " arbeitet in " + name);
        for (Tier tier: tierListe)
        {
            tier.simulateOneDayFuettern(pfleger);
        }
    }
    public void simulateOneDayBeissen()
    {
        for (Tier tier: tierListe)
        {
            tier.simulateOneDayBeissen(this);
        }
        for (Tier totesTier: toteTiere)
        {
            tierListe.remove(totesTier);
        }
        toteTiere.clear();
    }
    public Tier getRandomTier()
    {
        if (tierListe.size() > 0)
        {
            return tierListe.get(random.nextInt(tierListe.size()));

        }
        return null;
    }
    public void removeTier(Tier totesTier)
    {
        toteTiere.add(totesTier);
    }
    public Tier findeTierKleinsteGesundheit()
    {
        Tier kleinsteGesundheitTier = null;
        for (Tier tier : tierListe)
        {
            if (kleinsteGesundheitTier == null)
            {
                kleinsteGesundheitTier = tier;
            }
            else
            {
                if (kleinsteGesundheitTier.getGesundheit() > tier.getGesundheit())
                {
                    kleinsteGesundheitTier = tier;
                }
            }
        }
        return kleinsteGesundheitTier;
    }

    public void addTier (Tier t) {
        tierListe.add(t);
    }
}
