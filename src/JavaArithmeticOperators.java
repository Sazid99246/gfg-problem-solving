import java.util.Scanner;

public class JavaArithmeticOperators {
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
