package class_and_object;

public class Student {

    private String name="deepu";
    private int rno;
    private float per;
    private static int totalpass=0;
    private static int totalfail=0;
    private static int totalstudent=0;
    private static String collageName="hello world institue";

    public void setStudent(String n, int r, float p) {
        name = n;
        rno = r;
        per = p;
        totalstudent++;
        if (per >= 33) {
            totalpass++;
        } else {
            totalfail++;
        }

    }

    public void getResultCard() {
        System.out.println("Student Result Card :");
        System.out.println("collage name  :"+collageName);
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

    public void getTotalResult() {
        System.out.println("total pass = " + totalpass);
        System.out.println("total fail = " + totalfail);
        System.out.println("-----------------------------");
    }

    public void getTotalStudent() {
        System.out.println("total student = " + totalstudent);
        System.out.println("-----------------------------");
    }
}
