package CollectionExample;

import java.util.Stack;

public class WrappingUnrapping {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        int num = 12;
        Integer o1 = new Integer(num);  //wrraping a integer value in integer object
        s1.push(o1);
        o1 = (Integer) s1.pop();
        num = o1.intValue(); // unrapping integer value
        System.out.println(num);
        System.out.println(s1);
        s1.push(new Integer(90)); //wrraping
        s1.push(new Integer(34));
        s1.push(78); // autoboxing
        System.out.println(s1);

    }
}
