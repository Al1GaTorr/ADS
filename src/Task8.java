import java.util.Scanner;

public class Task8 {
    // function to check if a string consists only of digits
    public static boolean isDigit(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false; // return false if a non-digit character is found
        }
        return true; // return true if all characters are digits
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        String s = input.nextLine(); // read string from input
        System.out.println(isDigit(s) ? "yes" : "no"); // check if the string is numeric and print the result
    }
}