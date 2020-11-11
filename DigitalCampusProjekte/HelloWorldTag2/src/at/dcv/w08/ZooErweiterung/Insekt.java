package at.dcv.w08.ZooErweiterung;

public class Insekt extends Tier {

    public Insekt(String gattung, String name, Futter futter, double futterBedarf, int gesundheit) {
        super(gattung, name, futter, futterBedarf, gesundheit);
    }

    @Override
    public void printTierStruktur() {
        String prefix = "   ";
        System.out.println(prefix + "---TierStruktur Insekt");
        System.out.println(prefix + getGattung() + " Name: " + getName());
    }
}
