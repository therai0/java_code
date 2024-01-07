package Medium;

public class Subsequence {
    //time complexity: O(2^n) (n is the length of the string)
    public static void subsequence(int idx, String str, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(idx);
        // if str want to join
        subsequence(idx + 1, str, newStr + current);

        // if str do not want to join
        subsequence(idx + 1, str, newStr);
    }
    public static void main(String ar[]) {
        subsequence(0, "abc", "");
    }
}
