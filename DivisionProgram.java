import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator (integer): ");
            int a = sc.nextInt();

            System.out.print("Enter denominator (integer): ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}