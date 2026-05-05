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
    public void reorderList(ListNode head) {
        int len=0;
        ListNode dummy = head;
        while(dummy!=null)
        {
            dummy = dummy.next;
            len++;
        }
        int counter = 0;
        
        ListNode l1 = head;
        ListNode l2 = head;

        while(counter<(len-(len/2)) && l2 != null )
        {
            l2 = l2.next;
            counter++;
        }
        ListNode temp = head;
        for (int i = 1; i < (len - (len / 2)); i++) {
            temp = temp.next;
        }
        temp.next = null;

        ListNode prev = null;
        ListNode post = null;
        
        while(l2!=null)
        {
            post = l2.next;
            l2.next = prev;
            prev = l2;
            l2 = post;
        }
       
        ListNode a = l1;
        ListNode b = prev;

        while (a != null && b != null) {
            ListNode nextA = a.next;   
            ListNode nextB = b.next;
            a.next = b;
            b.next = nextA;
            a = nextA;   
            b = nextB;
        }
    }
}
