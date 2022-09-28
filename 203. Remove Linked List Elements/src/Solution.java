public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        while (head!=null && head.next!=null){
            while (head.next!=null && head.next.val==val){
                head.next = head.next.next;
            }
          head = head.next;
        }
        return dummy.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        //remove all the nodes that have the value of val
        //return the head of the new list
        //if the head is null, return null

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr!=null){
            if (curr.val==val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public ListNode removeElements3(ListNode head, int val){
        if(head == null) return null;
        while (head.val==val){
            head=head.next;
            if(head==null){
                return null;
            }
        }

        ListNode current = head;
        while (current.next!=null){
            if(current.next.val==val){
                current.next = current.next.next;
            }else {
                current=current.next;
            }

        }
        return head;
    }
}

//==================================================|
//  iterate over the linked list from start to end  |
//==================================================|
//      while (helper!=null && helper.next!=null){  |
//          System.out.println(helper.val);         |
//          helper = helper.next;                   |
//      }                                           |
//==================================================|