public class MinJumps {
    static int minJumps(int[] arr) {
        int n = arr.length;

        // If there are less than two elements, no jumps are needed
        if (n <= 1) {
            return 0;
        }

        // If the first element is 0, it's not possible to move forward
        if (arr[0] == 0) {
            return -1;
        }

        // Initialize variables
        int jumps = 1; // Start from the first jump
        int maxReach = arr[0]; // The farthest we can reach
        int steps = arr[0]; // The number of steps we can take

        // Traverse the array
        for (int i = 1; i < n; i++) {
            // If we reached the end of the array
            if (i == n - 1) {
                return jumps;
            }

            // Update the maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // Decrease steps
            steps--;

            // If steps become 0, we need to increase the jump count
            if (steps == 0) {
                jumps++;

                // If we can't move forward, return -1
                if (i >= maxReach) {
                    return -1;
                }

                // Reset steps to the number of steps we can take from the current position
                steps = maxReach - i;
            }
        }

        return -1; // This line will never be reached if the solution is possible
    }
}
