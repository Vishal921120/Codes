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
        ListNode firstHead = new ListNode(-1);
        ListNode secondHead = new ListNode(-1);
        ListNode firstTail = firstHead;
        ListNode secondTail = secondHead;

        while(head!=null){
            firstTail.next = head;
            firstTail = head;
            head = head.next;
            if(head!=null){
                secondTail.next = head;
                secondTail = head;
                head = head.next;
            }
        }
        
    
        secondTail.next = null;

        firstTail.next = secondHead.next;
        return firstHead.next;

        
    }
}
