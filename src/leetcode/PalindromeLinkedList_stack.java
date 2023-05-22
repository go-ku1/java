package leetcode;
import java.util.Stack;
public class PalindromeLinkedList_stack {
       public static boolean isPalindrome(ListNode head) {
            Stack<ListNode> s = new Stack<>();
            ListNode temp = head;
            while (temp != null) {
                s.push(temp);
                temp = temp.next;
            }
            while (head != null) {
                ListNode i = s.pop();
                if (i.val != head.val) {
                    return false;
                }
                head = head.next;
            }
            return true;
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

