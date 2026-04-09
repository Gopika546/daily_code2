import java.util.Scanner;
public class RemoveSpace 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
                System.out.print(ch);
            else
                continue;
        }
    }
}


// import java.util.Scanner;

// public class RemoveSpace {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();

//         str = str.replace(" ", "");
//         System.out.println(str);
//     }
// }



// import java.util.Scanner;

// public class RemoveSpace {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();

//         StringBuilder result = new StringBuilder();

//         for (char ch : str.toCharArray()) {
//             if (ch != ' ') {
//                 result.append(ch);
//             }
//         }

//         System.out.println(result);
//     }
// }