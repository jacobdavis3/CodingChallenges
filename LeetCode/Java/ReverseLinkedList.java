/******************************************************************************************
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 *****************************************************************************************/

class ReverseLinkedList {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        
        ListNode cur = head.next;
        ListNode prev = head;
        prev.next = null;

        while (cur.next != null) {
            ListNode tempNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempNext;
        }

        cur.next = prev;

        return cur;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();

        // Test Case 1
        // Create the linked list 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = rll.new ListNode(1);
        head1.next = rll.new ListNode(2);
        head1.next.next = rll.new ListNode(3);
        head1.next.next.next = rll.new ListNode(4);
        head1.next.next.next.next = rll.new ListNode(5);

        System.out.println("\nExpected:");
        System.out.println("5 4 3 2 1");
        ListNode reversedHead1 = rll.reverseList(head1);
        System.out.println("Reversed List:");
        rll.printList(reversedHead1);
        System.out.println();

        // Test Case 2
        // Create the linked list 1 -> 2
        ListNode head2 = rll.new ListNode(1);
        head2.next = rll.new ListNode(2);

        System.out.println("Expected:");
        System.out.println("2 1");
        ListNode reversedHead2 = rll.reverseList(head2);
        System.out.println("Reversed List:");
        rll.printList(reversedHead2);
        System.out.println();

        // Test Case 3
        // Create empty linked list
        ListNode head3 = null;

        System.out.println("Expected: (Nothing should be printed below)");
        System.out.println("");
        ListNode reversedHead3 = rll.reverseList(head3);
        System.out.println("Reversed List:");
        rll.printList(reversedHead3);
    }
}
