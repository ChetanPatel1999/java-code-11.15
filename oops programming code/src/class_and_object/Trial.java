package class_and_object;

public class Trial {

    private int x, y;

    public Trial(int a, int b) {
        x = a;
        y = b;
    }

    public boolean equals(Trial obj) {
        if (x == obj.x && y == obj.y) {
            return true;
        } else {
            return false;
        }
    }

    public void getData() {
        int x = 800;
        System.out.println("local x = " + x);//800
        System.out.println("x = " + this.x);//12
        System.out.println("y = " + y);//5
    }

    public static void main(String[] args) {
//        Trial t1 = new Trial(12, 5);
//        Trial t2 = new Trial(12, 5);
//        Trial t3 = t1;
//        boolean res1 = t1 == t2;
//        boolean res2 = t1.equals(t2);
//        System.out.println(res1);//

//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

//string constant pool
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
