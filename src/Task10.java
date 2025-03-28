import java.util.Scanner;

public class Task10 {
    // function to compute the greatest common divisor using Euclidean algorithm
    public static int GCD(int a, int b) {
        while (b != 0) { // repeat until remainder is 0
            int remainder = a % b; // compute remainder
            a = b; // update a with b
            b = remainder; // update b with remainder
        }
        return a; // return gcd
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int a = input.nextInt(); // read first number from input
        int b = input.nextInt(); // read second number from input
        System.out.println(GCD(a, b)); // calculate and print gcd
    }
}   