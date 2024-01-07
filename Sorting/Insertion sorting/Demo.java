public class Demo {

    public static void main(String argu[]) {

        int arr[] = { 12, 34, 9, 6, 4, 5 };

        for (int i = 1; i < arr.length; i++) {
            int small = arr[i];
            int l = i - 1;
            while (l >= 0 && small < arr[l]) {
                arr[l + 1] = arr[l];
                l--;
            }
            arr[l + 1] = small;
        }

        // after sorting the array:

        System.out.println("After sorting the array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
