class WordsCount
{
public static void main(String args[])
{
String words = "One Two Three Four java world a";
int countWords = words.split("\\s").length;
System.out.println(countWords);
}
}