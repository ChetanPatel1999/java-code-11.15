package mypkg;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("enter num1 : ");
        num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("sum of" + num1 + "and " + num2 + " = " + sum);
    }

}
