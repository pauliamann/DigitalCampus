package at.dcv.w07.bibClemens;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class main {
    public static void main(String[] args) throws IOException, ParseException
    {

        Bibliothek b = new Bibliothek();
        b.importBooks("C:\\Users\\DCV\\Desktop\\Bibliothek\\Bucher.csv");

        //b.printAllBooks();

        Vector<Aktion> aktionen = parseAktionen();

        for (Aktion a : aktionen)
        {
            a.execute(b);
        }

/*        System.out.println("Statistik:");
        System.out.println();
        b.printStatistic();*/

/*        Date heute = new Date();
        System.out.println();
        System.out.println("************************************************");
        System.out.println();
        System.out.println("Mahnungen zum heutigen Datum: " + heute);
        System.out.println();
        b.mahnungen(heute);*/

        //b.printAllBooks();


    }

    private static Vector<Aktion> parseAktionen() throws IOException, ParseException
    {
        List<String> aktionList = Files.readAllLines(Path.of("C:\\Users\\DCV\\Desktop\\Bibliothek\\BibliothekAktion.csv" ));

        Vector<Aktion> aktionen = new Vector<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (int i = 1; i < aktionList.size(); i++)
        {
            String line = aktionList.get(i); // Definiert jede einzelne Linie
            String[] fields = line.split(";"); // Speichert jede Linie in einem String Array

            if ( fields.length >= 4)
            {

                Aktion a = new Aktion();

                a.setDatum(dateFormat.parse(fields[0]));
                a.setAktion(fields[1]);
                a.setName(fields[2]);
                a.setBvNr(fields[3]);
                if (fields.length == 5)
                {
                    a.setSuchTxt(fields[4]);
                }

                aktionen.add(a);   // befüllt den Vector aktionen mit den jeweiligen Objekten
            }
        }


        return aktionen;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
}
