package at.dcv.w08.ZooErweiterung;

public class SaeugeTier extends Tier{

    public SaeugeTier (String gattung, String name, Futter futter, double futterBedarf, int gesundheit) {
        super(gattung, name, futter, futterBedarf, gesundheit);
    }

    @Override
    public void printTierStruktur() {
        String prefix = "   ";
        System.out.println(prefix + "--- Tierstruktur Säugetier: ");
        System.out.println(prefix + "Säugetier Gattung : " + getGattung() + " Name: " + getName());
    }
}
