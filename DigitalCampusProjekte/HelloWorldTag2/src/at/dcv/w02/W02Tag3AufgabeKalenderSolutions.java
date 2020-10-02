package at.dcv.w02;

import java.util.Calendar;
import java.util.Locale;

public class W02Tag3AufgabeKalenderSolutions {

    /*
     * 1.:   Kopfzeile
     * 2.:   Pipeline mit Zahlen |  1 | - | 31 |
     * 3.:   Zeilenumbruch jede 7 Stelle
     * 4.:   Formatierung der Zahlen Richtig Stellen (jede Zahl 2 Ziffern breit
     * 5.:   Die letzte Zeile mit leeren Feldern auffüllen |    |
     *
     * 6.:  java.util.calender
                Verwendung von get Funktion   get(Calender.Year)
                Finde heraus welcher Wochentag der 1.September war.
     * 4.:  Kalkulation von 1 Tag des Monats
     * */

    public static void main(String[] args) {


        int yearThis = Calendar.getInstance().get(Calendar.YEAR);
        int monthThis = Calendar.getInstance().get(Calendar.MONTH);
        int dayToday = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);


// Der Wochentag des ersten Tags des Monats wird angezeigt
        String firstDayOfMonth = firstDayOfMonth(2020, 7);
        System.out.println(firstDayOfMonth);
        int intfirstDayOfMonth = 0;
      //  System.out.println(getNumberOfFirstDayOfMonth(intfirstDayOfMonth));  // Hier kann der String der Tages Funktion nicht in ein int verwandelt werden.


        System.out.println("           " + getMonthName(monthThis)+ " / " + yearThis );
        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
        printCalendarSheet(30, 3);


    }

    public static void printCalendarSheet(int daysOfMonth, int startDate) {
        int iterationCount = 0;
        String pipe = "|";


        for (int i = 1; i <= (startDate - 1); ++i) { // hier werden die LeerTage erstellt wenn der erste Tag des Monats nicht ein Montag ist.
            System.out.print("|    ");
            ++iterationCount;
        }

        for (int iDay = 1; iDay <= daysOfMonth; ++iDay) { // hier werden die Felder nach der Anzahl der Tage erstellt
            System.out.printf("| %2d ", iDay);
            ++iterationCount;
            if (iterationCount % 7 == 0) { // Am Ende des 7.Tages soll eine Pipe | angehängt werden.
                System.out.println(pipe);
            }
        }

        while (iterationCount % 7 != 0) { // hier werden die Wochentage mit LeerFeldern befüllt, solange die Woche noch nicht 7 Tage erreicht hat.
            System.out.print("|    ");
            ++iterationCount;
            if (iterationCount % 7 == 0) { // Am Ende des 7.Tages soll eine Pipe | angehängt werden.
                System.out.println(pipe);
            }
        }
    }

    public static String getMonthName (int month) {

        String monthString;
        switch (month) {
            case 0:  monthString = "January";
                break;
            case 1:  monthString = "February";
                break;
            case 2:  monthString = "March";
                break;
            case 3:  monthString = "April";
                break;
            case 4:  monthString = "May";
                break;
            case 5:  monthString = "June";
                break;
            case 6:  monthString = "July";
                break;
            case 7:  monthString = "August";
                break;
            case 8:  monthString = "September";
                break;
            case 9: monthString = "October";
                break;
            case 10: monthString = "November";
                break;
            case 11: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        return monthString;
    }

    public static String firstDayOfMonth(int year, int month){
        Calendar c = Calendar.getInstance();
        c.set(year, month, 1);
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.GERMAN);
    }

    public static void getNumberOfFirstDayOfMonth(String firstDayOfMonth) {


        if (firstDayOfMonth == "Montag") {
            int intfirstDayOfMonth = 0;
        }

        if (firstDayOfMonth == "Samstag") {
           int intfirstDayOfMonth = 5;
        }
    }


}
