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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head, prevSlow = null;
        while(fast!=null && fast.next!=null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prevSlow==null || prevSlow.next==null)
            return null;
        prevSlow.next = prevSlow.next.next;
        return head;
    }
}