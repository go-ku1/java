package leetcode;

public class ReverseLinkedList_recursion {
    static ListNode head;

    public static ListNode reverseList(ListNode head) {
//        tricky ..just write it down
//        consider list 1->2->3->4->null
        if(head==null||head.next==null){
            return head;
        }
        ListNode rest=reverseList(head.next);
//        here head's next node,s arrow is  pointed to head itself and therfore reverted
        head.next.next=head;
//        By setting the head.next to null, we are effectively cutting off the link between the
//        last node and its original next node. This ensures that the reversed linked list is a valid singly linked list
//        without any cycles.
        head.next=null;

        return rest;
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
        ReverseLinkedList_recursion list = new ReverseLinkedList_recursion();
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


