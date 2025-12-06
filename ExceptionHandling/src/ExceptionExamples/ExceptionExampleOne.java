package ExceptionExamples;

import java.util.Scanner;

public class ExceptionExampleOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 34, 56, 78, 90};
        int index = 0;
        System.out.print("enter a index : ");
        index = sc.nextInt(); //3
        try {
            index = sc.nextInt(); //3
        } catch (Exception e) {
            System.out.println("input data type is wrong");
        }
        try {
            System.out.println("valeu of given index : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.out.println("wrong index");
        }
        System.out.println("code run succefully1");
        System.out.println("code run succefully2");
        System.out.println("code run succefully3");

    }
}
