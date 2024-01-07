class LogXjava {

    public static int calc(int n, int pw) {

        if (pw == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            if (pw % 2 == 0) {
                int ans = calc(n, pw / 2) * calc(n, pw / 2);
                System.out.println("Answer:" + ans);
            return ans;
            } else {
            return calc(n, pw / 2) * calc(n, pw / 2) * n;
            }
        }
    }

    public static void main(String argu[]) {

        int num = 2;
        int power = 4;
        int answer = calc(num, power);
        System.out.println(answer);
    }
}
