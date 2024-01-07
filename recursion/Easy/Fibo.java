
public class Fibo {

    public static void num(int a,int b ,int n) {
        
        if(n == 0){
            return;
        }
        else { 
        int c = a + b;
        System.out.print(c + " ");
        num(b, c, n-1);
    }
    }
    public static void main(String argu[]) {
       int a = 0, b = 1;
       int n = 10;
       System.out.println(a);
       System.out.println(b);
       num(a, b, n-2);
       //cause already the two number are printed so n-2 we pass
    }
}

