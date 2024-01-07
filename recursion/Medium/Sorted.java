// check the array is sorted or not strickly:
package Medium;

public class Sorted {
    static boolean result = false;

    static void isSorted(int i, int arr[]) {
        // base case
        if (i == arr.length - 1) {
            System.out.println(result);
            return;
        }
        if (arr[i] < arr[i + 1]) {
            result = true;
        } else {
            result = false;
            System.out.println(result);
            return;
        }
        isSorted(i + 1, arr);
    }
    public static void main(String a[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        isSorted(0, arr);
    }
}
