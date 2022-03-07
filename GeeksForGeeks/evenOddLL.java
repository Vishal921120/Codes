class Solution{
    Node divide(int N, Node head){
        // code here
        Node evenHead = new Node(-1);
        Node oddHead = new Node(-1);
        
        Node evenTail = evenHead;
        Node oddTail = oddHead;
        
        while(head!=null){
            if(head.data%2 == 1){
                oddTail.next = head;
                oddTail = head;
                head = head.next;
            }else{
                evenTail.next = head;
                evenTail = head;
                head = head.next;
            }
        }
        
        oddTail.next = null;
        evenTail.next = oddHead.next;
        return evenHead.next;
    }
}
