package mypkg;

public class Student {

    private String name;
    private int rno;

    public Student(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    public void getStudent() {
        System.out.println("name :" + this.name);
        System.out.println("rno :" + this.rno);
    }

    public void result(int per) {
        if (per >= 33) {
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
        }
    }

}
