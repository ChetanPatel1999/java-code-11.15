package mypkg;

final class Parent {

    final void show() {
        System.out.println("parent show method is called");
    }
}

class Child extends Parent {

    void show() //here we override parent class show method
    {
        System.out.println("child show method is called");
    }
}

 public class OverridingExample {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
    }
}
