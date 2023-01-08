import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Listing44 extends JPanel implements ActionListener
{
    public Listing44()
    {
    JButton przyciskCzerwony = new JButton( "Czerwony" );
    przyciskCzerwony.addActionListener( this );
    add( przyciskCzerwony );

    JButton przyciskNiebieski = new JButton( "Niebieski" );
    przyciskNiebieski.addActionListener( this );
    add( przyciskNiebieski );
    }


public void onPerformed( ActionEvent evt )
{
    switch ( evt.getActionCommand() )
    {
    case "Czerwony" : setBackground( Color.RED ); break;
    case "Niebieski" : setBackground( Color.BLUE ); break;
    }
}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub
        
    }
}