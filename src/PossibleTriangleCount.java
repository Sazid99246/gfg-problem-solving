import java.util.Arrays;

public class PossibleTriangleCount {
    static int countTriangles(int[] arr) {
        Arrays.sort(arr);
        int count = 0, i = arr.length - 1;
        while (i > 1) {
            int st = 0;
            int end = i - 1;
            while (st < end) {
                if (arr[st] + arr[end] > arr[i]) {
                    count += (end - st);
                    end--;
                } else {
                    st++;
                }
            }
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTriangles(new int[]{4, 6, 3, 7}));
        System.out.println(countTriangles(new int[]{10, 21, 22, 100, 101, 200, 300}));
        System.out.println(countTriangles(new int[]{1, 2, 3}));
    }
}