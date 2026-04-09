import java.util.Scanner;
public class OOP1
{
    String name;
    int rollNo;
    int marks;

    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Marks : " + marks);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        OOP1 oop = new OOP1();
        oop.name = s.nextLine();
        oop.rollNo = s.nextInt();
        oop.marks = s.nextInt();
        oop.display();
    }    
}
