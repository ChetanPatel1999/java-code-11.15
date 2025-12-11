package IOExamples;

import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\WIN\\Desktop\\chetan\\demo.txt");
        char[] ch = new char[20];
        fr.read(ch);
//        for(char c:ch)
//        {
//            System.out.print(c);
//        }
        String s=new String(ch);
        System.out.println(s);
    }

}
