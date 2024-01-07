class One {

    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int l = 0; l < arr.length - 1 - i; l++) {
                if (arr[l] > arr[l + 1]) {
                    int temp = arr[l + 1];
                    arr[l + 1] = arr[l];
                    arr[l] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String argu[]) {

        int arr[] = { 1231, 54, 65, 76, 77, 4, 34, 5, 86, 90 };
        sort(arr);
       
    }
}