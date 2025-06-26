import java.util.Scanner;

// Interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// SavingsAccount class
class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount must be positive.");
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        if (amount > balance)
            throw new ArithmeticException("Insufficient balance.");
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount();

        try {
            System.out.print("Enter deposit amount: ");
            double dep = Double.parseDouble(sc.nextLine());
            acc.deposit(dep);

            System.out.print("Enter withdrawal amount: ");
            double with = Double.parseDouble(sc.nextLine());
            acc.withdraw(with);

            System.out.println("Final Balance: ₹" + acc.getBalance());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
