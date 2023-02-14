import javax.swing.*;

public class Listing31 extends JPanel
{
    public Listing31()
    {
        String [] napisy = {"Start", "Naprzód", "Zwiększ prędkość odtwarzania", "Wstecz", "Stop"};

        for(int i = 0; i < napisy.length; i++)
        {
            JButton przycisk = new JButton(napisy[i]);
            add(przycisk);
        }
    }
}