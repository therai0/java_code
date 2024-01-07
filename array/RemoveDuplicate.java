import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    static int deleteDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        Integer[] newArr = hs.toArray(new Integer[0]);
        for (int n : newArr) {
            System.out.print(n + " ");
        }
        System.out.println();
        return hs.size();
    }

    public static void main(String ar[]) {
        int[] nums = { 1, 2, 3, 3, 4, 4, 5 };
        System.out.println("The size of new Array is: "+deleteDuplicate(nums));
    }
}
