import java.util.Scanner;

/**
 * A program to calculate the roots of a quadratic equation using arithmetic operations.
 * The quadratic equation is in the form: Ax^2 + Bx + C = 0.
 * @author <a href="https://github.com/sazid99246">Sheikh Md. Sazidul Islam</a>
 * @version 1.0
 * @since 27/12/2024
 */
public class JavaArithmeticOperators {
    /**
     * Calculates the roots of a quadratic equation Ax^2 + Bx + C = 0.
     * @param A the coefficient of x^2 (must be non-zero)
     * @param B the coefficient of x
     * @param C the constant term
     * @return an array of roots. If the discriminant is negative, returns an array with a single element {-1}.
     *         If the discriminant is non-negative, returns an array with two roots in ascending order.
     */
    public static double[] FindRoots(int A, int B, int C) {
        double D = Math.pow(B, 2) - (4 * A * C);
        if (D < 0) {
            return new double[]{-1};
        }
        double x1 = (-B + Math.sqrt(D)) / (2 * A);
        double x2 = (-B - Math.sqrt(D)) / (2 * A);
        if (x1 < x2) {
            return new double[]{x1, x2};
        } else {
            return new double[]{x2, x1};
        }
    }

    /**
     * Main method to read input coefficients and print the roots of the quadratic equation.
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        for (double v : FindRoots(A, B, C)) {
            System.out.println(v);
        }
    }
}
