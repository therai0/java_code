class Sorting {

    public void sort(int arr[]) {

        System.out.println("Before Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        // logic for sorting
        for (int i = 1; i < arr.length; i++) {
            int small = arr[i];
            int l = i - 1;
            while (l >= 0 && small < arr[l]) {
                arr[l + 1] = arr[l];
                l--;
            }
            arr[l + 1] = small;
        }
        System.out.println("\nAfter Sorting");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}

class Question {
    public static void main(String argu[]) {

        int arr[] = { 12, 43, 5, 56, 4, 6 };

        Sorting obj = new Sorting();
        obj.sort(arr);

    }
}