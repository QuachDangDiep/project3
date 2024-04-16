package AccountBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new AccountBank object
        AccountBank account = new AccountBank();

        // Input account details
        System.out.println("Enter account number:");
        account.setAccountNumber(scanner.nextLine());

        System.out.println("Enter account holder name:");
        account.setAccountHolderName(scanner.nextLine());

        System.out.println("Enter initial balance:");
        account.setBalance(scanner.nextDouble());

        // Display account information
        System.out.println("\nAccount Information:");
        account.displayAccountInfo();

        // Perform transactions
        System.out.println("\nEnter the amount to deposit:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("\nEnter the amount to withdraw:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nEnter the destination account number for transfer:");
        String destinationAccountNumber = scanner.next();

        System.out.println("Enter the amount to transfer:");
        double transferAmount = scanner.nextDouble();

        AccountBank destinationAccount = new AccountBank();
        destinationAccount.setAccountNumber(destinationAccountNumber);

        account.transfer(destinationAccount, transferAmount);

        // Display final account information
        System.out.println("\nFinal Account Information:");
        account.displayAccountInfo();
        System.out.println("Destination Account Information:");
        destinationAccount.displayAccountInfo();

        scanner.close();
    }
}


