
public class FiveNum {
    public static void print(int a) {
        if(a > 10) {
          return;
        }else {
            System.out.println(a);
            print(a+1);
        }
    }
    public static void main(String argu[]) {
        int a = 1;
        print(a);
    }
}
