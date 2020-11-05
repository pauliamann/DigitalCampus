package at.dcv.w08.museum_improved;

import java.util.Objects;
import java.util.Vector;

public class Knoten {
    private String name;
    private Vector<Knoten> kinder = new Vector<>();

    public Knoten(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(String prefix) {
        System.out.println(prefix + getClass().getSimpleName() + ": " + name);
        for (Knoten knoten : kinder) {
            knoten.print(prefix + prefix);
        }
    }

    public Knoten findOrAdd(Knoten raum) {
        int index = kinder.indexOf(raum);
        if (index >= 0) {
            return kinder.get(index);
        } else {
            kinder.add(raum);
            return raum;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knoten knoten = (Knoten) o;
        return Objects.equals(name, knoten.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
