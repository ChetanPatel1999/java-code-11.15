package class_and_object;

public class Test {

    private int x, y;   // instance variable

    Test() // non parameterized constructor
    {
        x = 500;
        y = 1000;
    }

    Test(Test obj)//copy constructor
    {
        x = obj.x;
        y = obj.y;
    }

    Test(int a) {
        System.out.println("1 args constructor called");
    }

    Test(int a, int b)//parameterized constructor
    {
        x = a;
        y = b;
    }

    Test(int a, int b, int c) {
        System.out.println("2 args constructor called");
    }

    void display() {
        System.out.println("hi i am display");
    }

    void setData(int a, int b) {
        x = a;
        y = b;
    }

    void getData() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {

        Test t1 = new Test(56, 78);
        Test t2 = new Test(t1);
        Test t3 = new Test();
        t1.getData();
        t2.getData();
        

//        Test t1 = new Test(12, 5);
//        Test t2 = new Test(55, 8);
//        
//        t1.getData();
//        t1.setData(25, 22);
//        t1.getData();
//        t1.setData(70, 60);
//        t1.getData();
//        t2.getData();
    }
}
