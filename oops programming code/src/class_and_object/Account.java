package class_and_object;

public class Account {

    private String accountHolderName;
    private String acNo;
    private int belence;
    private static int totalBankBelence;
    private static String bankName;
    private static int totalaccount;

    public static void setBankName(String s) {
        bankName = s;
    }

    public void createAccount(String name, String number, int b) {
        accountHolderName = name;
        acNo = number;
        belence = b;
        totalaccount++;
        totalBankBelence = totalBankBelence + belence;
    }

    public void showAccount() {
        System.out.println("account Info : ");
        System.out.println("Bank name : " + bankName);
        System.out.println("account name : " + accountHolderName);
        System.out.println("account number : " + acNo);
        System.out.println("account belence : " + belence);
        System.out.println("---------------------------------------");
    }

    public static void getTotalBankBelence() {
        System.out.println("total bank belence " + totalBankBelence);
        System.out.println("---------------------------------------");
    }

    public void creaditAmount(int amount) {
        belence = belence + amount;
        totalBankBelence = totalBankBelence + amount;
        System.out.println("creadit amount succefully");
    }

    public void debitAmount(int amount) {
        if (belence >=amount) {
            belence = belence - amount;
            totalBankBelence = totalBankBelence - amount;
            System.out.println("debit amount succefully");
        } else {
            System.out.println("insufficiant belence");
        }
    }

}
