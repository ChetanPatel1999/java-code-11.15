package mypkg;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius, area;
        final float PI=3.141f;
        System.out.println("enter radius : ");
        radius=sc.nextFloat();
        area= PI*radius*radius;
        System.out.println("circle area : "+area);
        
        
        
        
    }

}
