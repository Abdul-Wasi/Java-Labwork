// 8. Develop a Java program to search for a specific element in a matrix.

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matrix[i][j] == key) {
                    System.out.println("Element found at " + i + ", " + j + ")");
                    found = true;
                }

        if (!found)
            System.out.println("Element not found.");
    }
}
