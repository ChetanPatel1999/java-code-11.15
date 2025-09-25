package mypkg;

public class IndividulDigitSum {

    public static void main(String[] args) {
        int num = 178;
        int r, s, t, sum;
        r = num / 100;
        s = (num / 10) % 10;
        t = num % 10;
        sum = r + s + t;
        System.out.println("sum of individul digit = " + sum);
    }

}
