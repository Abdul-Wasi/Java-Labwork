// 6. Implement a program to check if a given square matrix is symmetric.

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        boolean symmetric = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matrix[i][j] != matrix[j][i])
                    symmetric = false;

        System.out.println(symmetric ? "Matrix is symmetric." : "Matrix is not symmetric.");
    }
}
