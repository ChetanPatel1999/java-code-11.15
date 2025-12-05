package StringExamples;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "gourav";
        String s3 = "yogesh";
        String s4 = "pawan";
//        StringJoiner res = new StringJoiner(" ");
        StringJoiner res = new StringJoiner(",", "{", "}");
//        res.add(s1);
//        res.add(s2);
//        res.add(s3);
//        res.add(s4);
//        System.out.println(res);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            s1 = sc.next();
            res.add(s1);
        }
        System.out.println(res);
    }
}
