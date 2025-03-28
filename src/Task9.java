import java.util.Scanner;

public class Task9 {
    // recursive function to calculate binomial coefficient
    public static int binCof(int n, int k) {
        if (k == 0 || k == n) return 1; // base case: C(n, 0) = C(n, n) = 1
        return binCof(n - 1, k - 1) + binCof(n - 1, k); // recursive step: C(n, k) = C(n-1, k-1) + C(n-1, k)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        int n = input.nextInt(); // read value of n from input
        int k = input.nextInt(); // read value of k from input
        System.out.println(binCof(n, k)); // calculate and print the binomial coefficient
    }
}