import java.util.Scanner;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter the size of first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter the size of second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = arr2[i];
        }

        // Bubble Sort (manual sorting)
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    // Swap
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted merged array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
