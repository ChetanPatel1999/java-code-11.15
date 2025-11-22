package mypkg;

class parent1 {

    parent1() {
        System.out.println("0 args parent constructor is called");
    }

    parent1(int a) {
        System.out.println("1 args parent constructor is called");
    }

    parent1(int a, int b) {
        System.out.println("2 args parent constructor is called");
    }

}

class child1 extends parent1 {

    child1() {
        super(3, 5);
        System.out.println("0 args child constructor is called");

    }

    child1(int a) {
        super(12, 56);
        System.out.println("1 args child constructor is called");
    }

    child1(int a, int b) {
        this(12);
        System.out.println("2 args child constructor is called");
    }
}

public class ConstructorExampelInInheritance {

    public static void main(String[] args) {
        child1 c1 = new child1(12,89);
    }
}
