package mypkg;

import java.util.Scanner;

public class UpperToLower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch, lower;
        System.out.print("enter a charcter : ");
        ch = sc.next().charAt(0); //B
        lower = (char) ((int) ch + 32);
        System.out.println("lower case : " + lower);
    }

}
