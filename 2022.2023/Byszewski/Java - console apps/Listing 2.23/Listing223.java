 import javax.swing.*;

public class Listing223
{
    public static void main(String[] args)
    {
    String pytanie = "Nazwa pliku:";
    String tytul = "Zapisywanie pliku";

    String odpowiedz = (String)JOptionPane.showInputDialog( null,pytanie, tytul, JOptionPane.QUESTION_MESSAGE );

    System.out.println( "Nazwa pliku: " + odpowiedz );
    }
}