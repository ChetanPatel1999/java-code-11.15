package IOExamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) throws Exception {
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\WIN\\Desktop\\ram\\gourav.txt"); // delete privius data and only new data write inside file
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\WIN\\Desktop\\ram\\gourav.txt",true);// append data nside file 
//        fos.write(65);
//        fos.write(66);
//        fos.write(67);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\WIN\\Desktop\\ram\\gourav.txt");
//        byte[] b = {65, 66, 67, 68, 69, 70, 71};
        String s1 = "hello i am chetan patel";
        byte[] b = s1.getBytes();
//        fos.write(b);
        fos.write(b,6,11);
        fos.close();
    }

}
