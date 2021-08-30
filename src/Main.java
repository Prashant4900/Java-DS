import linkedlist.singly.SinglyLinkList;

class Main {
    public static void main(String[] arr) {
        int[] numbers = new int[]{1,2,3,4,5,6};
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.display();
        singlyLinkList.length();
        singlyLinkList.insertAll(numbers);
        singlyLinkList.display();
        singlyLinkList.length();
        singlyLinkList.insertFirst(50);
        singlyLinkList.display();
        singlyLinkList.length();
        singlyLinkList.insertLast(55);
        singlyLinkList.display();
        singlyLinkList.length();
        singlyLinkList.insertIndex(5,87);
        singlyLinkList.display();
        singlyLinkList.length();
        System.out.println("*********************************");
        singlyLinkList.insertMiddle(784);
        singlyLinkList.display();
        singlyLinkList.length();
    }
}

