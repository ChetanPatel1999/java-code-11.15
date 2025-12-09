package IOExamples;

import java.io.File;
import java.io.IOException;

public class FileClassExampleTwo {

    public static void main(String[] args) throws IOException {
        File fo = new File("C:\\Users\\WIN\\Desktop\\ram\\demo.txt");
        File newName = new File("C:\\Users\\WIN\\Desktop\\ram\\yogesh.txt");
//        fo.renameTo("yogesh.txt");
        fo.renameTo(newName);
//        fo.delete();
//        fo.createNewFile();
//        fo.mkdir();
        System.out.println(fo.exists());
    }
}
// fo.createNewFile() :- its create new file
// fo.mkdir(); :- its make new folder 
// fo.delete(); :- delete folder or files

