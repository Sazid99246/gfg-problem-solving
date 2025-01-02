import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int countSubarrays(int[] arr, int k) {
        int prefixSum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            count += map.getOrDefault(prefixSum - k, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubArraySum subArraySum = new SubArraySum();
        System.out.println(subArraySum.countSubarrays(new int[]{10, 2, -2, -20, 10}, -10));
    }
}
