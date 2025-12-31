package ExampleOfGUI;

import java.awt.Button;
import java.awt.Frame;

public class SecondGUIExample {

    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(700, 300);
        f1.setLayout(null);
        Button b1 = new Button("save");
        Button b2 = new Button("cancle");
        b1.setSize(100, 50);
        b1.setLocation(100, 50);
        f1.add(b2);
//        b2.setSize(200, 50);
//        b2.setLocation(500, 250);
         b2.setBounds(300, 250, 50, 50);
         f1.add(b1);
    }
}
