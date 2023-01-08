import java.io.*;

public class Listing67 implements Serializable
{
    String waluta;
    int liczba;
    double kurssprzedaz;
    double kursZakup;

    public Listing67(String waluta, int liczba, double kurssprzedaz, double kursZakup)
    {
        this.waluta = waluta;
        this.liczba = liczba;
        this.kurssprzedaz = kurssprzedaz;
        this.kursZakup = kursZakup;
    }
}