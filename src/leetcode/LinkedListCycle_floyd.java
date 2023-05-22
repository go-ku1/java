package leetcode;
import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle_floyd {

    static ListNode head;

//    the built in linked list class already has push function
//    here we cant use it because the ll class doesnt have 'head'.
//    but LinkedListCycle_floyd is made by us.so we make 'head' in 15th line.
//    but as we dont use th builtin ll class ,we dont have the push command
//            so we make one pushfunction
    //i dont think a tree has such bulit in class ,so we made a class in previous tree problems
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }




    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
//            fast moves 2 nodes at a time,slow moves only1,if there
//                    is a cycle then these two be at equal node at some point
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle_floyd llist = new LinkedListCycle_floyd();

//        making a object llist of class LinkedListCycle_floyd because we need to use push function
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        System.out.println(hasCycle(head));
    }
}
