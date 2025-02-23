import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreatElement {

    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here

        int size = arr.length;
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        //for the last element always it is -1
        result.add(-1);
        // insert last element into stack
        s.push(arr[size - 1]);


        // start operations from the second element at the end of the array
        for (int i = size - 2; i >= 0; i--) {
            // check for the element which is greater then current element

            while (!s.isEmpty() && s.peek() <= arr[i]) s.pop();
            //if not element found add -1 to that element

            if (s.isEmpty()) result.add(-1);

                //if found that greatest element add the top element of the stack into result

            else result.add(s.peek());

            // push current element into stack
            s.push(arr[i]);

        }

        // reverse the result because we are traversing backward in the above for loop
        Collections.reverse(result);

        return result;
    }
}
