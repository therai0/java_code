public class SortShell {

    public static void main(String argi[]) {
        int arr[] = { 123, 4, 456, 67, 7 };
        int gap = arr.length;

        for (int l = gap / 2; l >= 1; l = l / 2) {
            for (int k = l; k < arr.length; k++) {
                for (int i = k - l; i >= 0; i = i - l) {
                    if (arr[i] > arr[l + i]) {
                        int temp = arr[l + i];
                        arr[l + i] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        }
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
