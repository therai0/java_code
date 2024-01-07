class Node {
    char ch;
    Node next;
    Node prev;

    Node(char c) {
        this.ch = c;
        this.next = null;
        this.prev = null;
    }
}

class convertInfixToPostFix {
    Node infix;
    Node postfix;
    Node operator;

    int sizeOfOperator() {
        int i = 1;
        Node currNode = operator;
        if (currNode == null) {
            return 0;
        } else {
            while (currNode != null) {
                i++;
                currNode = currNode.next;
            }
            return i;
        }
    }

    int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    boolean isOperator(char c) {
        return c == '/' || c == '+' || c == '*' || c == '^' || c == '-';
    }

    void pushInfix(char c) {
        Node newNode = new Node(c);
        if (infix == null) {
            infix = newNode;
            return;
        } else {
            newNode.next = infix;
            infix = newNode;
            return;
        }
    }

    void pushOperator(char c) {
        Node newNode = new Node(c);
        if (operator == null) {
            operator = newNode;
            return;
        } else {
            newNode.next = operator;
            operator = newNode;
            return;
        }
    }

    void pushPostfix(char c) {
        Node newNode = new Node(c);
        if (postfix == null) {
            postfix = newNode;
            return;
        } else {
            newNode.next = postfix;
            postfix = newNode;
            return;
        }
    }

    char popOperator() {
        if (operator == null) {
            return 0;
        } else {
            return operator.ch;
        }
    }

    void converToPostFix()
    {
        Node cuNode = infix;
        
    }

    void printPostFix()
    {
        Node cuNode = postfix;
        while(cuNode != null)
        {
            System.out.print(cuNode.ch + "-->");
            cuNode = cuNode.next;
        }
    }

    void deleteOpeerator() {
        if (operator == null) {
            return;
        } else if (operator.next == null) {
            operator = null;
            return;
        } else {
            operator = operator.next;
        }
    }

    void makeInfix(String str) {
        for (int i = 0; i < str.length(); i++) {
            pushInfix(str.charAt(i));
        }
    }
}

public class InfixToPostfixWithStack {

    public static void main(String arg[]) {
        convertInfixToPostFix obj = new convertInfixToPostFix();
        obj.makeInfix("abcde+-agf");
        obj.converToPostFix();
        obj.printPostFix();
    }
}
