public class Main
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(305);
        list.head.next = new Node(143);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(89);

        list.printList();
        list.insertAtEnd(45);
        list.printList();
        list.insertAtHead(25);
        list.printList();
        list.insertAtMiddle(24);
        list.printList();
        list.insertAtPosition(4,2);
        list.printList();
    }
}
