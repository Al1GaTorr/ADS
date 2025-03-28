import java.util.Scanner;

public class Task3 {
    // function to check if a number is prime
    public static boolean prime(int n) {
        int s = 0; // counter for divisors

        // loop to count divisors of n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) s++; // check divisibility
        }

        return s == 2; // a prime number has exactly 2 divisors (1 and itself)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int n = input.nextInt(); // read the number from input
        System.out.println(prime(n)); // check if n is prime and print the result
    }
}
