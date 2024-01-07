class Sorting {

    public void sort(int arr[]) {

        System.out.println("Before sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int l = i + 1; l < arr.length; l++) {
                if (arr[l] < arr[small]) {
                    small = l;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nAfter sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

public class Question {
    public static void main(String argu[]) {
        int arr[] = { 12, 4, 45, 6, 76, 7 };

        Sorting obj = new Sorting();
        obj.sort(arr);
    }
}
