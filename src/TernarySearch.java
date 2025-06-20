import java.util.Scanner;

public class TernarySearch {

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

            // Initialize pointers for ternary search
            int i = 0, j = a.length - 1;

            System.out.println("Starting ternary search...");

            while (i <= j) {
                // Find mid1 and mid2
                int mid1 = i + (j - i) / 3;
                int mid2 = j - (j - i) / 3;

                // Display mid positions and values
                System.out.println("mid1: " + mid1 + ", a[mid1]: " + a[mid1]);
                System.out.println("mid2: " + mid2 + ", a[mid2]: " + a[mid2]);

                // Check if the element is at mid1 or mid2
                if (a[mid1] == x) {
                    System.out.println("Element found at index " + mid1);
                    return;
                } else if (a[mid2] == x) {
                    System.out.println("Element found at index " + mid2);
                    return;
                }

                // Decide which part to search next
                if (x < a[mid1]) {
                    System.out.println("Searching in left part.");
                    j = mid1 - 1;
                } else if (x > a[mid2]) {
                    System.out.println("Searching in right part.");
                    i = mid2 + 1;
                } else {
                    System.out.println("Searching in middle part.");
                    i = mid1 + 1;
                    j = mid2 - 1;
                }
            }

            // If not found
            System.out.println("Element not found in the array.");
    }
}
