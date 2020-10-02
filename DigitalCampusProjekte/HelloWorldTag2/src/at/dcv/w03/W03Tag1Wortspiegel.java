package at.dcv.w03;

public class W03Tag1Wortspiegel {
    public static void main(String[] args) {

        String str = "Apfelsaft";
        System.out.println(reverseWord(str));

    }

    public static String reverseWord(String str) {

        String reverseString = "";
        for (int i = 1; i <= str.length(); i++) {

             reverseString += String.valueOf(str.charAt(str.length() - i));
            //System.out.print( reverseString);
        }
        return reverseString;

    }
}
