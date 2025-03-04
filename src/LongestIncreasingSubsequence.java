import java.util.Arrays;

public class LongestIncreasingSubsequence {
    static int lis(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;

        int dp[] = new int[n];
        int maxLIS = 1;

        // Initialize DP array to 1
        Arrays.fill(dp, 1);

        // Compute LIS for each index
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]); // Track max LIS length
        }

        return maxLIS;
    }
}
