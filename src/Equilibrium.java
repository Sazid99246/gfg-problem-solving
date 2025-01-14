public class Equilibrium {
    public static int findEquilibrium(int[] arr) {
        int rightSum = 0;
        for (int j : arr) {
            rightSum += j;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i]; // Update rightSum for the current element
            if (leftSum == rightSum) return i; // Return the index where equilibrium is found
            leftSum += arr[i]; // Update leftSum for the current element
        }
        int i = -1;
        return i; // No equilibrium point found
    }

    public static void main(String[] args) {
        System.out.println(findEquilibrium(new int[]{1, 2, 0, 3}));
        System.out.println(findEquilibrium(new int[]{1, 1, 1, 1}));
    }
}
