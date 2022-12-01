import javax.swing.*;
import java.awt.*;

public class Main
         {
             private static void zrobOkno()
             {
                     JFrame okno = new JFrame("Aplikacja");
                     okno.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

                     okno.setBackground( Color.BLUE );
                     okno.setSize( 800, 200 );
                     okno.setLocation( 100, 50 );
                     okno.setVisible( true );

                     }
             public static void main( String[] args )
             {
                     javax.swing.SwingUtilities.invokeLater( new Runnable()
                     {
                         public void run() {
                             zrobOkno();
                         }
                     }
                     );
             };
         }
