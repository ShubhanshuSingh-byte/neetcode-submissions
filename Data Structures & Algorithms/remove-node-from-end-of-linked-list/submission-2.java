/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //length pass
        ListNode d = head;
        int len=0;
        while(d!=null)
        {
            d = d.next;
            len++;
        }
        if(n==1 && n==len) return null;

        if(n==len) return head.next;

        //to be deleted node pass
        int c=0;
        ListNode s = head;
        while(c!=len-n-1 && s!=null)
        {
            s = s.next;
            c++;
        }

        //connecting n-1th node to n+1th node to ignore nth node pass
        ListNode fin = head;
        while(fin!=null)
        {
            if(fin==s)
            {
                fin.next = fin.next.next;
                break;
            }
            fin = fin.next;
        }

        return head;
    }
}
