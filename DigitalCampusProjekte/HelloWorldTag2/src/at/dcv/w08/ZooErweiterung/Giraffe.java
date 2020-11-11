package at.dcv.w08.ZooErweiterung;

public class Giraffe extends SaeugeTier {

//    name futterbedarf gesundheit
    public Giraffe (String name, Double futterbedarf, int gesundheit) {
        super("Giraffe", name, Zoo.getZoo().searchAndCreateFutter("Heu"), futterbedarf, gesundheit);
    }

    @Override
    public void printTierStruktur() {
        String prefix = "   ";
        System.out.println(prefix + "Giraffe Tierstruktur: ");
        System.out.println(prefix + "Name: " + getName() + ", Futterbedarf: " + getFutterBedarf() );
    }
}
