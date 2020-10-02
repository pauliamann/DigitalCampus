package at.dcv.w03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class W03Tag5FileOutPutWiederholung {

    public static void main(String[] args) {

        try { // Try Catch Block benötigt man zur Fehlerbehandlung (Festblatte voll, Pfad falsch, Berechtigungen fehlen)
            /* main */    FileOutputStream fos = new FileOutputStream("C:\\users.txt");
            /* main */     PrintStream ps = new PrintStream(fos);
            /* in der Funktion die Aufgerufen wird */ps.println("Buchstaben  schreiben");
            /* main */     fos.flush(); /* oder */
            /* main */     fos.close();// unterschied zwischen flush & close?: close kann man das file nachher nicht mehr bearbeiten. flush bleibt die Datei bearbeitbar.
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
