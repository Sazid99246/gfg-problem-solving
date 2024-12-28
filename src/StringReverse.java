/**
 * The {@code StringReverse} class provides a utility method to reverse a string
 * and includes a main method to demonstrate its functionality.
 * @author <a href="https://github.com/sazid99246">Sheikh Md. Sazidul Islam</a>
 * @version 1.0
 * @since 28/12/2024
 */
public class StringReverse {

    /**
     * Reverses the given string.
     *
     * @param s the input string to be reversed
     * @return a new string that is the reverse of the input string
     */
    static String revStr(String s) {
        StringBuilder sReverse = new StringBuilder(s);
        sReverse.reverse();
        return sReverse.toString();
    }

    /**
     * The main method demonstrates the usage of the {@code revStr} method
     * by reversing a sample string.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Reversed string: " + revStr("abcd"));
    }
}
