package mypkg;

public interface Account {

    int ACCOUNT_LIMIT = 100;

    void openAccount();

    void closeAccount();

    void interest();

    default void m1() {
        System.out.println("hello i am default m1");
    }

    static void m2() {
        System.out.println("hello i am static m2");
    }

    public static void main(String[] args) {
        Account.m2();
    }
}
