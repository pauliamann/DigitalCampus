package at.dcv.w06;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;

public class HashmapExamples {


    public static void main(String[] args) {

        Vector<String> names = new Vector<String>();
        names.add("Claudius");
        names.add("Beatrix");
        names.add("Alfonz");
        names.add("Dori");
        names.add("Emil");



/*        // CompareTo Beispiel:
        System.out.println(names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String variable1, String variable2) {

                if (variable1.length() == variable2.length() ) {
                    return 0;
                } else if (variable1.length() < variable2.length() ){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(names); */


        // Beispiel Hashmap:
        HashMap<String, Float> temperatur = new HashMap<String, Float>();

        temperatur.put("Dornbirn", 5.9f);
        temperatur.put("Dornbirn", 5.7f);
        temperatur.put("Feldkirch", 4.5f);

        for (String stadt : temperatur.keySet()) {
            System.out.println("In " + stadt + " hat es " + temperatur.get(stadt));
        }
        System.out.println(" - Temperatur für Feldkirch vorhanden:" + (temperatur.containsKey("Feldkirch") ? "Ja" : "Nein"));
        System.out.println(" - Temperatur für Bregenz vorhanden:" + (temperatur.containsKey("Bregenz") ? "Ja" : "Nein"));


    }


}