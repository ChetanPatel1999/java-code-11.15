package mypkg;

public class TypeConversion {

    public static void main(String[] args) {
//        int a = 12;
//        long b = 67L;
//        char ch = 'h';
//        float k = 56.78f;
        int h = 'A'; // no error here perform implicite type casting
        int f = (int) 12.56;  // lossy conversion   here we perform explicite type conversion
        //  int k = (int)"12"; //  here type string type is not convertable in int
        float v1 = (float) 34.56;
        float v2 = 89;
        char ch = 68;   // perform impicite type conversion
        char v4 = 'B';
        System.out.println(f);
        System.out.println(h);
        System.out.println(ch);
        System.out.println((int)v4);
        System.out.println((float)v4);
    }
}
