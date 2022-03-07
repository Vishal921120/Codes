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
    public ListNode merge2Lists(ListNode list1, ListNode list2) {
        //if only one list is given
        if(list2 == null) return list1;
        if(list1 == null) return list2;
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy , tail = dummy;
        
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        if(list1!=null) tail.next = list1;
        else tail.next = list2;
        
        return dummy.next;
        
    }
    
    public ListNode middle(ListNode head){
        ListNode slow=head, fast=head;
        ListNode prev= null;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast==null){
            //even
            return prev;
        }
        return slow; //odd
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode mid = middle(head);
        ListNode midNext = mid.next;
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        return merge2Lists(left,right);
    }
}