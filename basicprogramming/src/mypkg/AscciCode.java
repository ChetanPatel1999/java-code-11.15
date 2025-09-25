package mypkg;

import java.util.Scanner;

public class AscciCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("enter a charcter : ");
        ch = sc.next().charAt(0);
        System.out.println("ascci code of " + ch + " = " + (int) ch);
    }

}
