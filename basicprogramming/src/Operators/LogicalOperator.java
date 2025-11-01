package Operators;

public class LogicalOperator {

    public static void main(String[] args) {
//        System.out.println(false && true);
//        System.out.println(true && true);
//        System.out.println(false && false);
        boolean res;
//        res = 12 > 7 && 8 > 6 && 4 == 5;
        res = 12 > 7 || 8 > 6 || 4 == 5;
        System.out.println(res);
    }
}
