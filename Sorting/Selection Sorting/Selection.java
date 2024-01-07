class Selection {

    public static void sort(int arr[]) {
        System.out.println("Before sorting:");
        for(int x: arr) {
            System.out.print(x + " ");
        }
        for(int i = 0; i < arr.length-1; i++) {
            int small = i;
            for(int l = i+1; l < arr.length; l++)
            {
                if(arr[small] > arr[l]) {
                    small = l;
                }
            }
            // int temp = arr[i];
            // arr[i] = arr[small];
            // arr[small] = temp;
            int temp= arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        System.out.println("\nAfter sorting:");
        for(int x: arr) {
            System.out.print(x+ " ");
        }
    }
    public static void main(String argu[]) {
        int arr[] = { 12, 4, 56, 67, 8 };
     sort(arr);
    }
}