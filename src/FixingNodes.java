public class FixingNodes {
    Node a = null;
    Node b = null;
    Node prev = null;

    public void helper(Node root) {
        if (root == null) return;
        helper(root.left);
        if (prev != null && prev.data > root.data) {
            if (a == null) {
                a = prev;
            }
            b = root;
        }
        prev = root;
        helper(root.right);
    }

    void correctBST(Node root) {
        helper(root);
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}
