// 9. Write a program to check if a given square matrix is an identity matrix.

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        boolean isIdentity = true;

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                if (i == j && matrix[i][j] != 1)
                    isIdentity = false;
                if (i != j && matrix[i][j] != 0)
                    isIdentity = false;
            }

        System.out.println(isIdentity ? "Matrix is an identity matrix." : "Matrix is not an identity matrix.");
    }
}
