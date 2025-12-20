package multithreadingExample;

import java.util.Scanner;

public class ThreadExample extends Thread {
    
    public void run() {
        String s = getName();
        System.out.println(s + " stmnt 1");
        System.out.println(s + " stmnt 2");
        if (s.equals("AA")) {
//            Scanner sc = new Scanner(System.in);
//            sc.next();
        }
        System.out.println(s + " stmnt 3");
        System.out.println(s + " stmnt 4");
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("main funct is start ----");
        ThreadExample t1 = new ThreadExample();
        t1.setName("AA");
        ThreadExample t2 = new ThreadExample();
        t2.setName("BB");
        ThreadExample t3 = new ThreadExample();
        t3.setName("CCC");
//        t1.setPriority(NORM_PRIORITY);
//        t2.setPriority(10);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());

        t1.start();
        Thread.sleep(2000);
//        t1.join();
//        t1.join(2000);
        t2.start();
        t3.start();
        System.out.println("main function is end----");
    }
}
