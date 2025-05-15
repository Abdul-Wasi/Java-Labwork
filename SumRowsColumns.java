// 4. Write a program to calculate and print the sum of each row and each column of a given 2D array separately.

import java.util.Scanner;

public class SumRowsColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        // Row sums
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += matrix[i][j];
            System.out.println("Sum of row " + i + ": " + sum);
        }

        // Column sums
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += matrix[i][j];
            System.out.println("Sum of column " + j + ": " + sum);
        }
    }
}
