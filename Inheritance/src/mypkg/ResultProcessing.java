
package mypkg;

public class ResultProcessing {
    public static void main(String[] args) {
        EngStud s1=new EngStud();
        s1.setStudent("raja", 101);
        s1.setEngStud("CS", 5);
        s1.getStudent();
        s1.getEngStud();
        
        MediStud s2=new MediStud();
        s2.setStudent("mahi", 102);
        s2.setMediStud(2,"artho");
        s2.getStudent();
        s2.getMediStud();
    }
}
