import java.awt.*;
import javax.swing.*;

public class Listing25 extends JTabbedPane {

  public Listing25() {
    ImageIcon ikona = new ImageIcon("ikona.gif");

    JPanel panelCzerwony = new JPanel();
    JPanel panelZolty = new JPanel();

    panelCzerwony.setBackground(Color.RED);
    panelZolty.setBackground(Color.YELLOW);

    addTab("Czerwona", ikona, panelCzerwony, "Zakładka czerwona");
    addTab("Żółta", ikona, panelZolty, "Zakładka żółta");

  }
}
  