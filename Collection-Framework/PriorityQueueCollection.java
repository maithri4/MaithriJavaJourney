import java.util.*;  
class PriorityQueueCollection
{  
public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Apple"); 
queue.add("java");   
 queue.add("mai"); 
queue.add("cse");  
queue.add("mai"); 
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println(queue); 
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
System.out.println(queue);  
}  
}  