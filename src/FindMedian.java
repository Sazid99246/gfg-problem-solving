import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> medians = new ArrayList<>();
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder()); // Max heap
        PriorityQueue<Integer> right = new PriorityQueue<>(); // Min heap

        for (int num : arr) {
            // Step 1: Insert into appropriate heap
            if (left.isEmpty() || num <= left.peek()) {
                left.add(num);
            } else {
                right.add(num);
            }

            // Step 2: Balance the heaps
            if (left.size() > right.size() + 1) {
                right.add(left.poll());
            } else if (right.size() > left.size()) {
                left.add(right.poll());
            }

            // Step 3: Get the median
            if (left.size() > right.size()) {
                medians.add((double) left.peek());
            } else {
                medians.add((left.peek() + right.peek()) / 2.0);
            }
        }

        return medians;
    }
}
