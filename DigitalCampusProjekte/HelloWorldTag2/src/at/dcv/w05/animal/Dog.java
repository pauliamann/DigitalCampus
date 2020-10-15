package at.dcv.w05.animal;

public class Dog extends Animal {

    public int catCount;

    public Dog(String name, int age) {
        super(name, age);
    }

    public int getCatCount() {
        catCount = 10;

        return catCount;
    }

    public void bark ()
    {
        System.out.println(getName() + " sagt: Wau Wau");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Catcout: " + getCatCount();
    }
}
