package Medium;

import java.util.HashSet;

public class UniqueSubsequence {

    public static void subsequence(int idx, String str, String newStr, HashSet<String> hash) {
        if (idx == str.length()) {
            if (hash.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                hash.add(newStr);
                return;
            }
        }
        char current = str.charAt(idx);
        // if str want to join
        subsequence(idx + 1, str, newStr + current, hash);

        // if str do not want to join
        subsequence(idx + 1, str, newStr, hash);
    }

    public static void main(String ar[]) {
        HashSet<String> haset = new HashSet<>();
        subsequence(0, "aaa", "", haset);
    }
}
