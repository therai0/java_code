package Medium;

import java.util.ArrayList;

public class LongestSub {
    static ArrayList<String> arr = new ArrayList<>();

    public static void sub(String str, int ind, String newStr) {
        if (ind == str.length()) {
            arr.add(newStr);
            return;
        }
        char curr = str.charAt(ind);
        sub(str, ind + 1, newStr + curr);
        sub(str, ind + 1, newStr);
    }

    void printLargestSubSequence() {
        // Iterator<String> itr = arr.iterator();
        String largeSub="";
        for (int i = 0; i < arr.size(); i++) {
            largeSub = arr.get(0);
            if (largeSub.length() < arr.get(i).length()) {
               largeSub = arr.get(i);
            }
        }
        System.out.println("Largest sub sequence: "+largeSub);
    }

    public static void main(String argw[]) {
        LongestSub obj = new LongestSub();
        sub("abced", 0, "");
        obj.printLargestSubSequence();
    }

}
