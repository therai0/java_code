class Question2 {

    public static void sort(int arr[]) {

        System.out.println("Before Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int l = i; l < arr.length; l++) {
                if (arr[l] < arr[small]) {
                    small = l;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nAfter Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        } 
    }

    public static void main(String argu[]) {
        int arr[] = { 12, 4, 45, 36, 8, 5, 0 };
        sort(arr);
    }
}