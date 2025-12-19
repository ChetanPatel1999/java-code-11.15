package multithreadingExample;

import java.util.Scanner;

public class ThreadExample extends Thread {

    public void run() {
        String s = getName();
        System.out.println(s + " stmnt 1");
        System.out.println(s + " stmnt 2");
        if (s.equals("BB")) {
            Scanner sc = new Scanner(System.in);
            sc.next();
        }
        System.out.println(s + " stmnt 3");
        System.out.println(s + " stmnt 4");
    }

    public static void main(String[] args) {
        System.out.println("main funct is start ----");
        ThreadExample t1 = new ThreadExample();
        t1.setName("AA");
        ThreadExample t2 = new ThreadExample();
        t2.setName("BB");
        ThreadExample t3 = new ThreadExample();
        t3.setName("CCC");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main function is end----");
    }
}
