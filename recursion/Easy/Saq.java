// program to print the square of enter number:

public class Saq {

    public static int find_sqr(int n, int pw) {

        if (pw == 0) {
            return 1;
        } else {

            int Xpow = find_sqr(n, pw - 1);
            System.out.println("Xpowe:" + Xpow);
            // System.out.println("N value:" + n);
            int ans = Xpow * n;
            // System.out.println("Ans: " + ans);
            return ans;
        }
    }

    public static void main(String argu[]) {

        int answer = find_sqr(2, 5);
        System.out.println("Answer:" + answer);

    }
}
