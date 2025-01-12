public class TrappingWater {
    public int maxWater(int[] arr) {
        if (arr.length < 3) return 0;

        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate the total water trapped
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {
        TrappingWater trappingWater = new TrappingWater();
        System.out.println(trappingWater.maxWater(new int[]{3, 0, 1, 0, 4, 0, 2}));
    }
}
