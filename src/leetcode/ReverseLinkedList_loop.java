package leetcode;

public class ReverseLinkedList_loop {
    static ListNode head;

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode nxt = null;
        ListNode prev = null;

        while (curr != null) {
//            making nxt the next node.incementing nxt
            nxt = curr.next;
//            here curr.next is on left of "=".so curr.next is the array from curr.now it
//            is reverted  to prev.this is the most important in wjich arrow is reversed.rest everything is incremnenting
//            the nodes
            curr.next = prev;
//            incrementing prev
            prev = curr;
//            incrementing curr
            curr = nxt;
        }
//        we assign the last value of th ll as head
        head = prev;
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

        ReverseLinkedList_loop list = new ReverseLinkedList_loop();
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
