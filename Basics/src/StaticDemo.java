class LaunchStudent
{
    int id;
    String name;
    static String schoolName = "Shree sharadha Em-High school";

    public LaunchStudent(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("Id: "+id+", name: "+name+", School Name: "+schoolName);
    }
}

public class StaticDemo
{
    public static void main(String[] args)
    {
        LaunchStudent student1 = new LaunchStudent(589, "jyo");
        LaunchStudent student2 = new LaunchStudent(143, "Sri Ram");
        student1.display();
        student2.display();

        LaunchStudent.schoolName = "ZPB(H)S RKPM";
        System.out.println("_______________________________________________");
        student1.display();
        student2.display();
    }
}
