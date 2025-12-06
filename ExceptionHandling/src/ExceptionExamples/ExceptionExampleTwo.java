package ExceptionExamples;

public class ExceptionExampleTwo {

    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        String[] myarr = {"100","9"};
        System.out.println("this is division program : ");
        try {
            x = Integer.parseInt(myarr[0]);
            y = Integer.parseInt(myarr[1]);
            z = x / y;
        } catch (Exception e) {
            System.out.println("some thing wrong");
        }
        System.out.println("division : " + z);
        System.out.println("program run succefully");
    }
}
