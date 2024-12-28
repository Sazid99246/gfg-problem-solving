public class StringReverse {
    static String revStr(String s) {
        StringBuilder sReverse = new StringBuilder(s);
        sReverse.reverse();
        return sReverse.toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed string: " + revStr("abcd"));
    }
}
