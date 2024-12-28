import java.util.Scanner;

public class JavaDataTypes {
    public static void dataTypes(int a, float b, double c, long l, byte d) {
        double p = c / b; // c divided by b
        double q = b / a; // b divided by a
        double r = c / a; // c divided by a
        double m = r + l; // r added to l
        int s = a / d;    // a divided by d

        // Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }

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
