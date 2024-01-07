public class Check {
    static void check(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Before:" + n);
        check(n - 1);
        // System.out.println("Middle:"+n);
        check(n-1);
        // System.out.println("After:"+n);
    }

    public static void main(String ar[]) {
        check(3);
    }

}
