package multithreadingExample;

class One implements Runnable {

    public void run() {
        System.out.println("Onestmnt 1");
        System.out.println("Onestmnt 2");
        System.out.println("Onestmnt 3");
    }
}

class Two implements Runnable {

    public void run() {
        System.out.println("twostmnt 1");
        System.out.println("twostmnt 2");
        System.out.println("twostmnt 3");
    }
}

public class ThreadExampleThree {

    public static void main(String[] args) {
        Two o1 = new Two();
        One o2 = new One();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();
    }
}
