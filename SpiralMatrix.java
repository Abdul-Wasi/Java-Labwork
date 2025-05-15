// 7. Write a program that prints all the elements of a matrix in spiral order.

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int top = 0, bottom = 2, left = 0, right = 2;

        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            for (int i = right; i >= left; i--)
                System.out.print(matrix[bottom][i] + " ");
            bottom--;

            for (int i = bottom; i >= top; i--)
                System.out.print(matrix[i][left] + " ");
            left++;
        }
    }
}
