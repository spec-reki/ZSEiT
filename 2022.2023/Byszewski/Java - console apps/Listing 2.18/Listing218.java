import java.awt.*;
import javax.swing.*;

public class Listing218 extends JPanel
{
    private String komunikat = "Witaj, to ja - Twoja aplikacja!";
    private Font czcionka = new Font( "Times New Roman", Font.ITALIC + Font.BOLD, 24);
    private FontMetrics pomiar = getFontMetrics(czcionka);
    
    public Listing218()
    {
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(czcionka);
        int x = (getSize().width - pomiar.stringWidth(komunikat)) / 2;
        int y = getSize().height / 2;

        g.drawString(komunikat, x, y);
    }
}