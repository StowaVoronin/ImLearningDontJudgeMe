package src.main.java.classroom.cashFlow;

public class BankAccaunt {
    double amount;
    public BankAccaunt() {
        this.amount = 0;
    }

         public BankAccaunt(double balance){
            this.amount = balance;

    }
    void withdraw(double amount){
        if (this.amount>= amount) {
            this.amount = this.amount - amount;
        } else System.out.println("You don't have enough funds");

    }
    void deposit(double amount){
        this.amount = this.amount + amount;

    }
    double checkBalance(){
        return this.amount;

    }
}
