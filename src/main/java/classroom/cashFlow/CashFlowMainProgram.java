package src.main.java.classroom.cashFlow;

public class CashFlowMainProgram {
    public static void main(String[] args) {
        BankAccaunt myAccount = new BankAccaunt();

        double currentBalance = myAccount.checkBalance();

        System.out.println(currentBalance);

        myAccount.deposit(50.45);
        myAccount.withdraw(10.50);
        myAccount.deposit(19.45);
        myAccount.withdraw(138.50);
        System.out.println(myAccount.checkBalance());

    }
}
