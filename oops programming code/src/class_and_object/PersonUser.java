package class_and_object;

public class PersonUser {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        p1.setPerson("yogesh", 80, "OBC");
        p2.setPerson("gourav", 20, "OBC");
        p3.setPerson("kaushtubh", 90, "general");
        p4.setPerson("pawan", 70, "general");

        Person.setVillageName("hello world institute");
        p1.getPerson();
        p2.getPerson();
        p3.getPerson();
        p4.getPerson();

        Person.getTotalPersonCount();
        Person.getTotalOBCPersonCount();
        Person.getTotalSeniorPersonCount();
    }

}
