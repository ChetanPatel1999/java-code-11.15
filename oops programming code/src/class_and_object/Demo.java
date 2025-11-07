package class_and_object;

public class Demo {

    public int a;   // non static/instance
    public int b;  // non static/instance
    public static int p;//  static /class 
    public static int q;//  static /class 

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        d1.a = 12;
        d1.b = 13;
        d2.a = 14;
        d2.b = 15;
        d3.a = 16;
        d3.b = 17;

        d1.p = 400;
        d1.q = 500;
        d2.p = 600;
        d2.q = 700;
        d3.p = 800;
        d3.q = 900;

        System.out.println(d1.a + "," + d1.b);
        System.out.println(d2.a + "," + d2.b);
        System.out.println(d3.a + "," + d3.b);

        System.out.println(d1.p + "," + d1.q);
        System.out.println(d2.p + "," + d2.q);
        System.out.println(d3.p + "," + d3.q);

    }
}
