package at.dcv.w03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Date;

public class W03Tag3AusgabeInDokument {

    /* --- Neue Logdatei erstellen --- */
    public static void main(String[] args) {
//        writeBinary("C:\\Users\\DCV\\Desktop\\exampleBinary.dat"); // Hier wird bestimmt wo das File dann zu finden ist.
        writeNewTextFile("C:\\Users\\DCV\\Desktop\\exampleNewTextFile.txt");
    }

/*    public static void writeBinary(String filename) {
        try {
            // File erstellen
            FileOutputStream fos = new FileOutputStream(filename); // Hier wird ein neues File mit dem Namen "Filename" erstelle, die wir dann Bearbeiten können.

            // Initialisierung von buffer mit dummy Daten
            byte[] buffer = new byte[256]; // Das hier ist nur ein Beispiel damit überhaupt irgendwas im File steht. Das könnte auch alles andere sein.

            for (int i = 0; i < buffer.length; ++i) { // hier wird mit der for Schleife in das BufferArray Daten reingeschrieben ( 0- 255)
                buffer[i] = (byte)(i % 128);
            }
            // Schreiben des Files
            fos.write(buffer);
            System.out.println("File ist am Desktop abgelegt");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }*/

    // neues TextFile mit Append Text
    public static void writeNewTextFile(String filename) {
        try {
            // File erstellen
            FileOutputStream fos = new FileOutputStream(filename, true); // Hier wird ein neues File mit dem Namen "Filename" erstelle, die wir dann Bearbeiten können.
            PrintStream ps = new PrintStream(fos);

            Date date = new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);



            // Schreiben des Files
            ps.println(ts + " Hello World");
            System.out.println("writeNewTextFile wurde um "+ ts +  "  am Desktop abgelegt.");

            // Schließen des Files.
            fos.close();


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

