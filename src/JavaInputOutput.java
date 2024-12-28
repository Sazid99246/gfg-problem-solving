import java.util.Scanner;

public class JavaInputOutput {
    public static void printIntString(String S, int N) {
        System.out.println("The input string :" + S);
        System.out.println("The input integer :" + N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = sc.nextInt();

        sc.close();  // Close the scanner resource
        printIntString(S, N);
    }
}
