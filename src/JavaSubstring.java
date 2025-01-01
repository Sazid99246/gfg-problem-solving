public class JavaSubstring {
    static String javaSub(String S, int L, int R) {
        return S.substring(L, R + 1);
    }
    public static void main(String[] args) {
        System.out.println(javaSub("cdbkdub", 0, 5));
        System.out.println(javaSub("sdiblcsdbud", 3, 7));
    }
}
