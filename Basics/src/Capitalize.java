public class Capitalize
{
    static String capitalize(String s)
    {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words)
        {
            res.append(word.substring(0,1) + Character.toUpperCase(word.charAt(1)) + word.substring(2)+" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args)
    {
        System.out.println(capitalize("hello welcome to java programming"));
        System.out.println(5432%1000);
    }
}
