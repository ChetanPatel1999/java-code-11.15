package class_and_object;

public class VarArgsExample {

//    public static void add(int... a) {
//        int i;
//        for (i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println("---------------");
//    }
    public static void add(String b, int... a) //[7,5,10]
    {
        int i, sum = 0;
        for (i = 0; i < a.length; i++)//3
        {
            sum = sum + a[i];//22
        }
        System.out.println("b =" + b);
        System.out.println("sum = " + sum);
        System.out.println("---------------");
    }

    public static void add(int... a) //[7,5,10]
    {
        int i, sum = 0;
        for (i = 0; i < a.length; i++)//3
        {
            sum = sum + a[i];//22
        }
        System.out.println("sum = " + sum);
        System.out.println("---------------");
    }

    public static void add(int a, int b) //[7,5,10]
    {
        System.out.println("SUM A+B = " + (a + b));

        System.out.println("---------------");
    }

    public static void add(float... a) //[7,5,10]
    {
        int i;
        float sum = 0;
        for (i = 0; i < a.length; i++)//3
        {
            sum = sum + a[i];//22
        }
        System.out.println("sum = " + sum);
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        add(12, 500);
        add("hello", 7, 5, 10);
        add(7, 5, 10);
        add(7, 5, 10, 8.6f);
        add(7, 5, 10, 8, 20);
    }

}
