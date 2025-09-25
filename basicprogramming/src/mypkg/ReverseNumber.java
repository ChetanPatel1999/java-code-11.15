package mypkg;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 234;
        int r, s, t, rev;
        r = num / 100;
        s = (num / 10) % 10;
        t = num % 10;
        rev = r + s * 10 + t * 100;
        System.out.println("reverse number = " + rev);
    }

}
