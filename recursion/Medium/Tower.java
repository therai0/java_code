package Medium;

public class Tower {
    void towerOfHanoi(int n, String src, String helper, String dest)
    {     
        if(n == 1)
        {
            System.out.println("Transfer disk "+n +" from " + src + " to " + dest);
            return;
        }
        // transfering the all the element(except largest element) from source to helper with the help of destination 
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n +" from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String ar[]) {
      Tower obj = new Tower();
      obj.towerOfHanoi(3, "S", "H", "D");
    }
}
