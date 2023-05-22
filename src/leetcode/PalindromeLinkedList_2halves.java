package leetcode;


public class PalindromeLinkedList_2halves {
    public static boolean isPalindrome(ListNode head) {
//        consider 1-> 2-> 3-> 4-> 3-> 2->1 ..odd number of elements
        ListNode slow=head,fast=head;
        //i used || instead of &&,it showed "dereference of a variable in java" error
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
//        means tha the ll consist of odd number of elemnets.there willbe a middle elment.here it is 4
//                so cant divide to 2 direct halfs.with left half bigger(with the middle element) and
//                right half smaller.,it should a
        if(fast!=null){
//            when fast has reached the last number,slow will be at  middle number
//            now we next to next number which is the starting of 2nd half
            slow=slow.next;
        }
//        if even,its equaly divided into 2 halves
//        1-> 2-> 3-> 4=1st
//        3-> 2->1=2nd
        slow=reverse(slow);
        fast=head;
//    slow is (head) is a reversed ll of the 2nd half
//        slow goes through the reversed ll
//        fast is the normal first half and it proceeds upto middle number if number of elements is odd
        while(slow!=null){
//            1-> 2-> 3-> 4=1st
//        3-> 2->1=2nd..at last 3=3 is compared,the slow incremneted to null
//            fast incremented to 4,loop gets termitated..therefore we dont need to take care of 4
            if (fast.val != slow.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
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
    public static void main(String[] args) {

        /* Start with the empty list */
        LinkedListCycle_floyd llist = new LinkedListCycle_floyd();
//            making a object llist of class LinkedListCycle_floyd because we need to use push function
//            we could have made a n instance othe present class PalindromeLinkedList_stack
        int str[] = {1, 2, 3, 4, 3, 2, 1};
//here we can no need to enter each of the node as"listnode" type ,create an array of the respective type and
//            push using a loop
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
        }
        System.out.println(isPalindrome(llist.head));
    }
}
