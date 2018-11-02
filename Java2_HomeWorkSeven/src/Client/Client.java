package Client;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Client extends JFrame {

    private final int HEIGHT = 500;
    private final int WIDTH = 500;
    private final int POSITION_X = 650;
    private final int POSITION_Y = 250;

    public Client() {

     setTitle("Chat");
     setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);

     JPanel topPanel = new JPanel();
     JPanel midPanel = new JPanel();
     JPanel butPanel = new JPanel();




     setVisible(true);

    }
}
