package Operators;

public class CompoundAssignment {

    public static void main(String[] args) {
        int a = 12, b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//        a += b;
//        a += 3;
//        a -= b;
//        b -= b;
//        a *= 4;
        a *= b;
        System.out.println("a = " + a);//
        System.out.println("b = " + b);//
    }
}
