package AccountBank;
import java.util.Scanner;

public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with default values
    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }
    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to transfer money to another account
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transfer successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid transfer amount or insufficient funds.");
        }
    }
}