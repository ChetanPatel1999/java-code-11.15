package whileloop;

public class PrintEachDigitSeprateLine {

    public static void main(String[] args) {
//        int num = 4659;
//        int rem;
//        while (num > 0) {
//            rem = num % 10;
//            System.out.println(rem);
//            num = num / 10;
//        }

//sum of individul digit
        int num = 743;
        int sum=0, rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("sum of individul digits = "+sum);
    }
}
