import java.util.Arrays;

public class PairSumCounter {
    int countPairs(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left); // All pairs between left and right are valid
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PairSumCounter pairSumCounter = new PairSumCounter();
        System.out.println(pairSumCounter.countPairs(new int[]{7, 2, 5, 3}, 8));
        System.out.println(pairSumCounter.countPairs(new int[]{5, 2, 3, 2, 4, 1}, 5));
        System.out.println(pairSumCounter.countPairs(new int[]{2, 1, 8, 3, 4, 7, 6, 5}, 7));
    }
}
