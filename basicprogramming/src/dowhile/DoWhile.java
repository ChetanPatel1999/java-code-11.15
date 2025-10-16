package dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("papa please purchesed bike");
            System.out.print("press 1 if bike is not purches ");
            num = sc.nextInt();
        } while (num == 1);
        System.out.println("thanks for bike papa");

    }
}
