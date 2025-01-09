import java.util.ArrayList;

public class SubArraySumIndexes {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int sum = 0;
        int n = arr.length;
        int flag = 0;
        while (j < n) {
            while (sum < target && j < n) {
                sum += arr[j];
                j++;
            }
            if (sum == target) {
                list.add(i + 1);
                list.add(j);
                flag = 1;
                return list;
            }
            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }

        }
        if (sum == target) {
            list.add(i + 1);
            list.add(j);
        } else list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 3, 7, 5}, 12));
        System.out.println(subarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15));
        System.out.println(subarraySum(new int[]{5, 3, 4}, 2));
    }
}
