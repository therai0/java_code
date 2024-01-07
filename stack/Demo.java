import java.util.Scanner;

public class Demo {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '/' || c == '*';
    }

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    static String infixToPost(String infixExp) {
        StringBuilder letter = new StringBuilder();
        StringBuilder operat = new StringBuilder();
        for (int i = 0; i < infixExp.length(); i++) {
            char curr = infixExp.charAt(i);
            if (Character.isLetterOrDigit(curr)) {
                letter.append(curr);
            } else if (curr == '(') {
                operat.append(curr);
            } else if (curr == ')') {
                while (operat.length() > 0 && operat.charAt(operat.length() - 1) != '(') {
                    letter.append(operat.charAt(operat.length() - 1));
                    operat.deleteCharAt(operat.length() - 1);
                }
                operat.deleteCharAt(operat.length() - 1);
            } else if (isOperator(curr)) {
                while (operat.length() > 0 && precedence(curr) <= precedence(operat.charAt(operat.length() - 1))) {
                    letter.append(operat.charAt(operat.length() - 1));
                    operat.deleteCharAt(operat.length() - 1);
                }
                operat.append(curr);
            }
        }
        while (operat.length() > 0) {
            letter.append(operat.charAt(operat.length() - 1));
            operat.deleteCharAt(operat.length() - 1);
        }
        return letter.toString();
    }

    public static void main(String arg[]) {
        // String data = "a+b-c(d+e-f)*g+h"; 
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the input");
              String data = sc.nextLine();

        System.out.println(infixToPost(data));
    }
}
