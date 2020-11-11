package at.dcv.w05.zooMarkus;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class Tiere {
    private static Random random = new Random();
    private String name;
    private String gattung;
    private Futter futter;
    private double futtermenge;
    private int gesundheit;
    private Gehege gehege;

    public Tiere(String gattung, String name, Futter futter, double futtermenge, int gesundheit, Gehege gehege)
    {
        this.name = name;
        this.gattung = gattung;
        this.futter = futter;
        this.futtermenge = futtermenge;
        this.gesundheit = gesundheit;
        this.gehege = gehege;
    }

    public Futter getFutter()
    {
        return futter;
    }

    public double getFuttermenge()
    {
        return futtermenge;
    }

    public String getName()
    {
        return name;
    }

    public int getGesundheit()
    {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit)
    {
        this.gesundheit = gesundheit;
    }

    public String getGattung()
    {
        return gattung;
    }

    public String toString()
    {
        return this.name;
    }

    public void beissen()
    {
        Vector<Tiere> opferListe = new Vector<Tiere>();
        String nameOpfer = "";
        int schaden = 0;
        int anzahlTiereInGehege = gehege.getTierListe().size();
        if (anzahlTiereInGehege > 1)
        {
            int counter = 0;    //counter sorgt dafür, dass das Tier im Gehege nur einmal pro Tag ein Tier beissen kann
                                //ohne counter hat das Tier die Change pro Tag jedes andere Tier im Gehege zu beissen

            for (Tiere tiere : gehege.getTierListe())
            {   //überprüft ob das Tier nicht sich selbst ist, damit sich das Tier nicht selbst beisst
                if (!this.equals(tiere) && counter >= 0)
                {
                    counter++;
                    //Wahrscheinlichkeit 30%
                    int r = random.nextInt(10);

                    if (r >= 1 && r <= 3)
                    {
                        //erstellt eine Liste der anderen Tiere im Gehege
                        for (int i = 0; i < gehege.getTierListe().size(); i++)
                        {
                            if (!this.name.equalsIgnoreCase(gehege.getTierListe().get(i).toString()))
                            {
                                opferListe.add(gehege.getTierListe().get(i));
                            }
                        }
                        int anzahlOpfer = opferListe.size();
                        //wählt ein zufälliges Tier in der Liste aus
                        int r2 = random.nextInt(anzahlOpfer);
                        Tiere opfer = opferListe.get(r2);
                        nameOpfer = opfer.getName();

                        //Schaden beim Beissen
                        int r3 = random.nextInt(20) + 1;
                        schaden = r3;
                        opfer.setGesundheit(opfer.getGesundheit() - r3);
                        System.out.println(this.name + " hat " + nameOpfer + " für " + schaden + " Schaden gebissen");
                        opferListe.clear();


                        //wenn ein Tier gebissen wird und seine HP unter 0 fallen soll es gelöscht werden WIP
                        //Iterator ?!
                        if (opfer.getGesundheit() < 1)
                        {
                            //gehege.getTierListe().remove(opfer);
                            System.out.println(nameOpfer + " wurde von " + this.name + " gefressen");

                        }
                    }
                }
            }
        }
    }

}