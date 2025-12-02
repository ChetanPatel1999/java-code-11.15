package mypkg;

public class AccessModifire {

    void test() {
        BaseClass o1 = new BaseClass();
        System.out.println(o1.b);
        System.out.println(o1.c);
    }

    public static void main(String[] args) {
        BaseClass o1 = new BaseClass();
        System.out.println(o1.b);

    }

}
