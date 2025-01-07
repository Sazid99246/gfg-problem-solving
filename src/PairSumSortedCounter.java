import java.util.HashMap;

public class PairSumSortedCounter {
    int countPairs(int arr[], int target) {
        // Complete the function
        int c = 0;
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            int com = target - a;
            if (map.containsKey(com)) {
                c += map.get(com);
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return c;
    }

    public static void main(String[] args) {
        PairSumSortedCounter pairSumSortedCounter = new PairSumSortedCounter();
        System.out.println(pairSumSortedCounter.countPairs(new int[]{-1, 1, 5, 5, 7}, 6));
        System.out.println(pairSumSortedCounter.countPairs(new int[]{1, 1, 1, 1}, 2));
        System.out.println(pairSumSortedCounter.countPairs(new int[]{-1, 10, 10, 12, 15}, 4));
    }
}
