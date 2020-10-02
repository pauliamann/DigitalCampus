package at.dcv.w03;

public class W03TagWortspiegelWH {

    public static void main(String[] args) {
        String txt = "Apfelsaft";
        System.out.println(returnReverseString(txt));

    }

    public static String returnReverseString(String txt) {
        String reverseString = "";

        for (int i = 1; i <= txt.length(); i++) {
            reverseString += String.valueOf(txt.charAt(txt.length() - i));
        }
//        System.out.println("Reverse String: " + reverseString);
        return reverseString;
    }
}
