import java.util.Scanner;
public class RearrangeArray 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int index = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != 0) 
            {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n) 
        {
            arr[index] = 0;
            index++;
        }
        sort(arr, 0, n - countZeros(arr));
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static void sort(int[] arr, int s, int e) 
    {
        
        for(int i = s; i < e; i++)
        {
            for(int j = i + 1; j < e; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    static int countZeros(int[] arr) 
    {
        int count = 0;
        for (int num : arr) {
            if (num == 0) count++;
        }
        return count;
    }
}