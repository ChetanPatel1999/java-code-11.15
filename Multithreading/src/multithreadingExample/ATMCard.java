package multithreadingExample;

public class ATMCard extends Thread {

    Account account;

    public void run() {
        account.withdraw(6000);
    }

    public static void main(String[] args) {
        ATMCard c1 = new ATMCard();
        ATMCard c2 = new ATMCard();
        ATMCard c3 = new ATMCard();

        Account ac1 = new Account(101, 10000);
        Account ac2 = new Account(102, 20000);
        Account ac3 = new Account(103, 30000);

        c1.account = ac1;
        c2.account = ac2;
        c3.account = ac1;

        c1.start();
        c2.start();
        c3.start();
    }
}
