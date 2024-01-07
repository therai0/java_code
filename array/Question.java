// WAP to find the missing element in array;

// import java.util.Arrays;

public class Question {

    // sum of N natural number:
    void sumN(int arr[], int n) {
        // int len = arr.length;
        int sumArr = (n * (n + 1)) / 2;
        int newSum = 0;
        for (int i = 0; i < arr.length; i++) {
            newSum += arr[i];
        }
        int missing_num = sumArr - newSum;
        System.out.println("Missing number is: " + missing_num);
    }

    // hashing method
    void hashing(int arr[], int l) {
        int mis_num = 0;
        int[] newArr = new int[l];
        // initilizing the new array with 0
        for (int i = 0; i < l; i++) {
            newArr[i] = 0;
        }

        // initilizing the all the aviable value with 1
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i] - 1] = 1;
        }

        // checking the missing element in arr
        for (int i = 0; i <= arr.length; i++) {
            if (newArr[i] == 0) {
                mis_num = i + 1;
            }
        }
        System.out.println("Missing element is:" + mis_num);
    }

    void maxAndMin(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest number:" + max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number:" + min);
    }

    void movingNegativeElementToEnd() {
        int[] arr = { -1, -1, 34, 5, 76 };
        int positivIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                int temp = arr[i];
                arr[i] = arr[positivIndex];
                arr[positivIndex] = temp;
                positivIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void deleteElement(int[] arr, int l) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == l) {
                continue;
            } else {
                newArr[i] = arr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    void printDuplicate() {
        int[] arr = { 8,8,12, 2, 34, 5, 2,3,3 };
        int[] newArr = new int[arr.length / 2];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int duplicateNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == duplicateNum) {
                    newArr[position] = arr[j];
                    position++;
                }
            }
        }
        for(int i = 0; i < newArr.length; i++)
        {
            //if 
            if(newArr[i] == 0)
            {
                continue;
            }
            System.out.println(newArr[i]);
        }
    }

    public static void main(String ar[]) {
        // int arr[] = { 1, 2222, 3, 4, 6, 90 };
        Question obj = new Question();
        // int l = arr.length + 1;

        // obj.sumN(arr,l);

        // int[] slicedArr = Arrays.copyOfRange(arr, 0, 2);
        // for (int i = 0; i < slicedArr.length; i++) {
        //     System.out.print(slicedArr[i] + " ");
        // }
        // System.out.println();
        // obj.hashing(arr, l);
        // obj.maxAndMin(arr);
        // obj.movingNegativeElementToEnd();
        // obj.deleteElement(arr, 2222);
        obj.printDuplicate();
    }
}
