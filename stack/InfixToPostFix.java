

class InfixToPostFix {
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < infixExpression.length(); i++) {
            char currentChar = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                postfix.append(currentChar);
            } else if (currentChar == '(') {
                stack.append(currentChar);
            } else if (currentChar == ')') {
                while (stack.length() > 0 && stack.charAt(stack.length() - 1) != '(') {
                    postfix.append(stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }
                stack.deleteCharAt(stack.length() - 1); // Discard '('
            } else if (isOperator(currentChar)) {
                while (stack.length() > 0 && precedence(currentChar) <= precedence(stack.charAt(stack.length() - 1))) {
                    postfix.append(stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }
                stack.append(currentChar);
            }
        }

        while (stack.length() > 0) {
            postfix.append(stack.charAt(stack.length() - 1));
            stack.deleteCharAt(stack.length() - 1);
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b-c";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
