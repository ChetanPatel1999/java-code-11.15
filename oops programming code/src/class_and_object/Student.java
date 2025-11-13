package class_and_object;

public class Student {

    private String name;
    private int rno;
    private float per;
    private static int totalpass = 0;
    private static int totalfail = 0;
    private static int totalstudent = 0;
    private static String collageName;

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

    public void getResultCard() // non static method    
    {
        System.out.println("Student Result Card :");
        System.out.println("collage name  :" + collageName);
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

    public static void getTotalResult() {
        System.out.println("total pass = " + totalpass);
        System.out.println("total fail = " + totalfail);
        System.out.println("-----------------------------");
    }

    public static void getTotalStudent() {
        System.out.println("total student = " + totalstudent);
        System.out.println("-----------------------------");
    }

    public static void classInfo() {
        System.out.println("hi i am student class");
        System.out.println("i have 4-5 methods");
    }

    public static void setCollageName(String c) {
        collageName = c;
    }

//    public void average(Student obj) {
//        float ave;
//        ave = (per + obj.per) / 2;
//        System.out.println("avrage of " + name + " and " + obj.name + " = " + ave);
//    }
//    public static void average(Student obj1, Student obj2) {
//        float ave;
//        ave = (obj1.per + obj2.per) / 2;
//        System.out.println("avrage of " + obj1.name + " and " + obj2.name + " = " + ave);
//    }
//
//    public static void average(Student obj1, Student obj2, Student obj3) {
//        float ave;
//        ave = (obj1.per + obj2.per + obj3.per) / 3;
//        System.out.println("avrage of " + obj1.name + " and " + obj2.name + " and " + obj3.name + " = " + ave);
//    }
    //varargs method
    public static void average(Student... obj) {
        float ave;
        float sum = 0;
        int i;
        for (i = 0; i < obj.length; i++) {
            sum = sum + obj[i].per;
        }
        System.out.println("averege =  " + (sum / obj.length));
    }

    public static void greterMarks(Student obj1, Student obj2) {
        if (obj1.per > obj2.per) {
            System.out.println(obj1.name + " have greater marks from " + obj2.name);
        } else {
            System.out.println(obj2.name + " have greater marks from " + obj1.name);

        }
    }

}
