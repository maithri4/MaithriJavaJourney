import java.util.*;
class StringTokenizerCollection
{
public static void main(String args[])
{
StringTokenizer s=new StringTokenizer("Maithri is cute");
while(s.hasMoreTokens())
{
System.out.println(s.nextToken());
}
}
}