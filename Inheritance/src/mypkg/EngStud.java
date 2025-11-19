package mypkg;

public class EngStud extends Student {

    private String branch;
    private int sem;

    public void setEngStud(String branch, int sem) {
        this.branch = branch;
        this.sem = sem;
    }

    public void getEngStud() {
        System.out.println("branch : " + this.branch);
        System.out.println("sem : " + this.sem);
        System.out.println("------------------------");
    }
}
