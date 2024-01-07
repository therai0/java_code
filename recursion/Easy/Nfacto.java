public class Nfacto {
    public static int calfact(int n) {
        if (n == 1) {
            return 1;
        }
        int ans = calfact(n - 1);
        int output = ans * n;
        return output;

    }

    public static void main(String argu[])
    {
        int num = 5;
        int ans = calfact(num);
        System.out.println("Factorial of 5 is "+ans);
    }
}
     

