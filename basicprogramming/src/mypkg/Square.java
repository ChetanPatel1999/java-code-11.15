package mypkg;
import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, square;
        System.out.print("enter a num : ");
        num = sc.nextInt();
        square= num*num;
        System.out.printf("square of %d = %d\n",num,square);
    }

}
