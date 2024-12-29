import java.util.ArrayList;
import java.util.HashSet;

public class ArrayIntersection {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        ArrayList<Integer> commonElements = new ArrayList<>();
        if (a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        for (int num: a) {
            set.add(num);
        }

        for (int num : b) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        return new ArrayList<>(resultSet);
    }

    // for self test
    public static void main(String[] args) {
        ArrayIntersection arrayIntersection = new ArrayIntersection();
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};
        System.out.println(arrayIntersection.intersectionWithDuplicates(a, b));
    }
}
