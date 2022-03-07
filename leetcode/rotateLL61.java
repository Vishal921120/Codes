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
    public ListNode rotateRight(ListNode head, int k) {
        //edge case
        if(head==null || k==0){
            return head;
        }
        
        //compute the length
        int length =1;
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
            length++;
        }
        
        //go till that node
        curr.next = head;
        k = k%length;
        k = length - k;
        
        while(k!=0){
            curr = curr.next;
            k--;           
        }
        
        //break the connection
        head = curr.next;
        curr.next = null;
        
        return head;    
    }
}