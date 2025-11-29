package mypkg;

public class ResultProcessing {

    public static void main(String[] args) {
        final int a = 12;
//        a=5;
        int c = 8 + a;
        System.out.println(a);

        EngStud s1 = new EngStud("raja", 101, "CS", 5);
//        s1.setStudent("raja", 101);
//        s1.setEngStud("CS", 5);
        s1.getStudent();
        s1.getEngStud();
        s1.result(35);

//        MediStud s2 = new MediStud();
//        s2.setStudent("mahi", 102);
//        s2.setMediStud(2, "artho");
//        s2.getStudent();
//        s2.getMediStud();
//        s2.result(40);
        Student s5 = new MediStud("yogesh", 106, 3, "dental");
        s5.getStudent();
        s5.result(45);

        Object o1, o2;
        o1 = new Student("aa", 12);
        o2 = new MediStud("bb", 12, 45, "abc");
    }
}
