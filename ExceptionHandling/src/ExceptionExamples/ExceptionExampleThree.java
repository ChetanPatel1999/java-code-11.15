package ExceptionExamples;

public class ExceptionExampleThree {

    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        String[] myarr = {"100", "0"};
        System.out.println("this is division program : ");
        try {
            x = Integer.parseInt(myarr[0]);
            y = Integer.parseInt(myarr[1]);
            z = x / y;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong index error");
        } catch (NumberFormatException e) {
            System.out.println("your input is wrong");
        } catch (ArithmeticException exe) {
            z = x / 2;
        } catch (Exception e) {
            System.out.println("something wrong");
        }
        System.out.println("division : " + z);
        System.out.println("program run succefully");
    }
}
