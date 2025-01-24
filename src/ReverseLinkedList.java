public class ReverseLinkedList {
    Node ReverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Store next node
            current.next = prev;  // Reverse current node's pointer
            prev = current;       // Move pointers one step forward
            current = next;
        }

        head = prev;  // Update head to new head (last non-null node)
        return head;
    }
}
