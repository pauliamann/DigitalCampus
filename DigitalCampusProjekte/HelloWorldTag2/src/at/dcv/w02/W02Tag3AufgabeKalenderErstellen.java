package at.dcv.w02;

import java.time.LocalDate;
import java.util.Calendar;


public class W02Tag3AufgabeKalenderErstellen {

    public static void main(String[] args) {

        /*  1.: Erste Zeile das Monat anzeigen
                Zweite Zeile: beginnt mit Montag und zeigt die Wochentage
                1. September ist Montag (Parameter ist anzahlTage)
            2.: Parameter
                @ersterTag   int  0 = Montag   7 = Sonntag
                @anzahlTage
            3.: java.util.calender
                Verwendung von get Funktion   get(Calender.Year)
                Finde heraus welcher Wochentag der 1.September war.
            4.: Kalkulation von 1 Tag des Monats
        * */

        //Print 7 Felder mit | in eine Zeile (Raster)

        String empty = "    ";
        String slash = "|";
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int dayOfMonth = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
//        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = 30;
        int weekEnd = 7;
        int ersterTag = 1;
        int weekDayCounter = 1;



        System.out.println("      "+ dayOfMonth + "/" + getMonthName(month) + "/" + year);
        System.out.println(slash + " MO " + slash + " DI " + slash + " MI " + slash + " DO " +slash + " FR " + slash + " SA " +slash + " SO " + slash);

        if (ersterTag > 0) {
            for (int iErsterTag = 1; iErsterTag <= ersterTag; ++iErsterTag)
                System.out.print("|    ");
                /*++weekDayCounter;*/
        }


        for (int iDay = 1; iDay <= numberOfDaysInMonth; ++iDay) {
            System.out.printf("| %02d ", iDay);
            ++weekDayCounter;
            if (iDay == weekEnd /*&& weekDayCounter == 1*/) {
                System.out.println(slash);
                weekEnd += 7;
            }

//            if (iDay == weekDayCounter) {
//                System.out.println(slash);
//                weekEnd += (7);
//            }

        }
        System.out.println("++");
        System.out.println(weekDayCounter);

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

    /*public static void getNumberDaysInMonth (int numberDaysInMonth) {

        int numberDaysInMonthInt;
        switch (numberDaysInMonth) {
            case 0:
                numberDaysInMonthInt = 31;
                break;
            case 1:
                numberDaysInMonthInt = 28;
                break;
            case 2:
                numberDaysInMonthInt = 31;
                break;
            case 3:
                numberDaysInMonthInt = 30;
                break;
            case 4:
                numberDaysInMonthInt = 31;
                break;
            case 5:
                numberDaysInMonthInt = 30;
                break;
            case 6:
                numberDaysInMonthInt = 31;
                break;
            case 7:
                numberDaysInMonthInt = 31;
                break;
            case 8:
                numberDaysInMonthInt = 30;
                break;
            case 9:
                numberDaysInMonthInt = 31;
                break;
            case 10:
                numberDaysInMonthInt = 30;
                break;
            case 11:
                numberDaysInMonthInt = 31;
                break;
        }

    }*/


}
