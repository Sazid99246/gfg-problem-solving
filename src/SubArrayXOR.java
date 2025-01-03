import java.util.HashMap;

public class SubArrayXOR {
    public long subarrayXor(int arr[], int k) {
        HashMap<Long, Integer> mp = new HashMap<>();
        long count = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
            if (sum == k)
                count++;
            long toFind = sum ^ k;
            if (mp.containsKey(toFind))
                count += mp.get(toFind);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubArrayXOR subArrayXOR = new SubArrayXOR();
        System.out.println(subArrayXOR.subarrayXor(new int[]{4, 2, 2, 6, 4}, 6));
    }
}
