package CollectionExample;

import java.util.Stack;

class Emp {

    int id;
    double sallary;

    Emp(int id, double sallary) {
        this.id = id;
        this.sallary = sallary;
    }

    void display() {
        System.out.println("emp info ");
        System.out.println("emp id : " + id);
        System.out.println("emp sallary : " + sallary);
    }
}

public class StackExampleThree {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(new Emp(101, 1200));
        s1.push(new Emp(102, 1500));
        Emp e = (Emp) s1.pop();
        e.display();
    }
}
