public class Largest {

    public static void main(String ar[]) {
        int[] arr = { 1, 2, 32, 43, 5, 6 };
        int large = 0;
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                large = arr[i];
            }
        }
        System.out.println("The largest element in array is: " + large);
        System.out.println("The smallest element in array is: " + small);
    }
}
