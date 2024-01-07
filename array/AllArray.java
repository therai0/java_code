                    import java.util.Scanner;

public class AllArray {

    static void OneDArray(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " number of integers.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void TwoDArray(int row, int colomn) {
        int[][] arr = new int[row][colomn];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String gar[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int len = sc.nextInt();
        // OneDArray(len);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter colomn");
        int colomn = sc.nextInt();
        TwoDArray(row, colomn);
        sc.close();
    }
}
