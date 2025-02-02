public class Node {
    int data;
    Node next, random, left, right;

    Node(int d)
    {
        data = d;
        next = random = null;
        left = right = null;
    }
}
