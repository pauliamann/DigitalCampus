package at.dcv.w04;

import java.io.*;
import java.util.Scanner;

public class W04Tag4CSVAuswertenLukas {
    public static void main(String[] args) {
        checkPreconditions(args);

        // Einlesen der Datei über buffered reader; (der Buffered Reader liest so lange bis er das Zeilenende erreicht.) (der Filereader liest Zeichen für Zeichen)
        // Kann Zeile für Zeile lesen.
        BufferedReader fis = null;
        try {
            // BufferedReader -> Lesen von Zeilen  mithilfe eines anderen Readers
            // Filereader -> Lesen von Zeichen aus Datei
            fis = new BufferedReader(new FileReader(args[0]));
            String line = null;
            String text = "";

            // line wird der Wert aus fis.readline() zugewiesen.
            // Die komplette Zuweisung (line = fis.readline()) hat den Wert der zugewiesen wurde.
            // Deswegen können wir auf null prüfen.
            while ((line = fis.readLine()) != null) {
                text += line;  //hier wird der ausgelesene Text in einen String gespeichert. Nach jeder line wird ein "\n" zugefügt.
                text += "\n";
            }

        } catch (IOException exc) {
            exc.printStackTrace();
        } finally { // Hier sagen wir dass das Programm beendet werden soll.
            // finally wird immer ausgeführt.
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException exc) {
                    //noop
                }
            }
        }
    }

    public static void checkPreconditions(String[] args) {
        // Prüfen ob ein Argument dem Programm mitgegeben wurde;
        // Das Argument sollte unsere CSV Datei sein;
        // Im args Array stehen alle übergebenen Argumente.
        if (args.length < 1) {
            System.out.println("Bitte gib eine Datei ein");
            // Wir beenden das Programm mit einem Statuscode ungleich 0 -> Fehler.
            System.exit(1); // Status 1 bedeutet, dass ein Fehler auftritt, 0 bedeutet es ist erfolgreich.
        }

        // Prüfen ob Datei existiert
        String filename = args[0];
        // Erstellen eines File Objekts aus dem Dateinamen
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("Die Datei existiert nicht... ");
            System.exit(1);
        }
    }

}
