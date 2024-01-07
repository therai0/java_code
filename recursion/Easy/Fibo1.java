public class Fibo1 {

    public static void Fobo(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        Fobo(b, c, n - 1);
    }

    public static void main(String argu[]) {

        int a = 0;
        int b = 1;
        int n = 10;
        Fobo(a, b, n);
    }
}
