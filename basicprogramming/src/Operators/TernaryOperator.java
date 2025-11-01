package Operators;

public class TernaryOperator {

    public static void main(String[] args) {
//        String s1 = (12 > 66) ? "hello" : "by";
//        System.out.println(s1);

//        int age;
//        age = 12;
//        String res = (age >= 18) ? "you can vote" : "you can not vote";
//        System.out.println(res);
//        int age;
//        age = 12;
//        System.out.println((age >= 18) ? "you can vote" : "you can not vote");
//        int a = 126, b = 556;
//        int res = a > b ? a : b;
//        System.out.println("gretest num = " + res);
//        int a = 67, b = 67;
//        String s = a == b ? "num are same" : "num are diffi";
//        System.out.println(s);
        int a = 182, b = 77, c = 56;
        int res = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(res);

    }
}
