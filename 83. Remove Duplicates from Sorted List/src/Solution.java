public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //If the head is empty we don't need to search for any duplicates just return it straight forward
        if(head==null) return head;
        
        //We create a new List node to make the operation delete if necessary
        //This helper node will make operation on himself but with losing its head node
        //That's why we return the head and not this helper node
        ListNode current_node = head;
        
        //this will keep the helper node that iterates over the nodes to not go after the last node
        while (current_node!=null){
            //if the next value is not null and the next value is equal to the current value then
            //skip this node and go to the next (This continues until we meet a different value than the current)
            while (current_node.next!=null && current_node.next.val == current_node.val){
                
                //this hops over the next node and basically deletes it
                current_node.next = current_node.next.next;
            }
            
            //to continue to the end node we make the helper node be the next for him node
            current_node = current_node.next;
        }
        return head;
    }
}
