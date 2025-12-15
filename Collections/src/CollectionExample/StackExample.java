package CollectionExample;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(34);
        s1.push(67);
        s1.push(28);
        s1.push(90);
        System.out.println(s1);
        System.out.println("pop element is = " + s1.pop());
        System.out.println(s1);
    }
}
