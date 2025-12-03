package StringExamples;

public class Test {

    private int x;
    private int y;

    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getData() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    void changeData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void change() {
        x++;
        y++;
    }

    int getX() {
        return x;
    }

}

class TestUser {

    public static void main(String[] args) {
        Test t1 = new Test(12, 8);
        t1.change();
        t1.change();
        t1.changeData(45, 78);
        t1.getData();
        int res = t1.getX();
        System.out.println(res);
    }
}
