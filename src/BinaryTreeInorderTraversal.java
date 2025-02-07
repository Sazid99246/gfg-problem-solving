import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
    ArrayList<Integer> inOrder(Node root) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        return arr;
    }

    void helper(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        helper(root.left, arr);
        arr.add(root.data);
        helper(root.right, arr);
    }
}
