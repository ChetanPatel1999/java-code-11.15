package StringExamples;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String s1 ="indore,ujjain,ratlam,mhow";
//        StringTokenizer res = new StringTokenizer(s1);
        StringTokenizer res = new StringTokenizer(s1, ",");
        System.out.println(res.countTokens());
//        System.out.println(res.hasMoreTokens());
//        System.out.println(res.nextToken());
//        System.out.println(res.nextToken());
//        System.out.println(res.hasMoreTokens());
//        System.out.println(res.nextToken());
//        System.out.println(res.hasMoreTokens());
        while (res.hasMoreTokens()) {
            System.out.println(res.nextToken());
            System.out.println(res.countTokens());
        }

    }

}
