import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairTarget {
    public List<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList();
        int st=0, end=arr.length-1, currClose=Integer.MAX_VALUE;
        while(st<end){
            int sum=arr[st]+arr[end];
            if(Math.abs(target-sum)<currClose){
                currClose = Math.abs(target-sum);
                ans.clear();
                ans.add(arr[st]);
                ans.add(arr[end]);
            }
            if(sum<target){
                st++;
            }
            else if(sum>target){
                end--;
            }
            else {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 30, 20, 5};
        int target = 25;
        SumPairTarget sumPairTarget = new SumPairTarget();
        System.out.println(sumPairTarget.sumClosest(arr, target));  // Output: [5, 20]

        int[] arr2 = new int[]{5, 2, 7, 1, 4};
        int target2 = 10;
        System.out.println(sumPairTarget.sumClosest(arr2, target2));  // Output: [2, 7]

        int[] arr3 = new int[]{10};
        int target3 = 10;
        System.out.println(sumPairTarget.sumClosest(arr3, target3));  // Output: []
    }
}
