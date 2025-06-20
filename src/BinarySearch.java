// Java program to perform Binary Search on a sorted array
import java.util.Scanner;

public class BinarySearch {
    // Binary Search implementation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Read array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // Prompt user to enter the element to search
        System.out.println("Enter the element to search:");
        int x = sc.nextInt();

        // Initialize pointers for binary search
        int i = 0, j = a.length - 1;

        // Perform binary search
        while (i <= j) {
            int mid = (i + j) / 2;  // Calculate middle index

            if (a[mid] == x) {
                System.out.println("Element found at index: " + mid);
                sc.close();
                return;

            } else if (x > a[mid]) {
                i = mid + 1;  // Move to right half

            } else {
                j = mid - 1;
            }

        }
        System.out.println("Element not found in the array");
        sc.close();

    }
}
