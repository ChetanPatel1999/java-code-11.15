package ExceptionExamples;

import java.util.Arrays;

public class ExceptionExampleFive {

    public static void main(String[] args) {
        System.out.println("main method is start...");
        int res = 0;
        int[] arr = {12, 34, 56, 50, 90};
        System.out.println(Arrays.toString(arr));
        try {
            res = arr[3] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you enter wrong input");
        } finally {
            System.out.println("----its finally block and always run----??");
        }
        System.out.println("value at given index = " + res);
        System.out.println("main method is end");
    }
}
