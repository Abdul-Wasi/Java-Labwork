// Q4: Write a program to enter the numbers till the user wants and at the end
// it should display the count of positive, negative, and zeros entered.

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        int positive = 0, negative = 0, zeros = 0;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
