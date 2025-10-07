package switchCase;

import java.util.Scanner;
public class StateName {

    //wap to print state full name according to state short name.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter state short name : ");
        String stateName=sc.next();
        switch(stateName)
        {
            case "mp":System.out.println("madhya pradesh");break;
            case "rj":System.out.println("rajsthan");break;
            case "mh":System.out.println("maharashtra");break;
            case "gj":System.out.println("gujrat");break;
            case "up":System.out.println("utter pradesh");break;
            default:System.out.println("wrong short state name");
        }
    }
}
