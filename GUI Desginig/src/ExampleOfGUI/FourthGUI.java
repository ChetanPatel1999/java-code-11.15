package ExampleOfGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FourthGUI extends Frame {

    Label l1;
    TextField t1;
    Button b1;

    FourthGUI() {
        initComponents();
    }

    void initComponents() {
        setLayout(new FlowLayout());
        l1 = new Label();
        l1.setText("UserName");
        t1 = new TextField(10);
        b1 = new Button("save");
        add(l1);
        add(t1);
        add(b1);
    }

    public static void main(String[] args) {
        FourthGUI f1 = new FourthGUI();
        f1.setVisible(true);
        f1.setSize(400, 400);
    }

}
