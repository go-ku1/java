package leetcode;

//we already have aclass named listnode with different properties
//so we make a new class
class ListNode1 {
    int val;
    ListNode1 next;
    int flag;

    ListNode1(int x) {
        val = x;
        next = null;
        flag=0;
    }
}
public class LinkedListCycle_flag {
    static ListNode1 head;

    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                Put in the data*/
        ListNode1 new_node = new ListNode1(new_data);
//we initialise each pushed node with 0
        new_node.flag=0;

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static boolean hasCycle(ListNode1 head) {
        while(head!=null) {
            if (head.flag == 1) {
                return true;
            }
            head.flag=1;
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle_flag llist = new LinkedListCycle_flag();

//        making a object llist of class LinkedListCycle_flag because we have made a push function for it
//        and it has 'head' and
//            we didnt use LinkedListCycle_flag because its push function didnt have that flag initializing to zero each time.
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        System.out.println(hasCycle(head));
    }
}
