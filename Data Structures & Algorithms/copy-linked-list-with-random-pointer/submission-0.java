/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null) return null;

        Node current = head;
        while(current!=null)
        {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        Node curr = head;
        while(curr!=null)
        {
            if(curr.random!=null) curr.next.random = curr.random.next;

            curr = curr.next.next;
        }

        curr = head;
        Node dummy = new Node(0);
        Node l = dummy;

        while(curr!=null){
            Node copy = curr.next;
            curr.next = copy.next;
            l.next = copy;
            l = copy;
            curr = curr.next;
        }

        return dummy.next;
    }
}
