import javax.swing.*;

public class Listing224
{
    public static void main(String[] args)
    {
        String [] propozycje = { "C:(System)", "D:(Dane)", "E:(Zapas)"};
        String pytanie = "Na którym dysku zapisać plik:";
        String tytul = "Zapisywanie dokum entu";

        String odpowiedz = (String)JOptionPane.showInputDialog( null,
        pytanie, tytul, JOptionPane.QUESTION_MESSAGE, null,
        propozycje, propozycje[1] );

        System.out.println( "Odpowiedź: " + odpowiedz );
    }
}