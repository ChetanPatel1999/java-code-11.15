package IOExamples;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DtatOutputStreamExample {

    public static void main(String[] args) throws Exception {
        int emp = 101;
        double sallary = 34500.50;
        boolean isParmanet = true;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\WIN\\Desktop\\chetan\\empInfo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(emp);
        dos.writeDouble(sallary);
        dos.writeBoolean(isParmanet);
        dos.close();
        fos.close();
        System.out.println("data write succefully");
    }
}
