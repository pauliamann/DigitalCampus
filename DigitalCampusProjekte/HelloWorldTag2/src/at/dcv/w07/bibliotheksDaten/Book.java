package at.dcv.w07.bibliotheksDaten;

import java.util.Vector;

public class Book {

    private String bv_nummer;
    private String isbn;
    private String autor;
    private String titel;
    private String verlag;
    private int ladenpreis;
    private boolean verleihStatus;


//    private int numberBooksWithoutAutor;
//    private Vector<Book> bookList;

    public Book(String bv_nummer, String isbn, String autor, String titel, String verlag, int ladenpreis) {
        this.bv_nummer = bv_nummer;
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
        this.verlag = verlag;
        this.ladenpreis = ladenpreis;
        this.verleihStatus = false; // false ist nicht verliehen; true ist verliehen.

    }

    @Override
    public String toString() {
        return  "Isbn= " + isbn +
                ", autor= '" + autor + '\'' +
                ", titel='" + titel;
    }

    public String getTitel() {
        return titel;
    }

    public String getBv_nummer() {
        return bv_nummer;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getVerlag() {
        return verlag;
    }

    public int getLadenpreis() {
        return ladenpreis;
    }

    public void setVerleihStatus(boolean verleihStatus) {
        this.verleihStatus = verleihStatus;
    }



}
