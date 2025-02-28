import java.util.Stack;

public class PostFixExpressionEvaluation {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("/") || arr[i].equals("*")) {
                int temp1 = s.pop();
                int temp2 = s.pop();
                int out = 0;
                if (arr[i].equals("+"))
                    out = temp1 + temp2;
                else if (arr[i].equals("-")) {
                    out = temp2 - temp1;
                } else if (arr[i].equals("/")) {
                    out = temp2 / temp1;
                } else if (arr[i].equals("*")) {
                    out = temp1 * temp2;
                }
                s.add(out);
            } else {
                int a = Integer.valueOf(arr[i]);
                s.add(a);
            }
        }
        return s.peek();
    }
}