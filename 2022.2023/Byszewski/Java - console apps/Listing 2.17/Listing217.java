import java.awt.event.*;
import javax.swing.*;

public class Listing217 extends JPanel implements ActionListener
{
    private Timer timer = new Timer(200, this);
    private JProgressBar postęp;
    
    public Listing217()
    {
        postęp = new JProgressBar(JProgressBar.HORIZONTAL, 1, 20);
        postęp.setStringPainted(true);
        postęp.setBounds(5, 5, 280, 20);

        add(postęp);

        setLayout(null);

        timer.start();
    }
    public void actionPerformed(ActionEvent e)
    {
        int wartość = postęp.getValue();
        if (wartość < postęp.getMaximum())
            postęp.setValue(++wartość);
        else
            timer.stop();
    }
}