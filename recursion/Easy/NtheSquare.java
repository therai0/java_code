public class NtheSquare {
    public static int calc(int n, int pw) {

        if (pw == 0) {
            return 1;
        } else if(n == 0) {
            return 0;
        }
        else {
            int Xpw = calc(n, pw-1);
            System.out.println("Xpw:" + Xpw);
            System.out.println("Pw: " +pw);
            System.out.println("N: " + n);
            int ans = n * Xpw;
            System.out.println( "Ans: " +ans);
            return ans;
        }
    }
    public static void main(String argu[]) {

        int num = 3;
        int power = 5;
        int answer = calc(num, power);
        System.out.println(answer);
    }
}
