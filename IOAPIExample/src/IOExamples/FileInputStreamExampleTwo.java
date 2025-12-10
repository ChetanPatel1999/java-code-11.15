package IOExamples;

import java.io.FileInputStream;

public class FileInputStreamExampleTwo {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\Win\\Desktop\\ram\\title.txt");
//        System.out.println(fis.available());//return avialble bytes after read
//        int n = fis.read();
//        System.out.println((char) n);
//        n = fis.read();
//        System.out.println((char) n);
//        System.out.println(fis.available());

//        System.out.println((char) fis.read());//A
//        System.out.println((char) fis.read());//B
//        fis.skip(2);//C D //its skip character
//        System.out.println((char) fis.read());//E
        int n = fis.available();
        byte[] arr = new byte[n];
        int res = fis.read(arr);
//        System.out.println(res);
//         fis.read(arr, 5, 13);
//        for (byte b : arr) {
//            System.out.print((char) b);
//        }
//        System.out.println("");
        String ans = new String(arr);
        System.out.println(ans);
        fis.close();
    }
}
