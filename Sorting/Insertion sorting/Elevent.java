public class Elevent {

    public static void main(String argu[]) {
        int arr[] = { 123, 556, 6, 45 };

        for (int i = 1; i < arr.length; i++) {
            int small = arr[i];
            int l = i - 1;
            while (l >= 0 && arr[l] > small) {
                arr[l + 1] = arr[l];
                l--;
            }
            arr[l + 1] = small;
        }

        for(int x:arr)
        {
            System.out.print(x + " ");
        }
    }
}
