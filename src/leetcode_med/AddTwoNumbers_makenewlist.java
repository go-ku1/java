package leetcode_med;


//we make a list node class which can be used through out this package
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public  class AddTwoNumbers_makenewlist {
//    these heads and variables are used in the push section  to form head
//    of corresponding lists
    static ListNode head;
    static ListNode head1,head2,result;

//    ithink we have never create a new linked list .first we need to start with a new dummy node and keep
//            on adding new nodes to it
    static ListNode dummy = new ListNode(0);

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
//        maing a current node to cahnge by next and dummy is kept intacct
        ListNode curr = dummy;
//        carry == 1 is if l1 and l2 has reached null and there is a1 carried from the previous sum ,then loop
//                hasto go inorder to create a new node
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;//for the next loop
//            creating new node with sum or the last letter of sum as the val
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
//        dummy is 0 .to the next of the the dummmy is the first node created.so the head of the new ll must be the dummy.next
        return dummy.next;
    }
    /* A utility function to push a value to linked list */
//    this is a special function to input values to 2 linked ,the parametres are the value to be entered and the
    void push(int val, int list)
    {
        ListNode newnode = new ListNode(val);
        if (list == 1)
        {
            newnode.next = head1;
            head1 = newnode;
        }
        else if (list == 2)
        {
            newnode.next = head2;
            head2 = newnode;
        }
        else
        {
            newnode.next = result;
            result = newnode;
        }

    }

    public static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {
        AddTwoNumbers_makenewlist llist = new AddTwoNumbers_makenewlist();

            llist.push(2,1);
        llist.push(4,1);
        llist.push(3,1);

        llist.push(5,2);
        llist.push(6,2);
        llist.push(4,2);

       head=addTwoNumbers(head1,head2);
       printList(head);
    }
}
