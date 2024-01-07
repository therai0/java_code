

public class Facto {

    public static int Ans(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        // int fact_n = Ans(a - 1);
        int facto_n = Ans(a - 1) * a;
        return facto_n;
    }

    public static void main(String argu[]) {
        int n = 5;
        int answer = Ans(n);
        System.out.println("Factorial of " + n + " is " + answer);
    }
}
