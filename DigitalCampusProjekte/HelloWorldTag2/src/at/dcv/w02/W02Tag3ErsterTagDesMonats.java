package at.dcv.w02;

import java.util.Calendar;
import java.util.Locale;

public class W02Tag3ErsterTagDesMonats {

    public static void main(String[] args) {



        // This month
        Calendar c = Calendar.getInstance();
        System.out.println(firstDayOfMonth(c.get(Calendar.YEAR),c.get(Calendar.MONTH)));

    }

    public static String firstDayOfMonth(int year, int month){
        Calendar c = Calendar.getInstance();
        c.set(year, month, 1);
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
    }
}
