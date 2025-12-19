package multithreadingExample;

class TwoTablePrint extends Thread {

    void tablePrint() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + 2 * i);
        }
    }

    public void run() {
        tablePrint();
    }
}

class ThreeTablePrint extends Thread {

    void tablePrint() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(3 + " * " + i + " = " + 3 * i);
        }
    }

    public void run() {
        tablePrint();
    }
}

public class MultithreadingExampleOne {

    public static void main(String[] args) {
        TwoTablePrint t1 = new TwoTablePrint();
        ThreeTablePrint t2 = new ThreeTablePrint();
        t1.start();
        t2.start();

    }
}
