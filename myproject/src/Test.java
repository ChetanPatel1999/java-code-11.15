
public class Test {

    public void show() {
        System.out.println("hello i am show method");
    }

    static void display() {
        System.out.println("hi i am display");
    }

    void add(int a, int b, int d) {
        int c = a + b;
        float g = 12.56f;
    }

    public static void main(String[] a) {
        System.out.println(a.length);
        System.out.println("hello i am main method");
        display();
        Test t1 = new Test();
        t1.show();
        t1.add(12, 6, 9);
        System.out.println("main method is end");

    }
}
