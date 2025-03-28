import java.util.Scanner;

public class Task6 {
    // recursive function to calculate a raised to the power of n
    public static int power(int a, int n) {
        if (n == 0) return 1; // base case: any number raised to 0 is 1
        return a * power(a, n - 1); // recursive step: multiply a by power(a, n-1)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int n = input.nextInt(); // read exponent from input
        int a = input.nextInt(); // read base from input
        System.out.println(power(a, n)); // calculate and print the result
    }
}
