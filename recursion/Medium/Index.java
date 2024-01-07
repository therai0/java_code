// Time complexity O(n) where N is length of the string.
package Medium;

class Index {

    static int First = -1;
    static int Last = -1;
    static void findOcc(String str, int i, char ent) {
        if (i == str.length()) {
            System.out.println("First occurence:" + First);
            System.out.println("Last occurence:" + Last);
            return;
        }
        char cur = str.charAt(i);
        if (cur == ent) {
            if (First == -1) {
                First = i;
            } else {
                Last = i;
            }
        }
        findOcc(str, i+1, ent);
    }
    public static void main(String arp[]) {
        String str = "applea";
        findOcc(str, 0, 'a');
    }
}