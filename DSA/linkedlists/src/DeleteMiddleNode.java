public class DeleteMiddleNode
{
    public Node deleteMiddle(Node head)
    {
        if (head == null || head.next == null)
            return null;

        int mid = length(head)/2;
        Node temp=head;
        for(int i=0;i<mid-1;i++)
            temp=temp.next;

        temp.next = temp.next.next;

        return head;
    }
    int length(Node node){
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        return len;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(6);

        head = new DeleteMiddleNode().deleteMiddle(head);
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
