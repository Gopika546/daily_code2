import java.util.*;
public class FlamesGame 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String name1 = s.nextLine();
        String name2 = s.nextLine();
        String result = flames(name1, name2);
        System.out.println(result);
    }

    public static String flames(String name1, String name2) 
    {
        name1 = name1.toLowerCase().replaceAll("\\s", "");
        name2 = name2.toLowerCase().replaceAll("\\s", "");

        StringBuilder sb1 = new StringBuilder(name1);
        StringBuilder sb2 = new StringBuilder(name2);

        for (int i = 0; i < sb1.length(); i++) 
        {
            char ch = sb1.charAt(i);
            int index = sb2.indexOf(String.valueOf(ch));
            if (index != -1) {
                sb1.deleteCharAt(i);
                sb2.deleteCharAt(index);
                i--;
            }
        }
        int count = sb1.length() + sb2.length();
        List<Character> flames = new ArrayList<>(
                Arrays.asList('F', 'L', 'A', 'M', 'E', 'S'));

        int index = 0;

        while (flames.size() > 1) 
        {
            index = (index + count - 1) % flames.size();
            flames.remove(index);
        }

        char result = flames.get(0);

        // Map result
        switch (result) {
            case 'F': return "Friends";
            case 'L': return "Love";
            case 'A': return "Affection";
            case 'M': return "Marriage";
            case 'E': return "Enemies";
            case 'S': return "Siblings";
        }
        return "";
    }
}
