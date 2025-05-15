//Write a Java program to read two matrices of the same size (e.g., 3x3), perform matrix 
addition, and display the resulting matrix.

import java.util.Scanner;

public class MatrixAddition{
    public static void main(String[] args){
        int[][] matrix1 = new int [3][3];
        int[][] matrix2 = new int [3][3];
        int[][] sum = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first 3x3 matrix: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 3x3 matrix: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}