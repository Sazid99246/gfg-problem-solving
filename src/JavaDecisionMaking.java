import java.util.Scanner;

/**
 * This class demonstrates basic decision-making in Java by comparing two integers.
 * It takes two integers as input and prints whether the first integer is
 * "lesser", "greater", or "equal" to the second integer.
 * @author <a href="https://github.com/sazid99246">Sheikh Md. Sazidul Islam</a>
 * @version 1.0
 * @since 27/12/2024
 */
public class JavaDecisionMaking {

    /**
     * Compares two integers and returns a string indicating the comparison result.
     *
     * @param n The first integer to compare.
     * @param m The second integer to compare.
     * @return A string indicating whether n is "lesser", "greater", or "equal" to m.
     */
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n > m) {
            return "greater";
        } else {
            return "equal";
        }
    }

    /**
     * The main method that takes input from the user for two integers and
     * prints the result of their comparison.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the two integers from the user
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Print the comparison result
        System.out.println(compareNM(n, m));
    }
}
