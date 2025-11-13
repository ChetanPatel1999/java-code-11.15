package class_and_object;

public class MethodOvelodingExample {

    static public void add(float a) {
        int c;
        c = (int) (a + a);
        System.out.println("sumfloat = " + c);
    }

    static public void add(char a) {
        int c;
        c = (a + a);
        System.out.println("sumchar = " + c);
    }

    static public void add(int a, int b) {
        int c;
        c = a + b;
        System.out.println("sum = " + c);
    }

    static public void add(int a) {
        int c;
        c = a + a;
        System.out.println("sumint = " + c);
    }

    static public void add(float a, int b) {
        float c;
        c = a + b;
        System.out.println("sumFloatInt = " + c);
    }

    static public void add(int a, float b) {
        float c;
        c = a + b;
        System.out.println("sumIntFloat = " + c);
    }

    static public void add(int a, int b, int c) {
        int d;
        d = a + b + c;
        System.out.println("sum = " + d);
    }

    static public void add(int a, int b, int c, int d) {
        int e;
        e = a + b + c + d;
        System.out.println("sum = " + e);
    }

    public static void main(String[] args) {
        add(7);
        add(7, 5);
        add(7, 5, 10);
        add(7, 5, 10, 8);
//        add(12, 34);
//        add(3, 6, 7);
//        add(7);
//        add(7.3f);
//        add('A');
//        add(12.4f, 10);
//        add(12, 10.5f);
    }
}
