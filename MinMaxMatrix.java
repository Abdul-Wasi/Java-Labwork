// 5. Create a Java program that reads a matrix and finds the largest and smallest elements along with their positions.

import java.util.Scanner;

public class MinMaxMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        int min = matrix[0][0], max = matrix[0][0];
        int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }

        System.out.println("Smallest element: " + min + " at position (" + minRow + ", " + minCol + ")");
        System.out.println("Largest element: " + max + " at position (" + maxRow + ", " + maxCol + ")");
    }
}
