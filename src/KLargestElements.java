import java.util.ArrayList;
import java.util.Arrays;

public class KLargestElements {
    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            result.add(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        ArrayList<Integer> result = kLargest(arr, 3);
        for (int n : result) {
            System.out.print(n + ", ");
        }
    }
}
