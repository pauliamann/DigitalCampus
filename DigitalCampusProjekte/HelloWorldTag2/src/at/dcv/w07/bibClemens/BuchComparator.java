package at.dcv.w07.bibClemens;


import java.awt.*;
import java.util.Comparator;

//wie vergleicht man Bücher zum sortieren
public class BuchComparator implements Comparator<Buch>
{
    @Override
    public int compare(Buch b1, Buch b2)
    {

        if (b1.getAnfragen() < b2.getAnfragen())
        {
            return 1;
        }
        if (b1.getAnfragen() == b2.getAnfragen())
        {
            return 0;
        }
        if (b1.getAnfragen() > b2.getAnfragen())
        {
            return -1;
        }

        //negativ wenn b1 < b2

        // 0 wenn b1 == b2

        // positiv wenn b1 > b2
        return 0;
    }
}
