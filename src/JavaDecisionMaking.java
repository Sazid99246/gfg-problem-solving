import java.util.Scanner;

public class JavaDecisionMaking {
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n > m) {
            return "greater";
        } else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the two integers from the user
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Print the comparison result
        System.out.println(compareNM(n, m));
    }
}
