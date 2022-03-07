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
    public ListNode getMiddle(ListNode head){
        ListNode slow = head , fast =head;
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast==null) return prev;
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head!=null){
            ListNode ahead = head.next;
            head.next = prev;
            prev = head;
            head = ahead;
        }
        
        return prev;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode second = reverse(mid.next);
        mid.next = null;
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        while(head!= null || second!=null){
            if(head!=null){
                tail.next = head;
                tail = head;
                head = head.next;
            }
            if(second!=null){
                tail.next = second;
                tail = second;
                second = second.next;
            }
        }
        
        head = dummy.next;
        
    }
}
