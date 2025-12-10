package IOExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter file path : ");
        String filePath;
        filePath = sc.next();
//        file open
        FileInputStream fis = new FileInputStream(filePath);
        //file read
        int n;
        while (true) {
            n = fis.read();
            if (n == -1) {
                break;
            }
            System.out.print((char) n);
        }
        System.out.println("");
        //file close
        fis.close();
    }
}
