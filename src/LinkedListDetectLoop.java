public class LinkedListDetectLoop {
    public static boolean detectLoop(Node head) {
        Node slow = head;     // tortoise created
        Node fast = head;      // hare created
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;   // tortoise will move slow
            fast = fast.next.next;  // hare will move fast
            if(slow==fast)     // if they meet at any node, it detects loop
            {
                return true;
            }
        }
        return false;    // otherwise no loop
    }
}
