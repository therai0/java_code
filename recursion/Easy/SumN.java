

import java.util.Scanner;

public class SumN {

    public static int sum(int a){
        int sum = 0;
        if(a ==0) {
            return 0;
        }else {
            sum = a + sum(a-1);
            // System.out.println(sum);
            return sum;
        }
    }
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number");
        int n = sc.nextInt();
        int s = sum(n);
        System.out.println("The sum of the enter number is " + s);
        sc.close();
    }
}
