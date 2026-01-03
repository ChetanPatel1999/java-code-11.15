package ExampleOfGUI;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUIEvent extends Frame implements ActionListener,ItemListener {

    public GUIEvent() {
        initComponent();
    }

    void initComponent() {
        setLayout(new FlowLayout());
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("copy");
        b2 = new Button("clear");
        b3 = new Button("close");
        ch= new Choice();
        ch.add("MP");
        ch.add("UP");
        ch.add("MH");
        ch.add("RJ");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(ch);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ch.addItemListener(this);
    }

    public static void main(String[] args) {
        GUIEvent f1 = new GUIEvent();
        f1.setVisible(true);
        f1.setSize(400, 400);

    }

    TextField t1;
    TextField t2;
    Button b1;
    Button b2;
    Button b3;
    Choice ch;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String data = t1.getText();
            t2.setText(data);
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        } else if (e.getSource() == b3) {
            System.exit(0);
//             t1.setBackground(Color.red);
//             t2.setBackground(Color.red);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
          String s= ch.getSelectedItem();
          switch(s)
          {
              case "MP":setTitle("Madhya Pradesh");break;
              case "UP":setTitle("Uttar Pradesh");break;
              case "RJ":setTitle("Rajsthan");break;
              case "MH":setTitle("Maharastra");break;
          }
    }
}
