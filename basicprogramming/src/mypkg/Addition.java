package mypkg;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("enter num1 : ");
        num1 = sc.nextInt();//56
        System.out.print("enter num2 : ");
        num2 = sc.nextInt();// 8

        sum = num1 + num2;

//        System.out.println("sum of " + num1 + " and " + num2 + " = " + sum);
        System.out.printf("sum of %d and %d = %d\n", num1, num2, sum);

    }

}
