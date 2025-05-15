// 3. Develop a Java program to input a matrix and compute its transpose, then display both original and transposed matrices.

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int[][] transpose = new int[c][r];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for (int[] row : transpose) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
