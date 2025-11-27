package mypkg;

abstract class Base //abstract class
{
    abstract void m1();  //abstract method

    abstract void m2();  //abstract method

    void m3() //concreat method
    {
        System.out.println("Base class m3 is called");
    }

    void m4() //concreat method
    {
        System.out.println("Base class m4 is called");
    }
}

class Derived extends Base {

    void m1()// override abstract method
    {
        System.out.println("Derived class m1 method");
    }

    void m2()// override abstract method
    {
        System.out.println("Derived class m2 method");
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.m1();
        d1.m2();
        d1.m3();
        d1.m4();
    }
}
