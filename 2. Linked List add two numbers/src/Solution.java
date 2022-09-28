public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode c = new ListNode(3);
//        ListNode b = new ListNode(4,c);
//        ListNode a = new ListNode(2,b);
//
//        ListNode c2 = new ListNode(4);
//        ListNode b2 = new ListNode(6,c2);
//        ListNode a2 = new ListNode(5,b2);

        System.out.println(l1.val);
        System.out.println(l2.val);
        System.out.println();

//        if(l1.next != null && l2.next != null) {
//            int add=0;
//            if(l1.next.val+l2.next.val>9){
//                    add=(l1.next.val+l2.next.val)/10;
//            }
//            return new ListNode(((l1.val+ l2.val)+add)%10, addTwoNumbers(l1.next,l2.next));
//        }else {
//            return new ListNode((l1.val+ l2.val)%10);
//        }

        if(l1.next != null && l2.next != null) {
            int add=0;
            if(l1.next.val+l2.next.val>9){
                add=(l1.next.val+l2.next.val)/10;
            }
//            System.out.println(add);
            return new ListNode(((l1.val+ l2.val)+add)%10, addTwoNumbers(l1.next,l2.next));
        }else {
            return new ListNode((l1.val+ l2.val)%10);
        }


    }
}
