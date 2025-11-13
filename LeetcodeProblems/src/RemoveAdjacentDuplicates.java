import java.util.Stack;

class RemoveAdjacentDuplicates
{
    public static String removeDuplicates(String s, int k)
    {
        Stack<Pair> stack = new Stack<>();   // s = "deeedbbcccbdaammb", k = 3
        for(char c:s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek().ch == c)
            {
                stack.peek().count++;
                if(stack.peek().count == k)
                    stack.pop();
            }
            else
                stack.push(new Pair(c, 1));
        }
        StringBuilder result = new StringBuilder();
        for(Pair p : stack)
        {
            for(var i=0;i<p.count;i++)
                result.append(p.ch);
        }
        return result.toString();
    }

    private static class Pair
    {
        char ch;
        int count;
        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void main(String[] args)
    {
        String s = "deeedbbcccbdaa";
        var k = 3;
        System.out.println(removeDuplicates(s,k));
    }
}