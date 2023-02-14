import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Listing45 extends JPanel implements ActionListener
{
    JButton przyciskCzerwony, przyciskNiebieski;

    public Listing45()
    {
    przyciskCzerwony = new JButton( "Czerwony" );
    przyciskCzerwony.addActionListener( this );
    add( przyciskCzerwony );

    przyciskNiebieski = new JButton( "Niebieski" );
    przyciskNiebieski.addActionListener( this );
    add( przyciskNiebieski );
    }

    public void actionPerformed( ActionEvent evt )
    {
    if ( evt.getSource() == przyciskCzerwony )
    setBackground( Color.RED );
    else if ( evt.getSource() == przyciskNiebieski )
    setBackground( Color.BLUE );
    }
}
