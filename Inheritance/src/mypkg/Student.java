package mypkg;

public class Student {

    private String name;
    private int rno;

    public void setStudent(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    public void getStudent() {
        System.out.println("name :" + this.name);
        System.out.println("rno :" + this.rno);
    }
}
