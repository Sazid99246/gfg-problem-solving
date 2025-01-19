class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

public class RotateLinkedLIst {
    public Node rotate(Node head, int k) {
        if(head==null || k==0) return head;
        int len=0;
        Node curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        k=k%len;
        if(len==1|| len==k || k==0){
            return head;
        }
        curr=head;
        while(k>1){
            curr=curr.next;
            k--;
        }
        Node newHead=curr.next;
        curr.next=null;
        Node newCurr=newHead;
        while(newCurr.next!=null){
            newCurr=newCurr.next;
        }
        newCurr.next=head;
        return newHead;
    }
}
