import java.util.Scanner;

public class Task4 {
    // recursive function to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0) return 1; // base case: factorial of 0 is 1
        return n * factorial(n - 1); // recursive step: n * factorial of (n-1)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int n = input.nextInt(); // read the number from input
        System.out.println(factorial(n)); // calculate and print the factorial of n
    }
}
