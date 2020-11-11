package at.dcv.w05.zooMarkus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Program {
    public static void main(String[] args)
    {

        if (args.length == 0)
        {
            System.out.println();
            System.out.println("----------FEHLER----------");
            System.out.println("Es fehlen noch beide Dateipfade für Tiere.CSV und Personal.CSV bei den Argumenten");
        }
        else if (args.length == 1)
        {
            System.out.println();
            System.out.println("----------FEHLER----------");
            System.out.println("Es fehlt noch ein Dateipfad für Tiere.CSV oder Personal.CSV bei den Argumenten");
        }
        else if (!(args[0].contains("Tiere.csv") && args[1].contains("Personal.csv")))
        {
            System.out.println();
            System.out.println("----------FEHLER----------");
            System.out.println("Dateipfad von Tiere.csv muss an der ersten Stelle der Argumente eingetragen werden (args[0])");
            System.out.println("Dateipfad von Personal.csv muss an der zweiten Stelle der Argumente eingetragen werden (args[1])");
        }
        else
        {

            /*
            TODO Fehler beim Löschen von Einträgen im Array, wenn es in einer Schleife nochmals durchläuft, wahrscheinlich Problem mit size (ändert sich durch das löschen)
            TODO siehe beissen Funktion bei Tiere, im Moment können Tiere einfach neg. HP bekommen, kann Tier noch nicht löschen (Iterator?!)
            * */

            //Ein Tier kann pro Tag nur ein anderes Tier in seinem Gehege beissen

            //einlesen und speichern der CSV-Dateien
            Vector<Vector> tiereRaw = einleseFileTiere(args);
            Vector<Vector> personalRaw = einleseFilePersonal(args);
            //entferne Kopfzeile der Daten von Personal.csv
            personalRaw.remove(0);
            Zoo innsbruck = new Zoo("Innsbruck Alpenzoo");


            Vector<Futter> namenListeFutter = Gehege.namenListeFutter(tiereRaw);
            Vector<Gehege> namenListeGehege = innsbruck.namenListeGehege(tiereRaw);

            innsbruck.addGehege(namenListeGehege);
            //entferne Kopfzeile von Daten der Tier.CSV
            tiereRaw.remove(0);

            //füge die Tiere zu den Gehegen (statisch)
            Gehege.addTiere(tiereRaw, namenListeFutter, namenListeGehege);
            //füge das Personal zum Zoo hinzu (nicht statisch)
            innsbruck.addPersonal(personalRaw, namenListeGehege);

            System.out.println();

            //Simulation Zoo start
            int counter = 0;    //Zähler für die Tage

            for (int i = 0; i < 2; i++)
            {
                counter++;
                System.out.println();
                System.out.println("-----------------TAG" + counter + "-----------------");
                System.out.println();
                for (Pfleger x : innsbruck.getListePfleger())
                {
                    x.fuettern(namenListeGehege);
                    System.out.println();
                    x.bewundern();
                    System.out.println();
                }

                //alle beissen sich
                for (Gehege h : namenListeGehege)
                {
                    for (Tiere ok : h.getTierListe())
                    {
                        ok.beissen();
                    }
                }
                //tierarzt heilt
                System.out.println();
                innsbruck.getTierarzt().heilen(innsbruck);
                System.out.println();
            }
            //simulation Ende

           /* System.out.println("------------STATISTIK------------");
            System.out.println("Es gibt im Zoo " + innsbruck.getListePfleger().size() + " Pfleger:");
            for (Pfleger x : innsbruck.getListePfleger())
            {
                System.out.println(x);
            }
            System.out.println();
            System.out.println("Der Zoo hat eine Tierärztin: " + innsbruck.getTierarzt());
            System.out.println();
            System.out.println("Der Zoo hat " + innsbruck.getGehege().size() + " Gehege");*/


        }
    }

    public static Vector<Vector> einleseFileTiere(String[] args)
    {
        Vector<Vector> tiereVector = new Vector<Vector>();
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
            System.out.println("Datei Tiere.csv nicht gefunden");
        }

        if (fis != null)
        {
            Scanner sc = new Scanner(fis);

            while (sc.hasNext())
            {
                Vector<String> tmp = new Vector<String>();
                String[] tmpo = sc.nextLine().split(",");
                for (String xe : tmpo)
                {
                    tmp.add(xe);
                }
                tiereVector.add(tmp);
            }
            try
            {
                fis.close();
            } catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
        return tiereVector;
    }

    public static Vector<Vector> einleseFilePersonal(String[] args)
    {
        Vector<Vector> personalVector = new Vector<Vector>();
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(args[1]);
        } catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
            System.out.println("Datei Personal.csv nicht gefunden");
        }

        if (fis != null)
        {
            Scanner sc = new Scanner(fis);

            while (sc.hasNext())
            {
                Vector<String> tmp = new Vector<String>();
                String[] tmpo = sc.nextLine().split(",");
                for (String xe : tmpo)
                {
                    tmp.add(xe);
                }
                personalVector.add(tmp);
            }
            try
            {
                fis.close();
            } catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
        return personalVector;
    }
}
