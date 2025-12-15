package CollectionExample;

class Test {

    void display(Object data) {
        System.out.println("data = " + data);
    }
}

public class AutoBoxingUnboxing {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display(12); //autoboxing
        t1.display(67.89);
        t1.display('j');
        t1.display("hello");
    }
}
