import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList1 {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) {
        if (Q == 1) {
            A.add(Query.get(0), Query.get(1));
            return A;
        } else {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(A.lastIndexOf(Query.get(0)));
            return result;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int Q = 2;
        ArrayList<Integer> Query = new ArrayList<>(List.of(4));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 9, 2, 4));

        JavaArrayList1 javaArrayList1 = new JavaArrayList1();
        System.out.println(javaArrayList1.solve(N, A, Q, Query));
    }
}
