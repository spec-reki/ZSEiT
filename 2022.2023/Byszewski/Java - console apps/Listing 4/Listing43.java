import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Listing43 extends JPanel
{
    public Listing43()
    {
        JButton przyciskCzerwony = new JButton( "Czerwony" );
        przyciskCzerwony.addActionListener(
        new ObslugaZdarzenie( this, Color.RED ) );
        add( przyciskCzerwony );

        JButton przyciskNiebieski = new JButton( "Niebieski" );
        przyciskNiebieski .addActionListener(
        new ObslugaZdarzenie( this, Color.BLUE ) );
        add( przyciskNiebieski );
    }

}

class ObslugaZdarzenie implements ActionListener
{
    JPanel panel;
    Color kolor;

    ObslugaZdarzenie ( JPanel panel, Color kolor )
    {
    this.panel = panel;
    this.kolor = kolor;
    }

    public void actionPerformed( ActionEvent evt )
    {
    panel.setBackground( kolor );
    }
}