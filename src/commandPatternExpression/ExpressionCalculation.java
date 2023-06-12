package commandPatternExpression;

import java.util.Stack;

//import static commandPatternExpression.Invoker.getClasses;

public class ExpressionCalculation {
    public static void main(String[] args) throws Exception {
        Invoker invoker = new Invoker();

        String exp1 = "{(1+1)+(1+1)}";

        Stack<Character> stack = new Stack<>();

        int result = 0, x = 0, y = 0;
        char operator = 'a';
        for (int i = 0; i < exp1.length(); i++) {


            if (exp1.charAt(i) == '}' || exp1.charAt(i) == ']' || exp1.charAt(i) == ')') {

                x = Integer.parseInt(String.valueOf(stack.pop()));

                operator = stack.pop();

                y = Integer.parseInt(String.valueOf(stack.pop()));
                stack.pop();

                result = invoker.takeRequest(y, operator, x);

//                System.out.println(getClasses(Mainclass.class.getClassLoader(),""));

                stack.push(String.valueOf(result).charAt(0));
            } else {
                stack.push(exp1.charAt(i));
            }
        }
        System.out.println(result);
    }
}

