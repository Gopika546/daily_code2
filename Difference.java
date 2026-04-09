import java.util.Scanner;
public class Difference 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(Math.abs(arr[i] - arr[j]) > 5)
                    count++;
            }
        }
        System.out.println(count);
    }    
}
