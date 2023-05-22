package leetcode;

import java.util.HashSet;

//we use hash set because only single value
public class LinkedListCycle_hashset {
    static ListNode head;
    public static boolean hasCycle(ListNode head) {
//        a hash which stores list nodes are made
        HashSet<ListNode> hs=new HashSet<>();
        while(head!=null){
//if the hs already contains that node,because we have added it previously,means we have already visited it
//            means there is a loop
//    here hs is list node type ,so the .contains returns true only if hs contains exact same node
//    including value and the memory location
            if(hs.contains(head)){
                return true;
            }
//            if are encountering the list node for the first time ,its added
//            to hs
            hs.add(head);
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle_floyd llist = new LinkedListCycle_floyd();

//        making a object llist of class LinkedListCycle_floyd because we need to use push function
//        we can also make an instace of LinkedListCycle_hashset class but we will have to again make
//        the push function inside this class.so we conveniently use LinkedListCycle_floyd class
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        System.out.println(hasCycle(head));
    }
}
