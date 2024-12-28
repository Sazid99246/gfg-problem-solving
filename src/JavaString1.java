public class JavaString1 {
    static String conRevstr(String S1, String S2) {
        String S3 = S1 + S2;
        StringBuilder sb = new StringBuilder(S3);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(conRevstr("Geeks", "forGeeks"));
    }
}
