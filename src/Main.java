import java.util.Scanner;

public class Main {
    public static int min(int[] arr, int n){
        if (n == 0) return arr[n];
        return Math.min(arr[n-1], min(arr, n - 1));
    }
    public static int sum(int[] arr, int n){
        if (n == 0) return 0;
        return arr[n-1] + sum(arr, n-1);
    }
    public static double avr(int[] arr, int n){
        return (double) sum(arr, n) / n;
    }
    public static boolean prime(int n){
        int s = 0;
        for (int i = 1; i < n+1; i++) {
            if (n / i == 0) s++;
        }
        return s <= 2;
    }
    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    public static int fib(int a){
        if (a == 0 || a == 1) return a;
        return fib(a - 2) + fib(a - 1);
    }
    public static int power(int a, int n){
        if (n == 0) return 1;
        return a * power(a,n-1);
    }
    public static int reverse(int[] arr, int n){
        if (n == 0) return arr[0];
        System.out.print(arr[n - 1] + " ");
        return reverse(arr, n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(min(arr, n));
        System.out.println(avr(arr, n));
        System.out.println(prime(n));
        System.out.println(factorial(n));
        System.out.println(fib(a));
        System.out.println(power(a,n));
        System.out.println(reverse(arr,n));
        }
}