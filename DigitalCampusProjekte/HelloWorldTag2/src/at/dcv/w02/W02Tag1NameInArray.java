package at.dcv.w02;

public class W02Tag1NameInArray {
    public static void main(String[] args) {

        /*
         * 3. Gibt es im Kurs einen Alexander?
         * 3a. Wieviele Alexander gibt es in der Gruppe?
         * */

        String testName = "Bertram" ;
        int testNameCount = 0 ;

        String[] names = {"Bertram", "Emelin", "Dodo", " Anton", "Bertram"};

        for (int i = 0; i < names.length; ++i) {
            if (names[i].equals(testName)) {
                ++testNameCount;
            }
        }

        System.out.println(testName + " ist " + testNameCount + "x in Array enthalten");

    }
}
