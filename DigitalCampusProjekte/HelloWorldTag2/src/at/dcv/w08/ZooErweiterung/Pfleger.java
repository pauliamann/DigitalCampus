package at.dcv.w08.ZooErweiterung;

import java.util.Vector;

public class Pfleger extends Mitarbeiter{

    private String lieblingsGattung;
    private Vector<Gehege> zustandigeGehege;


    public Pfleger(String name, String lieblingsGattung, String beruf)
    {
        super(name, beruf);
        this.lieblingsGattung = lieblingsGattung;
        this.zustandigeGehege = new Vector<Gehege>();
    }

    public String getLieblingsGattung()
    {
        return lieblingsGattung;
    }

    public void addGehege(Gehege neueZustandigeGehege)
    {
        if (!zustandigeGehege.contains(neueZustandigeGehege))
        { //zustandigegehege nicht gleich wie neuezustandigegehege ist erstellt es einen neuen.
            this.zustandigeGehege.add(neueZustandigeGehege);
        }

    }

    public void printPflegerStruktur()
    {
        System.out.println("Pflegername : " + getName() + " Lieblingsgattung : " + lieblingsGattung);
        for (Gehege gehege : zustandigeGehege)
        {
            System.out.println("Zuständige Gehege : " + gehege.getName() + ", Beruf: " + getBeruf());
        }
    }
    public void simulateOneDayFuettern()
    {
        System.out.println("Pfleger " + getName() + " beginnt seine Schicht.");
        for (Gehege gehege: zustandigeGehege)
        {
            gehege.simulateOneDayFuettern(this);
        }
    }
}
