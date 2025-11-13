
public class LinkedList
{
    Node head;

    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null)
            temp = temp.next;
        temp.next = newNode;
    }
    void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void insertAtHead(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    void insertAtMiddle(int data){
        var len = 0;
        Node temp = head;
        while (temp!=null) {
            ++len;
            temp=temp.next;
        }
        var mid = len/2;

        temp=head;
        for(int i=0;i<mid-1;++i){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void insertAtPosition(int val, int pos){
        Node newNode = new Node(val);

        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++)
            temp = temp.next;

        if(temp == null){
            System.out.println("Position out of range..");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


}
