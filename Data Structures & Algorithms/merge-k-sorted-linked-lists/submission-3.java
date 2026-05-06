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
    public ListNode mergeKLists(ListNode[] lists) {
        Stack<ListNode> stack = new Stack<>();
        for(ListNode i: lists) stack.add(i);

        ListNode node = new ListNode();
        
        while(stack.size()!=1 && !stack.isEmpty())
        {
            ListNode l = node;
            ListNode list1 = stack.pop();
            ListNode list2 = stack.pop();
            while(list1!=null && list2!=null)
            {
                if(list1.val<=list2.val)
                {
                    l.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else
                {
                    l.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                l = l.next;
            }
            if(list1==null) l.next = list2;
            else l.next = list1;
            stack.add(node.next);
        }
        return !stack.isEmpty() ? stack.pop() : null ;
    }
}
