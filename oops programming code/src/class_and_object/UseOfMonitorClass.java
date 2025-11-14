package class_and_object;

public class UseOfMonitorClass {

    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        Monitor m2 = new Monitor();
        m1.setMonitor("HP", 2000, "black", 4.5f);
        m2.setMonitor("Dell", 1500, "white", 2.5f);
        m1.getMonitor();
        m2.getMonitor();

        Student s1 = new Student("yogesh mandloi", 101, 70);
//        s1.setStudent("yogesh mandloi", 101, 70);
        s1.getResultCard();
        Student s2 = new Student("Koushtubh phadnis ", 102, 25);
//        s1.setStudent("Koushtubh phadnis", 102, 25);
        s1.getResultCard();
    }

}
