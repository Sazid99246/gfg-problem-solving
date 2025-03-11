public class NthStair {
    int countWays(int n) {
        int prev1 = 1;
        if (n == 1) return 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
        return prev2;
    }
}
