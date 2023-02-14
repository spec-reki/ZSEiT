import javax.swing.*;
import java.awt.*;

public class Listing57 extends JPanel
{
    public Listing57()
    {
        setBorder(BorderFactory.createLoweredBevelBorder());
        setLayout(new GridLayout(1, 2));

        JLabel pozycja = new JLabel("Pozycja: 2/65");
        JLabel kodek = new JLabel("Kodek: MP3", SwingConstants.RIGHT);

        add(pozycja);
        add(kodek);
    }
} 