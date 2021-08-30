package linkedlist.singly;

import org.jetbrains.annotations.NotNull;

public class SinglyLinkList {

    ListNode head;
    int count = 0;

    // Insert Operations
    public void insertAll(int @NotNull [] arr) {
        head = new ListNode(arr[0]);
        int i = 1;

        while (i <= arr.length - 1) {
            ListNode node = new ListNode(arr[i]);
            node.next = head;
            head = node;
            i++;
        }
    }

    public void insertFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;

    }

    public void insertIndex(int index, int data) {
        int size = length();
        ListNode newNode = new ListNode(data);

        if (index > size)
            throw new ArrayIndexOutOfBoundsException();

        if (size == 0 || index == size) {
            insertLast(data);
            return;
        }

        ListNode pervNode = null;
        ListNode nextNode = null;
        ListNode temp;

        if (index <= size - 1) {
            temp = head;
            while (count != index) {
                pervNode = temp;
                nextNode = temp.next;
                temp = temp.next;
                count++;

            }
            assert pervNode != null;
            pervNode.next = newNode;
            newNode.next = nextNode;

        }

    }

    public void insertMiddle(int data) {
        int middle = length() / 2;
        insertIndex(middle,data);
//        ListNode pervNode = null;
//        ListNode nextNode = null;
//        ListNode temp;
//
//        temp = head;
//        while (count != middle) {
//            pervNode = temp;
//            nextNode = temp.next;
//            temp = temp.next;
//            count++;
//
//        }
//        assert pervNode != null;
//        pervNode.next = newNode;
//        newNode.next = nextNode;
    }

    // Insert Operations
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        System.out.println("Length of Singly Link List: " + count);
        return count;
    }
}