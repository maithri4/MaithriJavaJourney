public class RemoveNthNodeFromEnd
{
   static public Node removeNthFromEnd(Node head, int n)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow=dummy, fast=dummy;

        for(int i=0;i<=n;i++)
            fast = fast.next;

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args)
    {
        Node head = new Node(1);
        Node temp = head;
        for(int i=2;i<=10;i++){
            temp.next = new Node(i);
            temp = temp.next;
        }

        head = removeNthFromEnd(head, 2);
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
