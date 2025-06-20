import java.util.Scanner;

public class LinearSearch {
    // LINEAR SEARCH
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

        int count = 0;

        // Perform linear search and count occurrences of the search element
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                count++;
            }
        }

        // Display the count of the search element in the array
        System.out.println("The element " + x + " occurred " + count + " times.");
    }
}