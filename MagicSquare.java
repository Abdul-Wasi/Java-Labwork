// 10. Create a program that checks whether a given square matrix is a magic square.

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sum = 0;
        boolean isMagic = true;

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        int target = 0;
        for (int j = 0; j < 3; j++)
            target += matrix[0][j];

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != target || colSum != target)
                isMagic = false;
        }

        // Check diagonals
        int diag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int diag2 = matrix[0][2] + matrix[1][1] + matrix[2][0];

        if (diag1 != target || diag2 != target)
            isMagic = false;

        System.out.println(isMagic ? "Matrix is a magic square." : "Matrix is not a magic square.");
    }
}
