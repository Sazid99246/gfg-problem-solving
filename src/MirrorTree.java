public class MirrorTree {
    void mirror(Node node) {
        if (node == null) {
            return;
        }

        // Recursively mirror left and right subtrees
        mirror(node.left);
        mirror(node.right);

        // Swap left and right children
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
