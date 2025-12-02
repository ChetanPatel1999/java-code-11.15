package mypkg;

import java.util.Arrays;
import java.util.Scanner;

class Emp {

    int id;
    double sallary;

    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter emp id : ");
        this.id = sc.nextInt();
        System.out.print("enter emp sallary : ");
        this.sallary = sc.nextDouble();
    }

    void getEmp() {
        System.out.println("\nemp info : ");
        System.out.println("emp id : " + id);
        System.out.println("emp sallary : " + sallary);
        System.out.println("---------------------------");
    }
}

public class ArrayExample {

    static void arr1() {
        int[] marks = {12, 34, 56, 78, 90};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

    }

    static void arr2() {
        int[] marks = {12, 34, 56, 78, 90};
//        System.out.println(marks.length);
        System.out.print("array eleement are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
    }

    static void arr3() {
        double[] marks = {12.45, 34.2, 56, 78.44, 90};
        System.out.print("array eleement are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
    }

    static void arr4() {
        int[] marks = {12, 34, 56, 78, 90};
        System.out.print("array eleement are : ");
        for (int num : marks) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    static void arrSum() {
        int[] marks = {12, 34, 56, 78, 90};
        int sum = 0;
        System.out.print("array eleement are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
            sum = sum + marks[i];
        }
        System.out.println("");
        System.out.println("array sum = " + sum);
    }

    static void arrEvenElement() {
        int[] marks = {12, 33, 56, 77, 90};
        System.out.print("array eleement are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
        int count = 0;
        System.out.print("array even element are : ");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] % 2 == 0) {
                System.out.print(marks[i] + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("Even element count : " + count);
    }

    static void arrReverse() {
        int[] marks = {12, 34, 56, 78, 90};
        System.out.print("array eleement are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
        System.out.print("array element in reverse are : ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
    }

    static void arr5() {
        int[] arr = new int[5]; //create a array of size 5 with 0 value assign
        arr[0] = 12;
        arr[1] = 17;
        arr[2] = 8;
        arr[3] = 35;
        arr[4] = 22;
        System.out.println(Arrays.toString(arr));
    }

    static void arr6() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    static void arr7() {
//        String[] cities = new String[5];
//        cities[0] = "indore";
        String[] cities = {"indore", "ujjain", "ratlam"};
        for (String city : cities) {
            System.out.println(city);
        }

    }

    public static void main(String[] args) {
//        Emp e1=new Emp();
//        e1.setEmp();
//        e1.getEmp();

        Emp[] employ = new Emp[3];
        for (int i = 0; i < employ.length; i++) {
            employ[i] = new Emp();
        }

        for (int i = 0; i < employ.length; i++) {
            employ[i].getEmp();
        }
    }
}
