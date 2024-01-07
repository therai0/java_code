class Eall {

    // print five number
    void printNum(int n) {
        if (n == 0) {
            return;
        }
        printNum(n - 1);
        System.out.println(n);
    }

    // print sum of first n natral number;
    void sumNum(int n, int i, int sum) {
        // int sum = 0;
        // if (n == 0) {
        // return 0;
        // } else {
        // sum += n + sumNum(n - 1);
        // System.out.println(sum);
        // return sum;
        // }
        if (i == n) {
            sum += i;
            System.out.println("Sum of N number is:" + sum);
            return;
        }
        sum += i;
        sumNum(n, i + 1, sum);
    }

    // print factorial of N number:
    void printFacto(int i, int n, int facto) {
        if (n == 0) {
            System.out.println("N cannot be 0");
            return;
        }
        if (i == n) {
            facto *= i;
            System.out.println("Factorial is: " + facto);
            return;
        }
        facto *= i;
        printFacto(i + 1, n, facto);
    }
    // printing the fibonacci series

    void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibo(b, c, n - 1);
    }

    // print x^n (stack heigh = n)
    int printN(int n, int pw) {
        if (pw == 0) {
            System.out.println("pw: " + pw);
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            int xpw = printN(n, pw - 1);
            System.out.println("pw: " + pw);
            System.out.println("xpw: " + xpw);
            int ans = n * xpw;
            return ans;
        }
    }

    // print x^n (stack heigh = log(n))
    int logN(int n, int pw) {
        if (pw == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            if (pw % 2 == 0) {
                return logN(n, pw / 2) * logN(n, pw / 2);
            } else {
                return logN(n, pw / 2) * logN(n, pw / 2) * n;
            }
        }
    }

    public static void main(String ar[]) {
        Eall obj = new Eall();
        // obj.printNum(5);
        // System.out.println(obj.sumNum(5));
        // obj.sumNum(5, 1, 0);
        // obj.printFacto(1, 5, 1);
        // obj.printFibo(0, 1, 5);
        System.out.println(obj.printN(2, 2));
        // System.out.println(obj.logN(2,100));
    }
}