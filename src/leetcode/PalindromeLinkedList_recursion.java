package leetcode;

public class PalindromeLinkedList_recursion {
//    consider 1-> 2-> 3-> 4-> 3-> 2->1 ..odd number of elements
    static ListNode root;
    public static boolean isPalindrome(ListNode head) {
         root=head;
        return rec(head);
    }
    public static boolean rec(ListNode head){
        boolean flag=true;
//        at last node ,when head=1,the while is not excecuted
//                and if condition is satisfied,so returns true to flag recursivly(head=3)
//        we need to understand that we can go backwards in an ll by using recursion
        while(head.next!=null){
            flag=rec(head.next);
        }
//        root.val==head.val compares the root which is going forwrd by .next
//                and head which going back recursively
        if(flag && root.val==head.val){
            root=root.next;
            return true;
        }
        return false;
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
