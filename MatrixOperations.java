//basic operations on matrices

import java.util.Scanner;

public class MatrixOperations {

    // Function to input a matrix
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Addition of two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Subtraction of two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Multiplication of two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Matrix A
        System.out.println("Enter rows and columns for Matrix A: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrixA = new int[rows][cols];
        System.out.println("Enter elements for Matrix A:");
        inputMatrix(matrixA, sc);

        // Taking input for Matrix B
        int[][] matrixB = new int[rows][cols];
        System.out.println("Enter elements for Matrix B:");
        inputMatrix(matrixB, sc);

        // Addition
        System.out.println("\nAddition of A and B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("\nSubtraction of A and B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication (only if valid)
        System.out.println("\nMatrix Multiplication (A x B):");
        int[][] matrixC = multiplyMatrices(matrixA, matrixB);
        displayMatrix(matrixC);

        // Transpose
        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("\nTranspose of Matrix B:");
        displayMatrix(transposeMatrix(matrixB));

        sc.close();
    }
}
