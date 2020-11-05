package at.dcv.w08.museum_improved;

public class Gemaelde extends Kunstobjekt {
    public Gemaelde(String name, String[] farben, String[] materialien) {
        super(name, farben, materialien);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix+"Bild:");
        super.print(prefix+prefix);
    }
}
