import java.util.Map;
import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> list = new HashMap<>();
        list.put(0, -1);
        int max_length = 0;
        int prefix_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];

            if (list.containsKey(prefix_sum - k))
                max_length = Math.max(max_length, i - list.get(prefix_sum - k));

            list.putIfAbsent(prefix_sum, i);
        }

        return max_length;
    }

    public static void main(String[] args) {
        LongestSubArrayWithSumK longestSubArrayWithSumK = new LongestSubArrayWithSumK();
        System.out.println(longestSubArrayWithSumK.longestSubarray(new int[]{10, 5, 2, 7, 1, -10}, 15));
        System.out.println(longestSubArrayWithSumK.longestSubarray(new int[]{-5, 8, -14, 2, 4, 12}, -5));
    }
}
