import java.util.Scanner;

/**
 * This class demonstrates basic input and output in Java.
 * It takes a string and an integer as input and prints them in a formatted manner.
 * @author <a href="https://github.com/sazid99246">Sheikh Md. Sazidul Islam</a>
 * @version 1.0
 * @since 27/12/2024
 */
public class JavaInputOutput {

    /**
     * Prints the input string and integer in a specific format.
     *
     * @param S The input string.
     * @param N The input integer.
     */
    public static void printIntString(String S, int N) {
        System.out.println("The input string :" + S);
        System.out.println("The input integer :" + N);
    }

    /**
     * The main method that takes input from the user for a string and an integer,
     * and then prints them using the printIntString method.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string input
        String S = sc.nextLine();

        // Read the integer input
        int N = sc.nextInt();

        sc.close();  // Close the scanner resource

        // Print the string and integer
        printIntString(S, N);
    }
}
