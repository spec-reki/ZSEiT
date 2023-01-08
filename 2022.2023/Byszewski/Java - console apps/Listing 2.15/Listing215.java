import javax.swing.*;

public class Listing215 extends JPanel{
    public Listing215()
    {
        String [] napisy = {"<html><i><font color='red'>S</font>tart</i></html>", "Stop", "Naprzód", "Wstecz"};

        for(String napis : napisy)
            add(new JButton(napis));

    }

}