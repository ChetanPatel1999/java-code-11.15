package elseif;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        String country;
        Scanner sc = new Scanner(System.in);
        country = sc.next();
        if (country.equals("india")) {
            System.out.println("you are indian");
        } else {
            System.out.println("you are not indian");
        }
    }
}
