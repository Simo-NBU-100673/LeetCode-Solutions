public class Main {
    public static void main(String[] args) {
        ListNode c = new ListNode(3);
        ListNode b = new ListNode(4,c);
        ListNode a = new ListNode(2,b);

        ListNode c2 = new ListNode(4);
        ListNode b2 = new ListNode(6,c2);
        ListNode a2 = new ListNode(5,b2);

        Solution test = new Solution();
        System.out.println(test.addTwoNumbers(a,a2));


        //l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        ListNode d7 = new ListNode(9);
        ListNode d6 = new ListNode(9,d7);
        ListNode d5 = new ListNode(9,d6);
        ListNode d4 = new ListNode(9,d5);
        ListNode d3 = new ListNode(9,d4);
        ListNode d2 = new ListNode(9,d3);
        ListNode d1 = new ListNode(9,d2);

        ListNode e4 = new ListNode(9);
        ListNode e3 = new ListNode(9,e4);
        ListNode e2 = new ListNode(9,e3);
        ListNode e1 = new ListNode(9,e2);

        System.out.println(test.addTwoNumbers(d1,e1));
    }
}
