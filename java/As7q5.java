package Biswajit.Java;
import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
   public void withdraw(double amount){
    try {
         if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    } catch (InsufficientFundsException e) {
        // TODO: handle exception

        throw e;
    }
       
}

public class As7q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}