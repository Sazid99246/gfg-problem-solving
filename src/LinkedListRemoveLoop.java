public class LinkedListRemoveLoop {
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (!flag) return;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        Node saviour = fast;
        while (saviour.next != fast) {
            saviour = saviour.next;
        }
        saviour.next = null;
    }
}
