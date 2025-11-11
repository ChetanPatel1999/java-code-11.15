package class_and_object;

public class AccountUser {

    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();
        Account ac3 = new Account();
        ac1.createAccount("yogesh", "1234", 3000);
        ac2.createAccount("kaushthub", "6789", 130);
        ac3.createAccount("nandani", "8234", 2000);
        Account.setBankName("HDFC");
        ac1.showAccount();
        ac2.showAccount();
        ac3.showAccount();

        ac1.creaditAmount(500000);
        ac1.showAccount();
        
        ac2.creaditAmount(700000);
        ac2.showAccount();
        
        ac3.debitAmount(2000);
        ac3.showAccount();
        
        Account.getTotalBankBelence();

    }
}
