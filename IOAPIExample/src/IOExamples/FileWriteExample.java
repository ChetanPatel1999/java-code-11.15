package IOExamples;

import java.io.FileWriter;

public class FileWriteExample {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\WIN\\Desktop\\chetan\\demo.txt");
        String s = "hello my name is chetan patel and i am teacher";
//        fw.write(s);
        fw.write(s,6,15);
        fw.close();

    }
}
