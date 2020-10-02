package at.dcv.w03;

public class W03Tag1String {

    public static void main(String[] args) {

        String test ="Schattenburg";
        char[] c = {'x' , 'y' , 'z'};
        String s = String.valueOf(c);
//
//        System.out.println("s: " + s);
//        System.out.println("c: " + c);
//        System.out.println(String.valueOf(c));

        String testReverse = "";
        for (int i = 1; i <= test.length()-4 ; i++) {
//            System.out.print(test.charAt(i));
            testReverse += test.charAt(test.length() - i);

        }

        System.out.print("Reverse: " +testReverse);

    }

}

