package leetcode;

import java.util.Stack;

public class ReverseLinkedList_stack {
    static ListNode head;

    public static ListNode reverseList(ListNode head) {
//        consider list 1->2->3->4->null
        Stack<ListNode> s = new Stack<>();
        ListNode temp = head;
        while (temp.next != null) {
            s.push(temp);
//            temp reaches 4 but only upto 3 is pushed to s
            temp = temp.next;
        }
//        storing 4 as head
        head = temp;
//        this is important condition of taking element from the stack
        while (!s.isEmpty()) {
//            first iter:temp =4.the arrow of 4 is pointed from null to3.3 is the top element of s
            temp.next = s.peek();
//            pops 3 out
            s.pop();
//            temp is 4.as we changed arrow of 4 to 3.now the temp is cahnged to 3
            temp = temp.next;
        }
//        after loop,s is empty .temp is 1;putting arrow of 1 to null
        temp.next=null;
        return head;
    }
        public static void printList(ListNode node)
        {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
//        we used this class to get the head variable
//  use the same class if it has the variable head
            ReverseLinkedList_stack list = new ReverseLinkedList_stack();
            list.head = new ListNode(1);
            list.head.next = new ListNode(2);
            list.head.next.next = new ListNode(3);
            list.head.next.next.next = new ListNode(4);
            list.head.next.next.next.next = new ListNode(5);
            list.head.next.next.next.next.next = new ListNode(6);
            list.head.next.next.next.next.next.next
                    = new ListNode(7);
            list.head.next.next.next.next.next.next.next
                    = new ListNode(8);

            head=reverseList(head);
            printList(head);
        }

}
