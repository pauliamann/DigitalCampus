package at.dcv.w04;

public class W04Tag2Histogram {
    public static void main(String[] args) {
        String[] testData = {"Hello World!", "We're the champions!", "You're the best!"};
        int[] hist = getHistogram(testData);
        printHistogram(hist);
    }


    public static int[] getHistogram(String[] testData){
        int[] hist = new int[256];
        for (int i = 0; i < hist.length; ++i) hist[i] = 0; // Initialize with 0

        for (int i = 0; i < testData.length; ++i){
            for (int j = 0; j < testData[i].length(); ++j) {
                char c = testData[i].charAt(j);
                if (c < hist.length) {
                    hist[c] +=1;
                }
            }
        }
        return hist;
    }

    public static void printHistogram(int[] hist){
        for (int i = 'A'; i <= 'Z'; ++i){
            System.out.println("Char: " + Character.valueOf((char)i) + " found " + hist[i]);
        }
    }
}
