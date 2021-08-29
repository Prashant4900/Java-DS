public class SinglyLinkList {

    private  ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    void printListNode() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkList sll = new SinglyLinkList();

        sll.head = new ListNode(5);
        ListNode second = new ListNode(10);
        ListNode tried = new ListNode(15);
        ListNode forth = new ListNode(20);
        ListNode five = new ListNode(25);

        sll.head.next = second;
        second.next = tried;
        tried.next = forth;
        forth.next = five;

        sll.printListNode();

    }
}
