package mypkg;

class parent {

    int data = 12;

    void show() {
        System.out.println("parent show : " + data);
    }

    void disp() {
        System.out.println("parent disp : " + data);
    }
}

class child extends parent {

    int data = 80;

    void show() {
        System.out.println("child show : " + super.data);
//        System.out.println("child show : " + data);
//        super.show();
//        disp();
    }

    void anothetmetod() {
        super.show();
    }
}

public class SuperExample {

    public static void main(String[] args) {
//        parent p1 = new parent();
//        p1.show();
        child c1 = new child();
        c1.anothetmetod();
    }

}
