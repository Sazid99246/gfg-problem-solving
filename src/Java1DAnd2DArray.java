import java.util.ArrayList;
import java.util.Collections;

public class Java1DAnd2DArray {
    public static ArrayList<Integer> array(int[][] a, int[] b, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum += a[i][i];
        }

        int max = b[0];
        for (int i = 0; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>() {
        };
        result.add(sum);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] b = new int[]{3, 6, 9};
        int n = 3;

        System.out.println(array(a, b, n));
    }
}
