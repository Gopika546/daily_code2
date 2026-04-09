import java.util.Scanner;
public class RectangleArea 
{
    int length;
    int width;

    public void area()
    {
        System.out.println("Area : " + length * width);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        RectangleArea ra = new RectangleArea();
        ra.length = s.nextInt();
        ra.width = s.nextInt();
        ra.area();
    }    
}
