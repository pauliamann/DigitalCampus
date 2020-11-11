package at.dcv.w07.bibliotheksDaten;

import java.sql.SQLOutput;

public class User {

    private String datum;
    private String action;
    private String userName;
    private String bv_nummer;
    private String suchtext;
    // add Vector ausgeliehene Bücher


    public User(String datum, String action, String userName, String bv_nummer, String suchtext) {
        this.datum = datum;
        this.action = action;
        this.userName = userName;
        this.bv_nummer = bv_nummer;
        this.suchtext = suchtext;
    }

    public void aktionAusleihen (Book b) {
        b.setVerleihStatus(true);

        System.out.printf(userName + " " + " hat das Buch mit Nr. %s ausgeliehen.\n" , bv_nummer);


    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBv_nummer() {
        return bv_nummer;
    }

    public void setBv_nummer(String bv_nummer) {
        this.bv_nummer = bv_nummer;
    }

    public String getSuchtext() {
        return suchtext;
    }

    public void setSuchtext(String suchtext) {
        this.suchtext = suchtext;
    }
}
