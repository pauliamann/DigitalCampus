package at.dcv.w07.bibliotheksDaten;



import java.util.Vector;

public class Library {

    private String name;
    public Vector<Book> bookList;
    public Vector<User> userList;
    public Vector<Aktion> aktionen;
    // hat Besucher


    public Library(String name) {
        this.name = name;
        bookList = new Vector<Book>();
        userList = new Vector<User>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name ;
    }

    public Book searchAndCreateBook (String bv_number, String isbn, String autor, String titel, String verlag, int ladenpreis) {

        for (Book b : bookList) {
            if (b.getTitel().equals(titel));
//            System.out.println("irgendws hats da");
//            return b;
        }
        Book b = new Book(bv_number, isbn, autor, titel, verlag, ladenpreis);
        bookList.add(b);
        return b;

    }

    public User searchAndCreateUser (String datum, String action, String userName, String bv_nummer, String suchtext){

        for(User u: userList) {
            if( u.getUserName().equals(userName)) {
                System.out.println("getUsername == userName");
                return u;
            }
        }
        User u = new User(datum, action, userName, bv_nummer, suchtext) ;
        userList.add(u);
        return u;
    }



    public void printBibliothekStruktur (Vector<Book> bookList) {
        System.out.println(name);
        System.out.println(" ");
        System.out.println("--- --- Bücher --- ---");
        int bookCounter= 1;
//       Funktioniert ist nur zu lang auszudrucken
/*       for (Book b : bookList) {
            System.out.println("Buch " + bookCounter + ": " + b.toString());
            ++bookCounter;
           *//* if (b.getAutor().length() == 0) {
                System.out.println(ANSI_YELLOW+ "BV_nummer: " + b.getBv_nummer() + " hat keinen Autor" +ANSI_RESET);

            }*//*
        }*/





        /*--- User ---*/
        int userCounter = 0;
        for (User u: userList) {
            ++userCounter;
            System.out.println("User: " + userCounter + " " + u.getUserName());
            if (u.getAction() == "AUSLEIHEN") {
//                u.aktionAusleihen(u.getBv_nummer());
            }
        }



    }




    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

}


