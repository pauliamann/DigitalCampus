package at.dcv.w08.ZooErweiterung;

import java.util.Random;

public class TierArzt extends Mitarbeiter{

    private static Random random = new Random();

    public TierArzt(String name, String beruf)
    {
        super(name, beruf);
    }



    public void simulateHeilen(Tier tierInNot)
    {
        int heilWert = random.nextInt(41) + 10;
        tierInNot.setGesundheit(Math.min(100, tierInNot.getGesundheit() + heilWert));
        System.out.println(tierInNot.getName() + " wurde auf " + tierInNot.getGesundheit() + " von " + getName() + " geheilt");
    }
}
