package at.dcv.w04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class W04Tag1DokumentInfoHolenAlleZeilen {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\DCV\\Desktop\\input.txt");
        } catch (
                FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        if (fis != null) {          //wenn File nicht existiert, soll Code nicht weiter ausgeführt werden
            Scanner sc = new Scanner(fis);

            while (sc.hasNext()) {
                String input1 = sc.nextLine();
                System.out.println(" File content : " + input1);
            }
            try {
                fis.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
