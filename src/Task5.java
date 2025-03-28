import java.util.Scanner;

public class Task5 {
    // recursive function to calculate the fibonacci number
    public static int fib(int a) {
        if (a == 0 || a == 1) return a; // base case: fib(0) = 0, fib(1) = 1
        return fib(a - 2) + fib(a - 1); // recursive step: sum of the two previous numbers
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int a = input.nextInt(); // read the number from input
        System.out.println(fib(a)); // calculate and print the fibonacci number
    }
}

