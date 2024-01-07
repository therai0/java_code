
class CheckIsBalancedOrNot {
    char[] arr;
    int size;
    int front = -1;

    CheckIsBalancedOrNot(int len) {
        arr = new char[len];
        this.size = len;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return front == size;
    }

    void push(char n) {
        front++;
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        } else {
            arr[front] = n;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        } else {
            front--;
            return;
        }
    }

    char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return arr[front];
        }
    }

    boolean checkBalance(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '(') {
                push(c);
            } else {
                if(isEmpty())
                {
                    return false;
                }
                pop();
            }
        }
        if (isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

public class Balanced {

    public static void main(String arg[])
    {
        String word = ")()()()";
        CheckIsBalancedOrNot obj  = new CheckIsBalancedOrNot(word.length());
        System.out.println(obj.checkBalance(word));
    }
}
