package class_and_object;

public class StudentUser {
    
    public static void main(String[] args) {
        Student.setCollageName("holker");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.setStudent("ram", 101, 20);
        s2.setStudent("hariom", 102, 70);
        s3.setStudent("yogesh", 103, 79);
        s4.setStudent("gourav", 104, 85);
        s1.getResultCard();
        s2.getResultCard();
        s3.getResultCard();
        s4.getResultCard();
        
        Student.getTotalResult();
        Student.getTotalStudent(); 
    }
}
