package StringExamples;

public class StringProblems {

    public static void main(String[] args) {
        //Write a program to count the number of words in a string.
//        String s1 = "hello how are you brother";
//        StringTokenizer res = new StringTokenizer(s1);
//        System.out.println("total word in string = " + res.countTokens());
//        String s1 = "hello how are";
//        int count = 1;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        System.out.println("total word in string = " + count);

//        String s1 = "indore";
//        StringBuffer res = new StringBuffer(s1);
//        for (int i = 0; i < res.length(); i++) {
//            res.setCharAt(i, (char)((int) res.charAt(i) - 32));
//        }
//        System.out.println(res);
        String s1 = "indore";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 = s2 + (char) ((int) s1.charAt(i) - 32);
        }
        System.out.println(s2);
    }
}
