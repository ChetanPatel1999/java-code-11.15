package newpackage;

import mypkg.AccessModifire;
import mypkg.AccessModifireExample;

class Trial {

    void show() {
        AccessModifireExample k1=new AccessModifireExample();
        System.out.println(k1.height);
    }
}

public class Test extends AccessModifireExample {

    void show() {
        System.out.println(height);
        System.out.println(rno);
//        System.out.println(price);
    }

    public static void main(String[] args) {
        AccessModifireExample o1 = new AccessModifireExample();
        System.out.println(o1.rno);

//        System.out.println(o1.price);
    }
}
