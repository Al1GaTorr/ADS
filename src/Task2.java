import java.util.Scanner;

public class Task2 {
    // Recursive function to calculate the sum of array elements
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0; // Base case: if array size is 0, return 0
        return arr[n - 1] + sum(arr, n - 1); // Add last element to sum of remaining elements
    }

    // Function to calculate the average of array elements
    public static double avr(int[] arr, int n) {
        return (double) sum(arr, n) / n; // Divide sum by number of elements
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input
        int n = input.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Declare an array of size n

        // Read array elements from user input
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(avr(arr, n)); // Call the avr function and print the result
    }
}
