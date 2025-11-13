class StringHandlingMethods
{
public static void main(String mai[])
{
String str1="Maithri";      // using String literal
String str2=new String("Apple "); //using new keyword
System.out.println(str1);
System.out.println(str2);
System.out.println(str1.length());
System.out.println(str2.length());
System.out.println(str1.toLowerCase());
System.out.println(str1.toUpperCase());
System.out.println(str1.startsWith("M"));
System.out.println(str1.startsWith("r"));
System.out.println(str1.endsWith("i"));
System.out.println(str2.trim());
System.out.println(str1.equals(str2));
System.out.println(str1.replace(str1,str2));
System.out.println(str2.indexOf('A'));
System.out.println(str2.charAt(1));
}
}

