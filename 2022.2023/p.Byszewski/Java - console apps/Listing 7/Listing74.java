public class Listing74 implements Runnable
{
    konto konto;
    double kwota;

    public Listing74(konto konto, double kwota)
    {
        this.konto = konto;
        this.kwota = kwota;
    }

    public void run()
    {
        konto.wplata(kwota);
    }
}