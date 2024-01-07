package Medium;

public class DeleteDuplicate {
    public static boolean map[] = new boolean[26];

    public static void deleteDuplicate(String str, String newStr, int idx)
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(idx);
        if(map[current - 'a'] == true)
        {
            deleteDuplicate(str, newStr, idx+1);
        }
        else  {
            newStr += current;
            map[current - 'a'] = true;
            deleteDuplicate(str, newStr, idx+1);
        }
    }
    public static void main(String ar[])
    {
    // deleteDuplicate("abcdde", "", 0);
    int num = 'c' - 'a';
    System.out.println(num);
   
    }
}
