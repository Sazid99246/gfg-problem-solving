import java.util.Collections;

public class AlternateElements {
    static String delAlternate(String S) {
        String result = "";
        for (int i = 0; i < S.length(); i+=2) {
            result += S.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(delAlternate("Geeks"));
        System.out.println(delAlternate("GeeksforGeeks"));
    }
}
