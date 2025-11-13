import java.util.Scanner;
class StudentData
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        StudentData obj=new StudentData();
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sd.nextLine();
        System.out.println("Enter your age: ");
        int age=sd.nextInt();
        sd.close();
        obj.setName(name);
        obj.setAge(age);
        System.out.println("YOUR DETAILS ARE:-");
        System.out.println("My name is: "+obj.getName());
        System.out.println("My age is: "+obj.getAge());
    }
}
