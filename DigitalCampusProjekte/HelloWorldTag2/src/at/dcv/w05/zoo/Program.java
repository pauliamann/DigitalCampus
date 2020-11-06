package at.dcv.w05.zoo;


import java.util.Vector;

public class Program {
    public static void main(String[] args) {

        System.out.println("Hallo zum Zooprogramm");

        /* --- Instanzen erstellen --- */


        // es gibt nur einen Zoo, daher braucht man keinen Vektor.. einfach so einen Zoo anlegen.
        Zoo schoenbrunn = new Zoo("Tiergarten Schönbrunn");


        // Gehege zu Zoo
        Gehege affenhaus = new Gehege("Affenhaus");
        schoenbrunn.addGehege(affenhaus);

        Gehege katzenhaus = new Gehege("Katzenhaus");
        schoenbrunn.addGehege(katzenhaus);


        // Pfleger zu Zoo
        Pfleger pfleger1 = new Pfleger("Udo");
        schoenbrunn.addPfleger(pfleger1);

        Pfleger pfleger2 = new Pfleger("Knackal");
        schoenbrunn.addPfleger(pfleger2);


        // Tier zu Gehege:
        Tiere katze1 = new Tiere("Tiger", "Raubtier");
        katzenhaus.addTiere(katze1);

        Tiere katze2 = new Tiere("Panter", "Raubtier");
        katzenhaus.addTiere(katze2);

        Tiere katze3 = new Tiere("Löwe", "Raubtier");
        katzenhaus.addTiere(katze3);

        Tiere affe1 = new Tiere("Gorilla1", "Affe");
        affenhaus.addTiere(affe1);

        Tiere affe2 = new Tiere("Gorilla2", "Affe");
        affenhaus.addTiere(affe2);


        // Futter zu Zoo
        Futter banane = new Futter("Banane");
        schoenbrunn.addFutter(banane);

        Futter maus = new Futter("Maus");
        schoenbrunn.addFutter(maus);

        Tierarzt arzt1 = new Tierarzt("Dolittle");
//
        System.out.println(schoenbrunn.getInfo());
        System.out.println(arzt1.toString());
        System.out.println("Anzahl Gehege: "+ schoenbrunn.getGehegeListe().size());
        System.out.println("In diesen Gehegen sind folgende Tiere: ");
        for (Gehege ge : schoenbrunn.getGehegeListe()) {
            System.out.println(ge);
            for(Tiere te: ge.getTiereListe()) {
                System.out.println(te);
            }
        }
// simulation
        System.out.println("Simulation beginnt");
//        System.out.println("Affenhaus");
//        schoenbrunn.simulation(affenhaus.getTiereListe());
        schoenbrunn.simulation(2);

//        affenhaus.countAnimals();


    }


}
