import java.util.Scanner;

public class Task1 {
    // recursive function to find the minimum element in the array
    public static int min(int[] arr, int n) {
        if (n == 0) return arr[n]; // base case: if n is 0, return the first element
        return Math.min(arr[n - 1], min(arr, n - 1)); // compare current element with the minimum of the rest
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int n = input.nextInt(); // read the size of the array
        int[] arr = new int[n]; // declare an array of size n

        // read array elements from user input
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(min(arr, n)); // call the min function and print the result
    }
}
