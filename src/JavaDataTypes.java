import java.util.Scanner;

/**
 * The {@code JavaDataTypes} class demonstrates basic operations with various
 * primitive data types in Java and prints the results.
 * @author <a href="https://github.com/sazid99246">Sheikh Md. Sazidul Islam</a>
 * @version 1.0
 * @since 28/12/2024
 */
public class JavaDataTypes {

    /**
     * Performs calculations using various data types and prints the results.
     *
     * @param a an integer value
     * @param b a floating-point value
     * @param c a double-precision floating-point value
     * @param l a long integer value
     * @param d a byte value
     */
    public static void dataTypes(int a, float b, double c, long l, byte d) {
        double p = c / b; // c divided by b
        double q = b / a; // b divided by a
        double r = c / a; // c divided by a
        double m = r + l; // r added to l
        int s = a / d;    // a divided by d

        // Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }

    /**
     * The main method reads input values for various data types and invokes
     * the {@code dataTypes} method to perform calculations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int a = sc.nextInt();

        System.out.println("Enter a float:");
        float b = sc.nextFloat();

        System.out.println("Enter a double:");
        double c = sc.nextDouble();

        System.out.println("Enter a long:");
        long l = sc.nextLong();

        System.out.println("Enter a byte:");
        byte d = sc.nextByte();

        dataTypes(a, b, c, l, d);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
