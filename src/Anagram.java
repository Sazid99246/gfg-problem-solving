import java.util.Arrays;

public class Anagram {
    static int areAnagram(String S1, String S2) {
        char[] S1Arr = S1.toCharArray();
        char[] S2Arr = S2.toCharArray();

        Arrays.sort(S1Arr);
        Arrays.sort(S2Arr);

        String S1Sorted = new String(S1Arr);
        String S2Sorted = new String(S2Arr);

        if (S1Sorted.equals(S2Sorted)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(areAnagram("dsbkcsdn", "cdbkdub"));
    }
}
