package StringExamples;

public class StringExampleOne {

    public static void main(String[] args) {
//        String s1 = new String();
//        String s1 = new String("hello");
        char[] ch = {'n', 'a', 'n', 'd', 'a', 'n', 'i'};
//        String s1 = new String(ch);
        String s1 = new String(ch, 4, 2);
        System.out.println(s1);

        byte[] arr = {65, 66, 67, 68, 69, 70};

        String s2 = new String(arr); //ABCDEF
        String s3 = new String(arr, 2, 3); //CDE

        System.out.println(s2);
        System.out.println(s3);

        int[] arrInt = {65, 66, 67, 68, 69, 70};
        String s4 = new String(arr, 2, 3); //CDE
        System.out.println(s4);
    }
}
//String constructor 
// length() :-  its given string length
// String() // 0 arg constructor in string 
// String(string) //  here we can pass string 
// String(char []ch)  // here we pass char array
// String(char[] value, int offset, int count)   // here we pass char array and starting index(offset) ,count
//String(byte[] bytes)   //here we pass byte aray
//String(byte[] bytes, int offset, int length)
