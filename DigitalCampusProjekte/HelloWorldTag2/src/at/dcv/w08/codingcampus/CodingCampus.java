package at.dcv.w08.codingcampus;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

public class CodingCampus {

    private String name;
    public Vector<Course> courseList;
    private Vector<People> peopleList;

    public CodingCampus(String name) {
        this.name = name;
        this.courseList = new Vector<Course>();
        this.peopleList = new Vector<People>();
    }

    public JavaCoding searchAndCreateJava(String kursName, String description, int nrParticipants, int dauer, String unterrichtsmaterial) {

        JavaCoding j = new JavaCoding(kursName, description, nrParticipants, dauer, unterrichtsmaterial);
        courseList.add(j);
        return j;
    }


    public BusinessEnglish searchAndCreateEnglish(String kursName, String description, int nrParticipants, int dauer, String unterrichtsmaterial) {

        BusinessEnglish b = new BusinessEnglish(kursName, description, nrParticipants, dauer, unterrichtsmaterial);
        courseList.add(b);
        return b;
    }


    public void printCodingCampusStructure() {

        System.out.println("--- --- Kurse --- ");
        for (Course c : courseList) {
//            System.out.println(c.getClass().getSimpleName() + "   mit Kurs-NR.: " + c.name + "\nFreie Plätze: " + (c.maxParticipants - c.kursTeilnehmerListe.size()) );
//            System.out.print("Instructor: ");
//            c.printInstructorListe();
//            System.out.print("Kursteilnehmer: ");
//            c.printTeilnehmerListe();
//            System.out.println("° ° ° ° ° ° ° ° ° ° °");
        }

        Date testDate = new Date (20201103);
        System.out.println(testDate);

        Calendar testCalender = new GregorianCalendar(2020,9,03);
        System.out.println(testCalender.getTime());

        LocalDate testLocalDate = LocalDate.of(2020,11,01);
        System.out.println(testLocalDate);

        testLocalDate = LocalDate.of(2020, Month.NOVEMBER, 02);
        System.out.println(testLocalDate);

        LocalDate heute = LocalDate.now();
        System.out.println(heute);

        String[] localDateArray = {"2000-01-01" , "2001-02-01" , "2003-03-01" , "2004-04-01" };



        LocalDate parseLocalDate = LocalDate.parse("2000-01-01");
        System.out.println(parseLocalDate);
        parseLocalDate = LocalDate.parse("31.01.2000", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(parseLocalDate);

        heute.getDayOfMonth();
        System.out.println("heute: " + heute);
        heute.getDayOfWeek();
        System.out.println("heute: " + heute);
        heute.getChronology();
        System.out.println("heute: " + heute);
        heute.getYear();
        System.out.println("heute: " + heute);
        heute.getDayOfYear();
        System.out.println("heute: " + heute);

        heute = heute.plusDays(1);
        System.out.println("heute: " + heute);
        heute.getDayOfWeek();
        System.out.println("heute: " + heute);
    }



    public void getCourseName() {
        String getCourseName;

        for (Course c : courseList) {
            getCourseName = c.getClass().getSimpleName();
        }
//        return getCourseName;
    }

    public Vector<Course> getCourseList() {
        return courseList;
    }

    public String getName() {
        return name;
    }
}
