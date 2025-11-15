
public class Exam {

    private int num1;
    private int num2;
    private int num3;

    Exam(int a) {
        num1 = a;
    }

    Exam(int a, int b) {
        this(a);
        num2 = b;
    }

    Exam(int a, int b, int c) {
        this(a, b);
        num3 = c;
    }

    static void greet() {
        System.out.println("hello good morning !");
    }

    static void show() {
        greet();
        System.out.println("how are you ?");
    }

    public void display() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }

    public static void main(String[] args) {
        Exam e1 = new Exam(12);
        e1.display();
    }
}
