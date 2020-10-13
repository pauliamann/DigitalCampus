package at.dcv.w05.FotoApparat;

public class main {

    public static void main(String[] args) {
       String[] funktionen = {"abc", "def"};

        FotoApparat kamera1 = new FotoApparat(
                "Canon",
                8,
                10,
                "Japan",
                funktionen,
                "Hugo",
                "",
                1000,
                20
        );

        FotoApparat kamera2 = new FotoApparat(
                "FED 2",
                12,
                25,
                "USSR",
                funktionen,
                "Paul",
                "",
                2000,
                10
        );

        FotoApparat kamera3 = new FotoApparat(
                "Leica",
                20,
                35,
                "Deutschland",
                funktionen,
                "Ernst",
                "",
                3000,
                400
        );

        System.out.println(kamera1);
        System.out.println(kamera2);
        System.out.println(kamera3);

        System.out.println(kamera1.getProduktBlatt());
        System.out.println(kamera2.getProduktBlatt());
        System.out.println(kamera3.getProduktBlatt());

        System.out.println("Free Memory Size: " + kamera1.getFreeMemorySize());
        System.out.println("Free Memory Size: " + kamera2.getFreeMemorySize());
        System.out.println("Free Memory Size: " + kamera3.getFreeMemorySize());

    }



}
