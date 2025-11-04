package class_and_object;

public class Student {

    private String name;
    private int rno;
    private float per;

    public void setStudent(String n, int r, float p) {
        name = n;
        rno = r;
        per = p;
    }

    public void getResultCard() {
        System.out.println("Student Result Card :");
        System.out.println("Student Name:" + name);
        System.out.println("Student roll No:" + rno);
        System.out.println("Student percentage:" + per);
        if (per >= 33) {
            System.out.println("Student Pass");
        } else {
            System.out.println("Student Fail");
        }
        System.out.println("-----------------------------");
    }
}
