import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read position to delete (1-based index)
        System.out.print("Enter the position to delete (1-based index): ");
        int pos = scanner.nextInt();

        // Validate position
        if (pos < 1 || pos > n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements left to remove the element
            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Print the updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}

