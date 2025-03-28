import java.util.Scanner;

public class Task7 {
    // recursive function to print array in reverse order
    public static int reverse(int[] arr, int n) {
        if (n == 1) return arr[0]; // base case: if one element left, return it
        System.out.print(arr[n - 1] + " "); // print current element
        return reverse(arr, n - 1); // recursive call for the remaining elements
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int n = input.nextInt(); // read the size of the array
        int[] arr = new int[n]; // declare an array of size n

        // read array elements from user input
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(reverse(arr, n)); // call the reverse function and print the result
    }
}
