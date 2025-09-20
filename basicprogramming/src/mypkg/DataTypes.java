package mypkg;

public class DataTypes {

    static boolean b;   //class /static variable
    static int age;   // class /static varaible
    static float height;   // class /static varaible
    int rno;   // instance/non static varaible
    String name; // instance/non static varaible

    void show() {
        int a;  // local variable
//        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 32768; // local variabel
        short h;   // local varible
        boolean ispass;
//        System.out.println(ispass);
//        System.out.println(h);   
        System.out.println(height);
        System.out.println(b);
        System.out.println(age);
        System.out.println(56 > 9);
        System.out.println(a);
        System.out.println("size of byte in bit = " + Byte.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Character.SIZE);

    }
}
