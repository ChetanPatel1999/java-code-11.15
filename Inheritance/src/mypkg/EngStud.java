package mypkg;

public class EngStud extends Student {

    private String branch;
    private int sem;

    public EngStud(String name, int rno, String branch, int sem) {
        super(name, rno);
        this.branch = branch;
        this.sem = sem;
    }

    public void getEngStud() {
        System.out.println("branch : " + this.branch);
        System.out.println("sem : " + this.sem);
        System.out.println("------------------------");
    }
}
