public class Question1 {

    public static void sort(int arr[]) {

        // int count = 0;
        System.out.println("Before Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            int small = arr[i];
            int l = i - 1;
            while (l >= 0 && small < arr[l]) {
                arr[l + 1] = arr[l];
                // System.out.println(arr[l+1]);
                l--;
                // System.out.println("\n"+l);
                // count++;
            }
            arr[l + 1] = small;
        }
        
        System.out.println("\nAfter Sorting:");
       
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String argu[]) {
        int arr[] = { 5, 2, 6, 9, 1 };
        sort(arr);
    }
}
