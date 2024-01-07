class Insertion {
    public static void sort(int arr[]) {
        System.out.println("Before sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            int small = arr[i];
            int l = i - 1;
            while (l >= 0 && small < arr[l]) {
                // arr[l + 1] = arr[l];
                l--;
            }
            arr[l+1] = small;
        }
        System.out.println("\nAfter sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String argu[]) {

        int a[] = { 12, 32, 4, 5, 2 };
        sort(a);
    }
}