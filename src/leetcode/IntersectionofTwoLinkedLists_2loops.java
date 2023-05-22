package leetcode;

public class IntersectionofTwoLinkedLists_2loops {

    static ListNode head1,head2;
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//        this is like a nested loop we would use if we want toperform this in an array
//                this finds all possible solution to get the required one..so this is
//            brute force
        while(headA!=null){
            ListNode temp=headB;
            while(temp!=null){
                if(temp==headA){
                    return headA;
                }
                temp=temp.next;
            }
            headA=headA.next;
        }
        return null;
    }
    public static void main(String[] args){
        IntersectionofTwoLinkedLists_2loops list = new IntersectionofTwoLinkedLists_2loops();
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
