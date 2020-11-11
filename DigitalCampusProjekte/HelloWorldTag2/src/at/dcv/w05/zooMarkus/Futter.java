package at.dcv.w05.zooMarkus;

import java.util.Vector;

public class Futter {
    private String name;
    private int futterBestand;

    public Futter(String name)
    {
        this.name = name;
        this.futterBestand = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getFutterBestand()
    {
        return futterBestand;
    }

    public String toString()
    {
       return this.name;
    }



}
