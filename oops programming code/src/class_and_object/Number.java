package class_and_object;

public class Number {

    private int num1;
    private int num2;

    public void setNumber(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void getNumber() {
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("-----------------");
    }

    public void addition() {
        System.out.println("addition = " + (num1 + num2));
    }

    public void additionDifferentObject(Number obj) {
        System.out.println("additionNum1 = " + (num1 + obj.num1));
        System.out.println("additionNum2 = " + (num2 + obj.num2));

    }

    
    public static void additionDifferentObj(Number obj1, Number obj2) {
        System.out.println("additionNum1 = " + (obj1.num1 + obj2.num1));
        System.out.println("additionNum2 = " + (obj1.num2 + obj2.num2));

    }

}
