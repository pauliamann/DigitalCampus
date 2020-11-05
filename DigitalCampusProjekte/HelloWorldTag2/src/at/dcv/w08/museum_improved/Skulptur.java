package at.dcv.w08.museum_improved;

public class Skulptur extends Kunstobjekt {

    public Skulptur(String name, String[] farben, String[] materialien) {
        super(name, farben, materialien);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "Skulptur:");
        super.print(prefix + prefix);
    }
}
