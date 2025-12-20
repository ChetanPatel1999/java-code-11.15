package multithreadingExample;

public class Account {

    private int acNo, belence;

    public Account(int acNo, int belence) {
        this.acNo = acNo;
        this.belence = belence;
    }

    synchronized void withdraw(int amount) {
        if (amount <= belence) {
            System.out.println("transection allowed ");
            System.out.println(acNo + " withdraw " + amount + " rs");
            belence = belence - amount;
            System.out.println("now reamaing belence : " + belence);
        } else {
            System.out.println("insufficint belence");
        }
    }
}
