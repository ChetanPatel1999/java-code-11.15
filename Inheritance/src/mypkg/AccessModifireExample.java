package mypkg;

class BaseClass {

    private int a = 90;
    public int b = 90;
    int c = 120;
    protected int d = 150;

    public void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class ChildClass extends BaseClass {

    public void disp() {
        BaseClass b2 = new BaseClass();
//        System.out.println(b2.a);
//        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class OtherClass {

    public void disp() {
        BaseClass b2 = new BaseClass();
//        System.out.println(b2.a);
//        System.out.println(a);
        System.out.println(b2.b); //public
        System.out.println(b2.c);  //default
        System.out.println(b2.d);   //protected
    }
}

public class AccessModifireExample {

    public int rno = 89;
    int price = 600;
    protected int height = 5;

    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        b1.d = 900;
//        b1.show();
        OtherClass o1 = new OtherClass();
        o1.disp();

    }
}
