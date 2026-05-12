
import java.util.Scanner;

/**
 * This program demonstrates deletion of a specific element from an array.
 * It takes user input for array size and elements, then removes all occurrences
 * of a specified digit by shifting elements left and reducing the effective array size.
 */
public class DeletionNumber {

    public static void main(String[] args) {
        // Create scanner for user input
        Scanner sc = new Scanner(System.in);

        // Get the size of the array from user
        System.out.println("Enter the size of the 1D Array : ");
        int n = sc.nextInt();

        // Initialize array with user-specified size
        int a[] = new int[n];

        // Variable to store the digit to be deleted
        int d;

        // Get array elements from user
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Display the entered array
        System.out.print("Entered Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // New line for formatting

        // Get the digit to delete from user
        System.out.println("Enter the digit you want to delete:");
        d = sc.nextInt();

        // Traverse the array to find and delete all occurrences of digit 'd'
        for (int i = 0; i < n; i++) {
            if (a[i] == d) {
                // When digit to delete is found, shift all subsequent elements left
                // to overwrite the current position
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                // Reduce effective array size since we removed an element
                n--;
                // Decrement index to re-check the current position after shift
                // (since a new element has shifted into this position)
                i--;
            }
        }

        // Display the array after deletion
        System.out.print("Array after deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // New line for clean output

        // Close scanner to prevent resource leak
        sc.close();
    }
}
