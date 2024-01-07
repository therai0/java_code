// Move the letter to the end:

package Medium;

public class MoveLetter {
     String all_a = "";
     String other = "";
     void moveIt(String strn,int i)
    {
        if(i == strn.length())
        {
            System.out.println(other+all_a);
            return;
        }
        char curnChar = strn.charAt(i);
        if(curnChar == 'a'){
            all_a +=  curnChar;
        }else {
            other += curnChar;
        }
        moveIt(strn, i+1);
    }


    static void moveLetter(int n, String str, int count, String newStr) {
        if (n == str.length()) {
            // for loop for adding the string at last
            for (int i = 0; i < count; i++) {
                newStr += "a";
            }
            System.out.println(newStr);
            return;
        }
        if (str.charAt(n) == 'a') {
            count += 1;
        } else {
            newStr += str.charAt(n);
        }
        moveLetter(n + 1, str, count, newStr);
    }

    public static void main(String ar[]) {
        // moveLetter(0, "aapple", 0, "");
       MoveLetter obj  = new MoveLetter();

        obj.moveIt("aapple", 0);
    }
}
