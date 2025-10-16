package whileloop;

public class Break {

    public static void main(String[] args) {
        int n = 444, c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;//3
            }
            if (c > 2) {
                break;
            }
        }
        if (c == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
