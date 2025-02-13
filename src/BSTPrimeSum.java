import java.util.HashSet;

public class BSTPrimeSum {
    boolean findTarget(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, target, set);
    }

    boolean helper(Node root, int t, HashSet<Integer> set) {
        if (root == null) return false;
        if (set.contains(t - root.data)) return true;
        set.add(root.data);
        return helper(root.left, t, set) || helper(root.right, t, set);
    }
}
