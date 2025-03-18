public class PartitionEqualSubsetSum {
    static boolean equalPartition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return isSubsetSum(arr, sum / 2);
    }

    static Boolean isSubsetSum(int[] arr, int target) {

        boolean dp[][] = new boolean[arr.length + 1][target + 1];
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]]) || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return dp[arr.length][target];
    }
}
