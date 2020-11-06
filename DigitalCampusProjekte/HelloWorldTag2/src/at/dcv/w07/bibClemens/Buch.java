package at.dcv.w07.bibClemens;

public class Buch
{

    private String verlag;
    private String isbn;
    private String autoren;
    private String titel;
    private String bvNr;
    private int ladenpreis;
    private int anfragen;


    public Buch()
    {

    }

    public void anfrage()
    {
        anfragen++;
    }


    public int getAnfragen() { return anfragen; }

    public String getVerlag()
    {
        return verlag;
    }

    public void setVerlag(String verlag)
    {
        this.verlag = verlag;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getAutoren()
    {
        return autoren;
    }

    public void setAutoren(String autoren)
    {
        this.autoren = autoren;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public String getBvNr()
    {
        return bvNr;
    }

    public void setBvNr(String bvNr)
    {
        this.bvNr = bvNr;
    }

    public int getLadenpreis()
    {
        return ladenpreis;
    }

    public void setLadenpreis(int ladenpreis)
    {
        this.ladenpreis = ladenpreis;
    }


}
