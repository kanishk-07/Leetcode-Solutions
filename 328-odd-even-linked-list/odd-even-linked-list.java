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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode odd = new ListNode(0), oddHead = odd;
        ListNode even = new ListNode(0), evenHead = even;
        while(head!=null) {
            odd.next = head;
            even.next = head.next;
            odd = odd.next;
            even = even.next;
            head = head.next==null ? null : head.next.next;
        }
        odd.next = evenHead.next;
        return oddHead.next;
    }
}