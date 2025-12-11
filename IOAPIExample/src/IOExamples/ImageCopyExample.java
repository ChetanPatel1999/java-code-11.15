package IOExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyExample {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\WIN\\Desktop\\mohit\\home.png");
        int n = fis.available();
        byte[] b = new byte[n];
        fis.read(b);
        fis.close();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\WIN\\Desktop\\ram\\ghar.png");
        fos.write(b);
        fos.close();
    }
}
