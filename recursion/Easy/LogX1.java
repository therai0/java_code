public class LogX1 {

    public static int print_logX(int n, int pw) {

        if (n == 0) {
            return 0;
        } else if (pw == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return print_logX(n, pw / 2) * print_logX(n, pw / 2);
        } else {
            return print_logX(n, pw / 2) * print_logX(n, pw / 2) * n;
        }
    }

    public static void main(String argu[]) {
        int ans = print_logX(3, 3);
        System.err.println(ans);
    }
}
