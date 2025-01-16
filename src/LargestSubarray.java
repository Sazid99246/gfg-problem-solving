import java.util.HashMap;
import java.util.Map;

public class LargestSubarray {
    public int maxLen(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
                continue;
            }

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
                //System.out.println(i + " - " + map.get(sum) + "   " +( i - map.get(sum) + 1));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LargestSubarray largestSubarray = new LargestSubarray();
        System.out.println(largestSubarray.maxLen(new int[]{1, 0, 1, 1, 1, 0, 0}));
        System.out.println(largestSubarray.maxLen(new int[]{0, 0, 1, 1, 0}));
    }
}
