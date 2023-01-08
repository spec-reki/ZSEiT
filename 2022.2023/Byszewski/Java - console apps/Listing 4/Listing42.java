import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Listing42 extends JPanel
{
    public Listing42()
    {
        JButton przyciskCzerwony = new JButton( "Czerwony" );
        przyciskCzerwony.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            setBackground( Color.RED );
            }
        }
        );
        add( przyciskCzerwony );

        JButton przyciskNiebieski = new JButton( "Niebieski" );
        przyciskNiebieski.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
            setBackground( Color.BLUE );
            }
        }
        );
        add( przyciskNiebieski );
    }
} 