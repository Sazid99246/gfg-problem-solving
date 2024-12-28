import java.util.Scanner;

public class StringLowerCase {
    public static String toLower(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Lowercase string: " + toLower(s));
        sc.close();
    }
}
