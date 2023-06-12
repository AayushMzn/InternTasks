package expressionCommandPattern;

import java.util.Stack;

public class ExpressionComandDemo {
    public static void main(String[] args) {
        OperationRequest operationRequest = new OperationRequest();

        SumOperation sumOperation = new SumOperation(operationRequest);
        MinusOperation minusOperation = new MinusOperation(operationRequest);
        MultiplyOperation multiplyOperation = new MultiplyOperation(operationRequest);

        Invoker invoker = new Invoker();
//        invoker.takeRequest(sumOperation);
//        invoker.takeRequest(minusOperation);
//        invoker.takeRequest(multiplyOperation);
//
//
//        invoker.placeRequest();
        String exp1 = "{(1+1)+(1+1)}";

        Stack<Character> stack = new Stack<>();

        int result = 0, x = 0, y = 0;
        char operator = 'a';
        for (int i = 0; i < exp1.length(); i++) {

            stack.push(exp1.charAt(i));
            if (exp1.charAt(i) == '}' || exp1.charAt(i) == ']' || exp1.charAt(i) == ')') {
                stack.pop();

                x = Integer.parseInt(String.valueOf(stack.pop()));

                operator = stack.pop();

                y = Integer.parseInt(String.valueOf(stack.pop()));

                stack.pop();

                switch (operator) {
                    case '+':
                        invoker.takeRequest(sumOperation);
                        break;
                    case '-':
                        invoker.takeRequest(minusOperation);
                        break;
                    case '*':
                        invoker.takeRequest(multiplyOperation);
                        break;
                }
                invoker.placeRequest();
                stack.push(String.valueOf(result).charAt(0));
            }
        }
        System.out.println(result);
    }
}
