package at.dcv.w05.animal;

public class Cat extends Animal  {

public int mouseCount;

    public int getMouseCount() {
        mouseCount = 22;

        return mouseCount;
    }

    // Constructor muss auf den super Constructor zugreifen:
    public Cat(String name, int age)
    {
        super(name, age);
    }

    public void purr ()
    {
        System.out.println("Schnurr Schnurr");
    }



    @Override
    public String getInfo() {

        return super.getInfo() + ", Mousecount = " + this.getMouseCount() + ". " + getName() + " ist zufrieden.";

    }
}
