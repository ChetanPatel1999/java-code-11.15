package class_and_object;

public class Person {

    private String name;
    private int age;
    private String cast;
    private static int totalPersonCount;
    private static int totalSeniorPersonCount;
    private static int totalOBCPersonCount;
    private static String villageName;

    public void setPerson(String n, int a, String c) {
        name = n;
        age = a;
        cast = c;
        totalPersonCount++;
        if (age > 60) {
            totalSeniorPersonCount++;
        }
        if (cast.equals("OBC")) {
            totalOBCPersonCount++;
        }
    }

    public static void setVillageName(String s) {
        villageName = s;
    }

    public void getPerson() {
        System.out.println("person info : ");
        System.out.println("Village name  : " + villageName);
        System.out.println("person name  : " + name);
        System.out.println("person age  : " + age);
        System.out.println("person cast  : " + cast);
        if (age <= 13) {
            System.out.println("person is child");
        } else if (age <= 19) {
            System.out.println("person is teenager");
        } else if (age <= 60) {
            System.out.println("person is adult");
        } else {
            System.out.println("person is senior");
        }
        System.out.println("-----------------------------------------");
    }

    public static void getTotalPersonCount() {
        System.out.println("total person " + totalPersonCount);
        System.out.println("-----------------------------------------");
    }

    public static void getTotalOBCPersonCount() {
        System.out.println("total OBC cast person " + totalOBCPersonCount);
        System.out.println("-----------------------------------------");
    }

    public static void getTotalSeniorPersonCount() {
        System.out.println("total senior person " + totalSeniorPersonCount);
        System.out.println("-----------------------------------------");
    }
}
