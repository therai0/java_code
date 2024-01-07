class Demo {
    static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Before:" + n);
        printNum(n - 1);
        System.out.println("After:" + n);
    }

    public static void main(String ar[]) {
        // printNum(5);
      
    }
}