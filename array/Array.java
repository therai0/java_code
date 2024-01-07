// this is 1D array:

import java.util.Arrays;

class OneD {
    void define_1D() {
        int[] arr = new int[5];

        arr[0] = 20;
        arr[1] = 2;
        arr[2] = 34;
        arr[3] = 1;
        arr[4] = 9;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// this is 2d array:
class TwoD {
    void define_2D() {
        int[][] arr = new int[3][2];

        // this loop is for row
        for (int i = 0; i < arr.length; i++) {
            // this loop is for colomn
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }
        // this loop is for row
        for (int i = 0; i < arr.length; i++) {
            // this loop is for colomn
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// this is the class for sorting

class Sort {
    // search
    void inbuilt_sort() {
        int arr[] = new int[] { 12, 4, 5, 6, 763, 5 };
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nAfter Sorting");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // search
    int search() {
        int arr[] = new int[] { 12, 4, 5, 6, 763, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                // System.out.println("It is located in " + i + " index.");
                return i;
            }
        }
        return -1;
    }
}

class Array {
    public static void main(String ar[]) {
        // OneD obj = new OneD();
        // obj.define_1D();
        // TwoD obj2 = new TwoD();
        // obj2.define_2D();

        Sort s = new Sort();
        // s.inbuilt_sort();
      int n = s.search();
      if(n == -1)
      {
        System.out.println("Not aviable in array");
      } else {
        System.out.println("Is aviable in "+ n + " index.");
      }
    }
}