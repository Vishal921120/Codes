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
    
    public ListNode helper(ListNode[] lists, int left, int right){
        if(left==right) return lists[left];
        
        int mid = (left+right)/2;
        ListNode l1 = helper(lists, left, mid);
        ListNode l2 = helper(lists, mid+1, right);
        
        return merge2Lists(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0){
            //0 linked list
            return null;
        }
        
        return helper(lists,0,lists.length-1);
        
    }
}