import java.util.ArrayList;

public class MergeLinkedLists {
    Node sortedMerge(Node head1, Node head2) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Pushing the values of the first linked list
        while (head1 != null) {
            arr.add(head1.data);
            head1 = head1.next;
        }

        // Pushing the values of the second linked list
        while (head2 != null) {
            arr.add(head2.data);
            head2 = head2.next;
        }

        // Sorting the list
        Collections.sort(arr);

        // Creating a new list with sorted values
        Node dummy = new Node(-1);
        Node curr = dummy;

        for (Integer integer : arr) {
            curr.next = new Node(integer);
            curr = curr.next;
        }

        return dummy.next;
    }
}
