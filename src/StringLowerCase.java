import java.util.Scanner;

/**
 * The {@code StringLowerCase} class provides a utility method to convert a string
 * to lowercase and a main method for user interaction.
 * @author <a href="https://github.com/sazid99246">Sheikh Md. Sazidul Islam</a>
 * @version 1.0
 * @since 28/12/2024
 */
public class StringLowerCase {

    /**
     * Converts the given string to lowercase.
     *
     * @param s the input string to be converted
     * @return a new string in which all characters of the input string are
     *         converted to lowercase
     */
    public static String toLower(String s) {
        return s.toLowerCase();
    }

    /**
     * The main method reads a string from the user and prints its lowercase equivalent.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Lowercase string: " + toLower(s));
        sc.close();
    }
}
