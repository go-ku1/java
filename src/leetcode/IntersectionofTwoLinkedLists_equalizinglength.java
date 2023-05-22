package leetcode;
import java.util.LinkedList;
public class IntersectionofTwoLinkedLists_equalizinglength {
    static ListNode head1,head2;
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode prt1,prt2;
        int d;
        int l1=getLength(headA);
        int l2=getLength(headB);
        if(l1>l2){
            prt1=headA;
            prt2=headB;
            d=l1-l2;
        }
        else{
            prt1=headB;
            prt2=headA;
            d=l2-l1;
        }
//        making the prt1 same length as prt2 by reducing the difference d
        while(d>0){
            if(prt1==null){
                return null;
            }
            prt1=prt1.next;
            d--;
        }
        while(prt1!=null){
//            as prt1 and prt2 have the same length remaining
//                    if there is common nodes ,it will start at same length
//           for (prt1==prt2)the whole node has to be equal including value and the memory location
//            so prt1 and prt2 are just the same node
            if(prt1==prt2){
                return prt1;
            }
            prt1=prt1.next;
            prt2=prt2.next;
        }
        return null;
    }
    public static int getLength(ListNode k){
        int i=0;
        while(k!=null){
            i++;
            k=k.next;
        }
        return i;
    }
public static void main(String[] args){
//        i thought we could use this way to enter the lists
//            but in LinkedListCycle_floyd class,the push function we used had the head of the
//            list continously changing.but we need the head of the list here to pass to the function

//    LinkedListCycle_floyd list1=new LinkedListCycle_floyd();
//    LinkedListCycle_floyd list2=new LinkedListCycle_floyd();
//
//    list1.push(3);
//    list1.push(6);
//    list1.push(9);
//    list1.push(15);
//    list1.push(30);
//
//    list2.push(10);
//    list2.push(15);
//    list2.push(30);
//    System.out.println(list1.head.val);
//    System.out.println(getIntersectionNode(list1.head,list2.head).val);

    IntersectionofTwoLinkedLists_equalizinglength list = new IntersectionofTwoLinkedLists_equalizinglength();
//    while creating ll this way,the head is not
//    here also we cant use the builtin linked list class because we need to define head1 and head2

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
    System.out.println(getIntersectionNode(list.head1,list.head2).val);
}
}
