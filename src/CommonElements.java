import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonElements {
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Two-pointer approach
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);  // Common element found
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {80, 37, 59, 20, 8, 20, 8, 91, 28, 81, 89, 88, 21, 47, 99, 99, 92, 84, 88, 53, 44, 61, 28, 84, 31, 9, 63, 98, 36, 61, 100, 16, 44, 70, 44, 74, 46, 91, 5, 96, 23, 6, 31, 79, 34, 92, 30, 81, 53, 21, 2, 8};
        int[] b = {10, 4, 7, 8, 8, 7, 1, 6, 7, 1, 1, 1, 7, 7, 7, 6, 1, 9};

        ArrayList<Integer> res = commonElements(a, b);
        for (Integer n : res) {
            System.out.print(n + " ");
        }
    }
}
