public class Node {
    int data;
    Node next, random, left, right;

    Node(int d)
    {
        this.data = d;
        next = random = null;
        left = right = null;
    }
}
