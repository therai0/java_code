public class Two {

    public static void main(String argu[]) {
        int arr[] = { 123, 43, 65, 76, 8, 8, 56, 7 };

        int n = arr.length;

        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int l = i - gap; l >= 0; l = l - gap) {
                    if (arr[l + gap] < arr[l]) {
                        int temp = arr[l];
                        arr[l] = arr[l + gap];
                        arr[l + gap] = temp;
                    }
                }
            }
        }
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }

}
