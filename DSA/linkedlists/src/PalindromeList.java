import java.util.Stack;

public class PalindromeList
{
    public static void main(String[] args)
    {
        Node head = new Node(305);
        head.next = new Node(143);
        head.next.next = new Node(305);

        if(isPalindrome(head))
            System.out.println("Given list is palindrome..!");
        else
            System.out.println("Given list is not a palindrome..!");
    }
    static boolean isPalindrome(Node head){
        var stack = new Stack<Integer>();
        Node temp = head;

        while (temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null){
            if(temp.val != stack.pop()) return false;
            temp = temp.next;
        }
        return true;
    }
}
