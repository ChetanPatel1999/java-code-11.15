package ExampleOfGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FirstGUIExample {
    
    public static void main(String[] args) {
        //create a container
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(400, 400);
        //create component
        Label l1 = new Label("Name");
        TextField t1 = new TextField(10);
        Button b1 = new Button("save");
        //add component in container
        f1.setLayout(new FlowLayout());
        f1.add(l1);
        f1.add(t1);
        f1.add(b1);
    }
}
