package leetcode;
import java.util.HashSet;
public class IntersectionofTwoLinkedLists_hashset {
    static ListNode head1,head2;
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs=new HashSet<>();
        while(headA!=null){
            hs.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(hs.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
    public static void main(String[] args){
//        we use the the instance the main class.we dont need bultin class ll.just need two variables head1 head2 which
//                is made in this class
        IntersectionofTwoLinkedLists_hashset list = new IntersectionofTwoLinkedLists_hashset();
        // creating first linked list
        list.head1 = new ListNode(3);
        list.head1.next = new ListNode(6);
        list.head1.next.next = new ListNode(9);
        list.head1.next.next.next = new ListNode(15);
        list.head1.next.next.next.next = new ListNode(30);

        // creating second linked list
        list.head2 = new ListNode(10);
        list.head2.next = new ListNode(15);
        list.head2.next.next = new ListNode(30);
//    till now the lists were different because even though have sam e values theeir memory locations
//            are different.but this  statement equilizes the node
        head2.next.next.next = head1.next.next.next;
        System.out.println(getIntersectionNode(head1,head2).val);
    }
}
