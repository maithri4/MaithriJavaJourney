public class LaunchStringBuilder
{
    public static void main(String[] args)
    {
        Object obj1= new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));

        String str = new String("Maithri");

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(20);
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(str);
        StringBuilder sb4 = new StringBuilder("Hello Java");
        sb1.ensureCapacity(50);
        //System.out.println(sb1.capacity());

        System.out.println(sb3.length());
        sb3.append(44);   // String.valueOf();
        System.out.println(sb3);
        sb3.insert(7, "Reddy");
//        System.out.println(sb3);
//        sb3.setCharAt(7, ' ');
//        System.out.println(sb3);
//        sb3.deleteCharAt(0);
//        System.out.println(sb3);
        String s = sb3.substring(1);
        System.out.println(s);
        System.out.println(sb3.substring(0,7));

        sb2.setLength(3);
        System.out.println(sb2);
        String s1 = sb2.toString();
        System.out.println(s1.indexOf('H'));
        System.out.println(sb4.isEmpty());
        sb4.replace(0,5, "i Love");
        System.out.println(sb4);
        sb4.reverse();
        System.out.println(sb4);
        String s3 = "Car";
//        StringBuilder sb5 = new StringBuilder(s3);
//        String s4 = sb5.reverse().toString();

        s3 = new StringBuilder(s3).reverse().toString();
        System.out.println(s3);
        System.out.println(sb4.hashCode());
        StringBuilder sb6 = new StringBuilder("Hello");
        StringBuilder sb7 = new StringBuilder("Hello");
        System.out.println(sb6.equals(sb7));
    }
}
