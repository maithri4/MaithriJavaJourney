public class Strings1
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = new String("Hello").intern();
        System.out.println(s1 == s2);     // checks for reference equality
        System.out.println("contents of s1 and s2 are equal: "+s1.equals(s2));  // checks for content equality
        System.out.println("------------------------------");
        System.out.println("  ".isBlank());  // checks for white spaces
        System.out.println(" ".isEmpty()); // checks for empty string i.e, length = 0

        System.out.println("------------------------------");
        String sb1=new StringBuilder("Hello").toString();    //.intern();
        String sb2=new StringBuilder("Hello").toString();    //.intern();
        System.out.println(sb1 == sb2);
    }
}
