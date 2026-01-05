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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class GUIEvent extends Frame implements ActionListener, ItemListener, FocusListener, TextListener,KeyListener {

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
        ch = new Choice();
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
//        b2.setVisible(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ch.addItemListener(this);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        b1.addFocusListener(this);
        b2.addFocusListener(this);
        t1.addTextListener(this);
        t1.addKeyListener(this);
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
        String s = ch.getSelectedItem();
        switch (s) {
            case "MP":
                setTitle("Madhya Pradesh");
                break;
            case "UP":
                setTitle("Uttar Pradesh");
                break;
            case "RJ":
                setTitle("Rajsthan");
                break;
            case "MH":
                setTitle("Maharastra");
                break;
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
//        if (e.getSource() == t1) {
//            t1.setBackground(Color.red);
//            t1.setForeground(Color.white);
//        } else if (e.getSource() == t2) {
//            t2.setBackground(Color.red);
//            t2.setForeground(Color.white);
//        }else if (e.getSource() == b1) {
//           b2.setBackground(Color.green);
//        }
    }

    @Override
    public void focusLost(FocusEvent e) {
//        if (e.getSource() == t1) {
//            t1.setBackground(Color.white);
//            t1.setForeground(Color.black);
//        } else if (e.getSource() == t2) {
//            t2.setBackground(Color.white);
//            t2.setForeground(Color.black);
//        }else if (e.getSource() == b1) {
//           b2.setBackground(Color.white);
//        }

    }

    @Override
    public void textValueChanged(TextEvent e) {
//        String s = t1.getText();
//        if (s.equals("1")) {
//            t2.setText("ONE");
//        } else if (s.equals("2")) {
//            t2.setText("TWO");
//        } else if (s.equals("3")) {
////            t2.setText("THREE");
//            b2.setVisible(false);
//        } else if (s.equals("4")) {
////            t2.setText("THREE");
//            b2.setVisible(true);
//        } else {
//            t2.setText("");
//        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
           System.out.println("keyTyped");
          }

    @Override
    public void keyPressed(KeyEvent e) {
      if(e.getKeyCode()==112)
      {
         String s= t1.getText();
         s=s.toUpperCase();
         t1.setText(s);  
      }
      else if(e.getKeyCode()==KeyEvent.VK_F2)
      {
          t1.setText("");
      }
        System.out.println("key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key released");
        }
}
