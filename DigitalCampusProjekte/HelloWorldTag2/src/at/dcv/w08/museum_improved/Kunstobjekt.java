package at.dcv.w08.museum_improved;

import java.util.Arrays;
import java.util.Objects;

public class Kunstobjekt extends Knoten {
    private String[] farben;
    private String[] materialien;

    public Kunstobjekt(String name, String[] farben, String[] materialien) {
        super(name);
        this.farben = farben;
        this.materialien = materialien;
    }

    public void print(String prefix){
        System.out.println(prefix+"Name: "+getName());
        System.out.println(prefix+"Farben: "+ Arrays.toString(farben));
        System.out.println(prefix+"Materialien: "+ Arrays.toString(materialien));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kunstobjekt that = (Kunstobjekt) o;
        return Objects.equals(getName(), that.getName()) &&
                Arrays.equals(farben, that.farben) &&
                Arrays.equals(materialien, that.materialien);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(farben);
        result = 31 * result + Arrays.hashCode(materialien);
        return result;
    }
}
