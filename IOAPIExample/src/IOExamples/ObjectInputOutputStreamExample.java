package IOExamples;

import java.io.FileInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Game implements Serializable {

    private int xPos;
    private transient int  yPos;
    
    public void changePosition(int xPos, int yPos) {
        this.xPos = this.xPos + xPos;
        this.yPos = this.yPos + yPos;
    }

    public void display() {
        System.out.println("Position :");
        System.out.println("xPos : " + xPos);
        System.out.println("yPos : " + yPos);
    }
}

public class ObjectInputOutputStreamExample {

    public static void main(String[] args) throws Exception {
        int xPos, yPos;
        Scanner sc = new Scanner(System.in);
        System.out.print("You want to start new/old game : ");
        String op = sc.next();
        System.out.print("enter xPos : ");
        xPos = sc.nextInt();
        System.out.print("enter yPos : ");
        yPos = sc.nextInt();
        Game obj = null;
        if (op.equalsIgnoreCase("new")) {
            obj = new Game();
            obj.changePosition(xPos, yPos);
        } else if (op.equalsIgnoreCase("old")) {
            //read object from file
            FileInputStream fis = new FileInputStream("C:\\Users\\WIN\\Desktop\\ram\\game.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (Game) ois.readObject();
            obj.changePosition(xPos, yPos);
            fis.close();
            ois.close();
        }
        obj.display();
        //write object inside file
        FileOutputStream fos = new FileOutputStream("C:\\Users\\WIN\\Desktop\\ram\\game.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
        System.out.println("data save succefully");
    }
}
