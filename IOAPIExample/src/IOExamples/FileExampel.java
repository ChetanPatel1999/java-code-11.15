package IOExamples;

import java.io.File;

public class FileExampel {

    public static void main(String[] args) {
        File fis = new File("C:\\Users\\WIN\\Desktop\\ram\\title.txt");
//        System.out.println(fis.canWrite());
//        System.out.println(fis.isHidden());
//        if (fis.isDirectory()) {
//            String[] filesList = fis.list();
//            for (String file : filesList) {
//                System.out.println(file);
//            }
//        }
//        else
//        {
//            System.out.println("demo is not a folder");
//        }
    }
}
//fis.exists() :- check file is exist or not
//fis.length() :- its return length of file
//fis.isDirectory() :- its check file is foleder or file if folder ans is true
//fis.isFile()  :- its check given name is file or folder
//fis.list() :- itsd return a string array of file name inside folder
//fis.isHidden() :- ists chekc file is hidden or not
//fis.canWrite() :- we can only read file 