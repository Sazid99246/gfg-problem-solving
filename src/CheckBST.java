public class CheckBST {
    boolean isBST(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.data < findMax(root.left).data) {
            return false;
        }
        if (root.right != null && root.data > findMin(root.right).data) {
            return false;
        }

        return (isBST(root.left) && isBST(root.right));
    }

    Node findMin(Node root) {
        if (root == null) {
            return null;
        }

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    Node findMax(Node root) {
        if (root == null) {
            return null;
        }

        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
}
