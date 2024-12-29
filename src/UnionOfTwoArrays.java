import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int findUnion(int[] a, int[] b) {
        HashSet<Integer> union = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            union.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            union.add(b[i]);
        }

        return union.size();
    }

    public static void main(String[] args) {
        int[] a = {85, 25, 1, 32, 54, 6};
        int[] b = {85, 2};

        System.out.println(findUnion(a, b));
    }
}
