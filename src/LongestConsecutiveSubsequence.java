import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] arr) {
        Set<Integer> hset = new HashSet<>();
        for (int i : arr) {
            hset.add(i);
        }
        int answer = 0;
        for (int i : arr) {
            int current = 0;
            int tmp1 = i;
            int tmp2 = i - 1;

            if (hset.contains(i)) {
                while (hset.contains(tmp1)) {
                    current++;
                    hset.remove(tmp1);
                    tmp1++;
                }
                while (hset.contains(tmp2)) {
                    current++;
                    hset.remove(tmp2);
                    tmp2--;
                }
            }
            answer = Math.max(answer, current);
        }
        return answer;
    }

    public static void main(String[] args) {
        LongestConsecutiveSubsequence longestConsecutiveSubsequence = new LongestConsecutiveSubsequence();
        System.out.println(longestConsecutiveSubsequence.longestConsecutive(new int[]{2, 6, 1, 9, 4, 5, 3}));
    }
}
