import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    float balance;

    // Method to get account details
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter account holder name: ");
        holderName = sc.nextLine();
        System.out.print("Enter initial balance: ");
        balance = sc.nextFloat();
    }

    // Method to deposit money
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        float amount = sc.nextFloat();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    // Method to display current balance and account details
    public void showDetails() {
        System.out.println("------Bank Account Information------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}

class BankAccountSystem {
    public static void main(String args[]) {
        BankAccount acc = new BankAccount();
        acc.getDetails();
        acc.deposit();
        acc.withdraw();
        acc.showDetails();
    }
}
