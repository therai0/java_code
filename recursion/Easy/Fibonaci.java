public class Fibonaci {

    public static void run(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        run(b, c, n - 1);
    }

    public static void main(String arg[]) {
        int a = 0;
        int b = 1;
        int n = 10;
        run(a, b, n);
    }
}
