package Operators;

public class IncrementOperator {

    public static void main(String[] args) {
        int a = 12, b;
        System.out.println("a = " + a);
//      b = ++a;
        b = a++;
        System.out.println("a = " + a);//13
        System.out.println("b = " + b);//12
    }
}
