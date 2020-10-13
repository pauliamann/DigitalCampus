package at.dcv.w05;

import java.time.LocalDate;
import java.util.Arrays;

public class kursmain {

    public static void main(String[] args) {
        String[] lehrer = {"Lukas" , "Gyula"};
        String[] teilnehmer = {"Markus", "Clemens", "Julia", "Henning"};

        // zuerst erstellen wir einen Kurs
        Kurs feldkirchVZ = new Kurs(
                "Feldkirch",
                "VZ",
                LocalDate.of(2020, 9, 14),
                "Einführung in Java",
                lehrer,
                teilnehmer
        );


        System.out.println(feldkirchVZ); // Hier wird der in kurs.java definierte String ausgegeben.
        String[] newLehrer = {"Daniel" , "Tobias" , "Gyula"}; // hier werden neue Lehrer definiert
        feldkirchVZ.setLehrer(newLehrer); // mit setLehrer wird das alte Lehrer Array mit dem neuen überschrieben.
        System.out.println(feldkirchVZ); // hier wird das neue Lehrer Array ausgegeben

        System.out.println( // hier wird die Ausgabe mit den Attributen durchgeführt
                feldkirchVZ.getThema()
                        + " " +
                feldkirchVZ.getStartDate().toString()
                        + " " +
                Arrays.toString(feldkirchVZ.getTeilnehmer())
                        + " " +
                feldkirchVZ.getStandort()
        );


    }


}
