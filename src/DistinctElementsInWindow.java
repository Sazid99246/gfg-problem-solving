import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementsInWindow {

    public ArrayList<Integer> countDistinct(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            if (freqMap.get(arr[i]) == 1) {
                distinctCount++;
            }

            // Remove the element that is sliding out of the window
            if (i >= k) {
                int elementToRemove = arr[i - k];
                if (freqMap.get(elementToRemove) == 1) {
                    distinctCount--;
                }
                freqMap.put(elementToRemove, freqMap.get(elementToRemove) - 1);
            }

            // Add the distinct count for the current window to the result list
            if (i >= k - 1) {
                result.add(distinctCount);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        DistinctElementsInWindow distinctElementsInWindow = new DistinctElementsInWindow();
        System.out.println(distinctElementsInWindow.countDistinct(new int[]{1, 2, 1, 3, 4, 2, 3}, 4));
        System.out.println(distinctElementsInWindow.countDistinct(new int[]{4, 1, 1}, 2));
        System.out.println(distinctElementsInWindow.countDistinct(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
