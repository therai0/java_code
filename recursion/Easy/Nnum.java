public class Nnum {

    public static void run(int n) {

        if (n == 0) {
            return;
        }
        // System.out.println(n);
        run(n - 1);
        System.out.println(n);
    }

    public static void main(String argu[]) {
        int n = 10;
        run(n);
    }

}
