package mypkg;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age;
//        System.out.print("enter your age : ");
//        age = sc.nextInt();
//        System.out.println("value of age = " + age);

//        float height;
//        System.out.print("enter your Height : ");
//        height = sc.nextFloat();
//        System.out.println("value of height = " + height);


//        take single word string
//        String name;
//        System.out.print("enter your name : ");
//        name = sc.next();
//        System.out.println("name : " + name);


//    take a line from user
//        String name;
//        System.out.print("enter your name : ");
//        name = sc.nextLine();
//        System.out.println("name : " + name);


// take a single char
        char ch;
        System.out.print("enter a char : ");
        ch = sc.next().charAt(0);
        System.out.println("character : " + ch);
    }

}
