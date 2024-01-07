import java.util.Arrays;

public class shellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i - gap; j >= 0; j = j - gap) {
                    if (arr[j + gap] < arr[j]) {
                        int temp = arr[j + gap];
                        arr[j + gap] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 54, 2, 3 };
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        shellSort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
