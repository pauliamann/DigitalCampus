package at.dcv.w05.zoo;

public class Tierarzt {

    private String name;



    public Tierarzt(String name) {
        this.name = name;
    }




    public String getName() {
        return name;
    }

    @Override
    public  String toString() {

        return  "Tierarzt: " + name ;
    }
}
