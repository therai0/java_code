// Write a program to print the string reverse:
package Medium;

public class ReverseStr {
   static void reverse(String str, int len) {
        if (len == 0) {
            System.out.println(str.charAt(len));
            return;
        }
        System.out.println(str.charAt(len));
        reverse(str, len - 1);
    }

    public static void main(String ar[]) {
        String name = "abcd";
        int len = name.length()-1;
        reverse(name, len);

    }
}
