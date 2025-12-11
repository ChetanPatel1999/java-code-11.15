/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOExamples;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\WIN\\Desktop\\chetan\\empInfo.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("emp id : "+dis.readInt());
        System.out.println("emp sallary : "+dis.readDouble());
        System.out.println("emp Parmanet: "+dis.readBoolean());
        fis.close();
        dis.close();
    }

}
