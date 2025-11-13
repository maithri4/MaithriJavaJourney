import java.util.Stack;

public class ReverseList {

    void reverseList(Node head) {
        if(head == null || head.next==null) return;

        var stack = new Stack<Node>();
        Node temp = head;

        while (temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        head = stack.pop();
        temp = head;
        while (!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;

        //print the list
        temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");

        Node prev = null, curr = head;
        while (curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        curr = prev;
        while (curr!=null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println((String) null);
    }

    public static void main(String[] args)
    {
        Node head = new Node(24);
        head.next = new Node(305);
        head.next.next = new Node(143);
        new ReverseList().reverseList(head);
    }
}
